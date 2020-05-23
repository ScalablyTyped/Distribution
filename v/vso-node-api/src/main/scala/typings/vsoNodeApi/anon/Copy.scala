package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Copy extends js.Object {
  var add: scala.Double
  var copy: scala.Double
  var move: scala.Double
  var remove: scala.Double
  var replace: scala.Double
  var test: scala.Double
}

object Copy {
  @scala.inline
  def apply(
    add: scala.Double,
    copy: scala.Double,
    move: scala.Double,
    remove: scala.Double,
    replace: scala.Double,
    test: scala.Double
  ): Copy = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copy]
  }
}

