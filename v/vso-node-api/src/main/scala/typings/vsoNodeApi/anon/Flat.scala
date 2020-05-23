package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flat extends js.Object {
  var flat: scala.Double
  var oneHop: scala.Double
  var tree: scala.Double
}

object Flat {
  @scala.inline
  def apply(flat: scala.Double, oneHop: scala.Double, tree: scala.Double): Flat = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], oneHop = oneHop.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flat]
  }
}

