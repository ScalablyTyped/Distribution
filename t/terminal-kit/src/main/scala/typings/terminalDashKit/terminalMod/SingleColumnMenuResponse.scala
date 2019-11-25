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
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedText = selectedText.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], unexpectedKey = unexpectedKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SingleColumnMenuResponse]
  }
}

