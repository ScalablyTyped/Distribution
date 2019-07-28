package typings.yadda.libLocalisationEnglishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends typings.yadda.libLocalisationLanguageMod.Vocabulary {
  var background: String
  var examples: String
  var feature: String
  var given: String
  var only: String
  var pending: String
  var scenario: String
  var `then`: String
  var when: String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    examples: String,
    feature: String,
    given: String,
    only: String,
    pending: String,
    scenario: String,
    `then`: String,
    when: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, examples = examples, feature = feature, given = given, only = only, pending = pending, scenario = scenario, when = when)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

