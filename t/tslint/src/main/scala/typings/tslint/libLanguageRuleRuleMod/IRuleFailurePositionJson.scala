package typings.tslint.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRuleFailurePositionJson extends js.Object {
  var character: Double
  var line: Double
  var position: Double
}

object IRuleFailurePositionJson {
  @scala.inline
  def apply(character: Double, line: Double, position: Double): IRuleFailurePositionJson = {
    val __obj = js.Dynamic.literal(character = character, line = line, position = position)
  
    __obj.asInstanceOf[IRuleFailurePositionJson]
  }
}

