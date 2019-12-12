package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder.Asc
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder.Desc
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentSortOrder with Double] = js.native
  /* 1 */ @js.native
  object Asc extends TopLevel[Asc with Double]
  
  /* 2 */ @js.native
  object Desc extends TopLevel[Desc with Double]
  
}

