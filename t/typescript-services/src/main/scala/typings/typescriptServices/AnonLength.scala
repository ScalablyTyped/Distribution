package typings.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var length: Double
  var lineStarts: js.Array[Double]
}

object AnonLength {
  @scala.inline
  def apply(length: Double, lineStarts: js.Array[Double]): AnonLength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], lineStarts = lineStarts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLength]
  }
}

