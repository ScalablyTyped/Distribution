package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRuleFailurePositionJson extends js.Object {
  var character: scala.Double
  var line: scala.Double
  var position: scala.Double
}

object IRuleFailurePositionJson {
  @scala.inline
  def apply(character: scala.Double, line: scala.Double, position: scala.Double): IRuleFailurePositionJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("character")(character)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[IRuleFailurePositionJson]
  }
}

