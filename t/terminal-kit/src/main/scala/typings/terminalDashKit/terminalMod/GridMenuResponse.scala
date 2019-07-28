package typings.terminalDashKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridMenuResponse extends js.Object {
  var selectedIndex: Double
  var selectedText: String
  var unexpectedKey: String
  var x: Double
  var y: Double
}

object GridMenuResponse {
  @scala.inline
  def apply(selectedIndex: Double, selectedText: String, unexpectedKey: String, x: Double, y: Double): GridMenuResponse = {
    val __obj = js.Dynamic.literal(selectedIndex = selectedIndex, selectedText = selectedText, unexpectedKey = unexpectedKey, x = x, y = y)
  
    __obj.asInstanceOf[GridMenuResponse]
  }
}

