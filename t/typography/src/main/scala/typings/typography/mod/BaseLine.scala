package typings.typography.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLine extends js.Object {
  var fontSize: String
  var lineHeight: String
}

object BaseLine {
  @scala.inline
  def apply(fontSize: String, lineHeight: String): BaseLine = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLine]
  }
}

