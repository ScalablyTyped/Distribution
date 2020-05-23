package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array extends js.Object {
  var array: js.Array[Double]
  var itemSize: Double
  var normalized: Boolean
  var `type`: String
}

object Array {
  @scala.inline
  def apply(array: js.Array[Double], itemSize: Double, normalized: Boolean, `type`: String): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
}

