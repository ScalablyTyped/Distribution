package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentSortOrder extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "CommentSortOrder")
@js.native
object CommentSortOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentSortOrder with Double] = js.native
  
  @js.native
  sealed trait Asc extends CommentSortOrder
  /* 1 */ @js.native
  object Asc extends TopLevel[Asc with Double]
  
  @js.native
  sealed trait Desc extends CommentSortOrder
  /* 2 */ @js.native
  object Desc extends TopLevel[Desc with Double]
}
