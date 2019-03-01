package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisabledInterval extends js.Object {
  var endPosition: scala.Double
  var startPosition: scala.Double
}

object IDisabledInterval {
  @scala.inline
  def apply(endPosition: scala.Double, startPosition: scala.Double): IDisabledInterval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endPosition")(endPosition)
    __obj.updateDynamic("startPosition")(startPosition)
    __obj.asInstanceOf[IDisabledInterval]
  }
}

