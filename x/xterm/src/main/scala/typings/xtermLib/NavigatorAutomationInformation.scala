package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorAutomationInformation extends js.Object {
  val webdriver: scala.Boolean
}

object NavigatorAutomationInformation {
  @scala.inline
  def apply(webdriver: scala.Boolean): NavigatorAutomationInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("webdriver")(webdriver)
    __obj.asInstanceOf[NavigatorAutomationInformation]
  }
}

