package typings.terminalKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleLineMenuResponse extends js.Object {
  var canceled: Boolean
  var selectedIndex: Double
  var selectedText: String
  var unexpectedKey: String
  var x: Double
  var y: Double
}

object SingleLineMenuResponse {
  @scala.inline
  def apply(
    canceled: Boolean,
    selectedIndex: Double,
    selectedText: String,
    unexpectedKey: String,
    x: Double,
    y: Double
  ): SingleLineMenuResponse = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedText = selectedText.asInstanceOf[js.Any], unexpectedKey = unexpectedKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SingleLineMenuResponse]
  }
}

