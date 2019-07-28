package typings.yadda.libLocalisationPolishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends typings.yadda.libLocalisationEnglishMod.Vocabulary {
  var gdy: String
  var jesli: String
  var jezeli: String
  var kiedy: String
  var majac: String
  var wtedy: String
  var zakladajac: String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    examples: String,
    feature: String,
    gdy: String,
    given: String,
    jesli: String,
    jezeli: String,
    kiedy: String,
    majac: String,
    only: String,
    pending: String,
    scenario: String,
    `then`: String,
    when: String,
    wtedy: String,
    zakladajac: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, examples = examples, feature = feature, gdy = gdy, given = given, jesli = jesli, jezeli = jezeli, kiedy = kiedy, majac = majac, only = only, pending = pending, scenario = scenario, when = when, wtedy = wtedy, zakladajac = zakladajac)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

