package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentSortOrder extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "CommentSortOrder")
@js.native
object CommentSortOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentSortOrder with Double] = js.native
  
  @js.native
  sealed trait Asc extends CommentSortOrder
  /* 1 */ val Asc: typings.vsoNodeApi.workItemTrackingInterfacesMod.CommentSortOrder.Asc with Double = js.native
  
  @js.native
  sealed trait Desc extends CommentSortOrder
  /* 2 */ val Desc: typings.vsoNodeApi.workItemTrackingInterfacesMod.CommentSortOrder.Desc with Double = js.native
}
