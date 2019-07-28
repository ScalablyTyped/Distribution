package typings.terminalDashKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleColumnMenuResponse extends js.Object {
  var canceled: Boolean
  var selectedIndex: Double
  var selectedText: String
  var submitted: Boolean
  var unexpectedKey: String
  var x: Double
  var y: Double
}

object SingleColumnMenuResponse {
  @scala.inline
  def apply(
    canceled: Boolean,
    selectedIndex: Double,
    selectedText: String,
    submitted: Boolean,
    unexpectedKey: String,
    x: Double,
    y: Double
  ): SingleColumnMenuResponse = {
    val __obj = js.Dynamic.literal(canceled = canceled, selectedIndex = selectedIndex, selectedText = selectedText, submitted = submitted, unexpectedKey = unexpectedKey, x = x, y = y)
  
    __obj.asInstanceOf[SingleColumnMenuResponse]
  }
}

