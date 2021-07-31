package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetBehaviorsExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetBehaviorsExpand")
@js.native
object GetBehaviorsExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetBehaviorsExpand & Double] = js.native
  
  @js.native
  sealed trait Fields
    extends StObject
       with GetBehaviorsExpand
  /* 1 */ val Fields: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.GetBehaviorsExpand.Fields & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with GetBehaviorsExpand
  /* 0 */ val None: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.GetBehaviorsExpand.None & Double = js.native
}
