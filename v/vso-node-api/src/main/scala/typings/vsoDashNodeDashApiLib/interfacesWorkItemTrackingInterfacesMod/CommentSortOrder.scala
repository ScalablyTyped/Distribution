package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommentSortOrder extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "CommentSortOrder")
@js.native
object CommentSortOrder extends js.Object {
  @js.native
  sealed trait Asc
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder
  
  @js.native
  sealed trait Desc
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder
  
  /* 1 */ val Asc: Asc with scala.Double = js.native
  /* 2 */ val Desc: Desc with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder with scala.Double
  ] = js.native
}

