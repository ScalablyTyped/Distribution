package typings.yadda.libLocalisationNorwegianMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends typings.yadda.libLocalisationEnglishMod.Vocabulary {
  var gitt: String
  var når: String
  var så: String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    examples: String,
    feature: String,
    gitt: String,
    given: String,
    når: String,
    only: String,
    pending: String,
    scenario: String,
    så: String,
    `then`: String,
    when: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, examples = examples, feature = feature, gitt = gitt, given = given, når = når, only = only, pending = pending, scenario = scenario, så = så, when = when)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

