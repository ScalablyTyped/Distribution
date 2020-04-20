package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlat extends js.Object {
  var flat: Double
  var oneHop: Double
  var tree: Double
}

object AnonFlat {
  @scala.inline
  def apply(flat: Double, oneHop: Double, tree: Double): AnonFlat = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], oneHop = oneHop.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlat]
  }
}

