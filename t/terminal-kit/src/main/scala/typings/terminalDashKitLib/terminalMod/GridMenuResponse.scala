package typings
package terminalDashKitLib.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridMenuResponse extends js.Object {
  var selectedIndex: scala.Double
  var selectedText: java.lang.String
  var unexpectedKey: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object GridMenuResponse {
  @scala.inline
  def apply(
    selectedIndex: scala.Double,
    selectedText: java.lang.String,
    unexpectedKey: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): GridMenuResponse = {
    val __obj = js.Dynamic.literal(selectedIndex = selectedIndex, selectedText = selectedText, unexpectedKey = unexpectedKey, x = x, y = y)
  
    __obj.asInstanceOf[GridMenuResponse]
  }
}

