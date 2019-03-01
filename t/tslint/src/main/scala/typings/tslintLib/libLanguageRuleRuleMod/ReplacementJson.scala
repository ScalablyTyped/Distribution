package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplacementJson extends js.Object {
  var innerLength: scala.Double
  var innerStart: scala.Double
  var innerText: java.lang.String
}

object ReplacementJson {
  @scala.inline
  def apply(innerLength: scala.Double, innerStart: scala.Double, innerText: java.lang.String): ReplacementJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("innerLength")(innerLength)
    __obj.updateDynamic("innerStart")(innerStart)
    __obj.updateDynamic("innerText")(innerText)
    __obj.asInstanceOf[ReplacementJson]
  }
}

