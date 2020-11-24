package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetWorkItemTypeExpand extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessDefinitionsInterfaces", "GetWorkItemTypeExpand")
@js.native
object GetWorkItemTypeExpand extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetWorkItemTypeExpand with Double] = js.native
  
  @js.native
  sealed trait Behaviors extends GetWorkItemTypeExpand
  /* 2 */ @js.native
  object Behaviors extends TopLevel[Behaviors with Double]
  
  @js.native
  sealed trait Layout extends GetWorkItemTypeExpand
  /* 4 */ @js.native
  object Layout extends TopLevel[Layout with Double]
  
  @js.native
  sealed trait None extends GetWorkItemTypeExpand
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait States extends GetWorkItemTypeExpand
  /* 1 */ @js.native
  object States extends TopLevel[States with Double]
}
