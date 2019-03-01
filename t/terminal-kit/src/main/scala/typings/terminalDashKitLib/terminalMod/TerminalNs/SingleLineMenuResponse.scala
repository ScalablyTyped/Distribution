package typings
package terminalDashKitLib.terminalMod.TerminalNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canceled")(canceled)
    __obj.updateDynamic("selectedIndex")(selectedIndex)
    __obj.updateDynamic("selectedText")(selectedText)
    __obj.updateDynamic("unexpectedKey")(unexpectedKey)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[SingleLineMenuResponse]
  }
}

