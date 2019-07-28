package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommentSortOrder extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "CommentSortOrder")
@js.native
object CommentSortOrder extends js.Object {
  @js.native
  sealed trait Asc extends CommentSortOrder
  
  @js.native
  sealed trait Desc extends CommentSortOrder
  
  /* 1 */ val Asc: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder.Asc with Double = js.native
  /* 2 */ val Desc: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder.Desc with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentSortOrder with Double] = js.native
}

