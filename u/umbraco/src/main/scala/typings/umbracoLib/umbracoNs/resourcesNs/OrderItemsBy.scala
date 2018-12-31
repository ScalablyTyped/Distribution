package typings
package umbracoLib.umbracoNs.resourcesNs

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
  sealed trait SortOrder
    extends umbracoLib.umbracoNs.resourcesNs.OrderItemsBy
  
  val SortOrder: SortOrder with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.OrderItemsBy with java.lang.String] = js.native
}

