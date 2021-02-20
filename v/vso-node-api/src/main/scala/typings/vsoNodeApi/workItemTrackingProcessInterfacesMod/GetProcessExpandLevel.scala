package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetProcessExpandLevel extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetProcessExpandLevel")
@js.native
object GetProcessExpandLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetProcessExpandLevel with Double] = js.native
  
  @js.native
  sealed trait None extends GetProcessExpandLevel
  /* 0 */ val None: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.GetProcessExpandLevel.None with Double = js.native
  
  @js.native
  sealed trait Projects extends GetProcessExpandLevel
  /* 1 */ val Projects: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.GetProcessExpandLevel.Projects with Double = js.native
}
