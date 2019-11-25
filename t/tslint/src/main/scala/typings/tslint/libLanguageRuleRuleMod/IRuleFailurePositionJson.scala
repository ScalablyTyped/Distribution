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
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRuleFailurePositionJson]
  }
}

