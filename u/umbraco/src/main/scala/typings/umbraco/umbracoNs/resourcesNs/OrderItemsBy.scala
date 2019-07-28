package typings.umbraco.umbracoNs.resourcesNs

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
  
  /* 0 */ val SortOrder: typings.umbraco.umbracoNs.resourcesNs.OrderItemsBy.SortOrder with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OrderItemsBy with Double] = js.native
}

