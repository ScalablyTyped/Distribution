package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod.SortOrder
import typings.vegaDashTypings.typesSpecScaleMod._SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Order extends _SortField {
  var order: SortOrder
}

object Anon_Order {
  @scala.inline
  def apply(order: SortOrder): Anon_Order = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Order]
  }
}

