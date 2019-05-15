package typings
package yaddaLib.libLocalisationEnglishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends yaddaLib.libLocalisationLanguageMod.Vocabulary {
  var background: java.lang.String
  var examples: java.lang.String
  var feature: java.lang.String
  var given: java.lang.String
  var only: java.lang.String
  var pending: java.lang.String
  var scenario: java.lang.String
  var `then`: java.lang.String
  var when: java.lang.String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[java.lang.String],
    background: java.lang.String,
    examples: java.lang.String,
    feature: java.lang.String,
    given: java.lang.String,
    only: java.lang.String,
    pending: java.lang.String,
    scenario: java.lang.String,
    `then`: java.lang.String,
    when: java.lang.String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, examples = examples, feature = feature, given = given, only = only, pending = pending, scenario = scenario, when = when)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

