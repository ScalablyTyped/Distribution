package typings.umbraco.umbraco.resources

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
  
}

