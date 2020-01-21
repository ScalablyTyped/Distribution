package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetWorkItemTypeExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessDefinitionsInterfaces", "GetWorkItemTypeExpand")
@js.native
object GetWorkItemTypeExpand extends js.Object {
  @js.native
  sealed trait Behaviors extends GetWorkItemTypeExpand
  
  @js.native
  sealed trait Layout extends GetWorkItemTypeExpand
  
  @js.native
  sealed trait None extends GetWorkItemTypeExpand
  
  @js.native
  sealed trait States extends GetWorkItemTypeExpand
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetWorkItemTypeExpand with Double] = js.native
  /* 2 */ @js.native
  object Behaviors extends TopLevel[Behaviors with Double]
  
  /* 4 */ @js.native
  object Layout extends TopLevel[Layout with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object States extends TopLevel[States with Double]
  
}

