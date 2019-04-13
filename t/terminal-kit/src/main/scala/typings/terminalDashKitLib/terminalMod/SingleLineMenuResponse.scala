package typings
package terminalDashKitLib.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleLineMenuResponse extends js.Object {
  var canceled: scala.Boolean
  var selectedIndex: scala.Double
  var selectedText: java.lang.String
  var unexpectedKey: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object SingleLineMenuResponse {
  @scala.inline
  def apply(
    canceled: scala.Boolean,
    selectedIndex: scala.Double,
    selectedText: java.lang.String,
    unexpectedKey: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): SingleLineMenuResponse = {
    val __obj = js.Dynamic.literal(canceled = canceled, selectedIndex = selectedIndex, selectedText = selectedText, unexpectedKey = unexpectedKey, x = x, y = y)
  
    __obj.asInstanceOf[SingleLineMenuResponse]
  }
}

