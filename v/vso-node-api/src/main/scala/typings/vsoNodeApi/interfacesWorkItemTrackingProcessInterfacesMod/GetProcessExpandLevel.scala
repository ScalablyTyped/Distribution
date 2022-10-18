package typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetProcessExpandLevel extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetProcessExpandLevel")
@js.native
object GetProcessExpandLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetProcessExpandLevel & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with GetProcessExpandLevel
  /* 0 */ val None: typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.GetProcessExpandLevel.None & Double = js.native
  
  @js.native
  sealed trait Projects
    extends StObject
       with GetProcessExpandLevel
  /* 1 */ val Projects: typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.GetProcessExpandLevel.Projects & Double = js.native
}
