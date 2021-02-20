package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetWorkItemTypeExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetWorkItemTypeExpand")
@js.native
object GetWorkItemTypeExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetWorkItemTypeExpand with Double] = js.native
  
  @js.native
  sealed trait Behaviors extends GetWorkItemTypeExpand
  /* 2 */ val Behaviors: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand.Behaviors with Double = js.native
  
  @js.native
  sealed trait Layout extends GetWorkItemTypeExpand
  /* 4 */ val Layout: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand.Layout with Double = js.native
  
  @js.native
  sealed trait None extends GetWorkItemTypeExpand
  /* 0 */ val None: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand.None with Double = js.native
  
  @js.native
  sealed trait States extends GetWorkItemTypeExpand
  /* 1 */ val States: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand.States with Double = js.native
}
