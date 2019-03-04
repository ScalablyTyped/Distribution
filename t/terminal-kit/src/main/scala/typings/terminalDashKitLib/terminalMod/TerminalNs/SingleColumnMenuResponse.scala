package typings
package terminalDashKitLib.terminalMod.TerminalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleColumnMenuResponse extends js.Object {
  var canceled: scala.Boolean
  var selectedIndex: scala.Double
  var selectedText: java.lang.String
  var submitted: scala.Boolean
  var unexpectedKey: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object SingleColumnMenuResponse {
  @scala.inline
  def apply(
    canceled: scala.Boolean,
    selectedIndex: scala.Double,
    selectedText: java.lang.String,
    submitted: scala.Boolean,
    unexpectedKey: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): SingleColumnMenuResponse = {
    val __obj = js.Dynamic.literal(canceled = canceled, selectedIndex = selectedIndex, selectedText = selectedText, submitted = submitted, unexpectedKey = unexpectedKey, x = x, y = y)
  
    __obj.asInstanceOf[SingleColumnMenuResponse]
  }
}

