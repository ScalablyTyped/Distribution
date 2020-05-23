package typings.typescriptServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: Double
  var lineStarts: js.Array[Double]
}

object Length {
  @scala.inline
  def apply(length: Double, lineStarts: js.Array[Double]): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], lineStarts = lineStarts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

