package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetWorkItemTypeExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessDefinitionsInterfaces", "GetWorkItemTypeExpand")
@js.native
object GetWorkItemTypeExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetWorkItemTypeExpand & Double] = js.native
  
  @js.native
  sealed trait Behaviors
    extends StObject
       with GetWorkItemTypeExpand
  /* 2 */ val Behaviors: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.GetWorkItemTypeExpand.Behaviors & Double = js.native
  
  @js.native
  sealed trait Layout
    extends StObject
       with GetWorkItemTypeExpand
  /* 4 */ val Layout: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.GetWorkItemTypeExpand.Layout & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with GetWorkItemTypeExpand
  /* 0 */ val None: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.GetWorkItemTypeExpand.None & Double = js.native
  
  @js.native
  sealed trait States
    extends StObject
       with GetWorkItemTypeExpand
  /* 1 */ val States: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.GetWorkItemTypeExpand.States & Double = js.native
}
