package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.TopLevel
import typings.umbraco.umbraco.resources.OrderItemsBy.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrderItemsBy extends js.Object

/**
  * Property to order items by, default: `SortOrder`
  */
@JSGlobal("umbraco.resources.OrderItemsBy")
@js.native
object OrderItemsBy extends js.Object {
  @js.native
  sealed trait SortOrder extends OrderItemsBy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OrderItemsBy with Double] = js.native
  /* 0 */ @js.native
  object SortOrder extends TopLevel[SortOrder with Double]
  
}

