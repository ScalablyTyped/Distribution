package typings.yadda.libLocalisationPirateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends typings.yadda.libLocalisationEnglishMod.Vocabulary {
  var giveth: String
  var thence: String
  var whence: String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    examples: String,
    feature: String,
    given: String,
    giveth: String,
    only: String,
    pending: String,
    scenario: String,
    `then`: String,
    thence: String,
    when: String,
    whence: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, examples = examples, feature = feature, given = given, giveth = giveth, only = only, pending = pending, scenario = scenario, thence = thence, when = when, whence = whence)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

