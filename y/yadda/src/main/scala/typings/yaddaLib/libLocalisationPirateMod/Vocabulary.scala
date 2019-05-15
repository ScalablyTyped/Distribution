package typings
package yaddaLib.libLocalisationPirateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends yaddaLib.libLocalisationEnglishMod.Vocabulary {
  var giveth: java.lang.String
  var thence: java.lang.String
  var whence: java.lang.String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[java.lang.String],
    background: java.lang.String,
    examples: java.lang.String,
    feature: java.lang.String,
    given: java.lang.String,
    giveth: java.lang.String,
    only: java.lang.String,
    pending: java.lang.String,
    scenario: java.lang.String,
    `then`: java.lang.String,
    thence: java.lang.String,
    when: java.lang.String,
    whence: java.lang.String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, examples = examples, feature = feature, given = given, giveth = giveth, only = only, pending = pending, scenario = scenario, thence = thence, when = when, whence = whence)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

