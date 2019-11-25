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
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], gdy = gdy.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], jesli = jesli.asInstanceOf[js.Any], jezeli = jezeli.asInstanceOf[js.Any], kiedy = kiedy.asInstanceOf[js.Any], majac = majac.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any], wtedy = wtedy.asInstanceOf[js.Any], zakladajac = zakladajac.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vocabulary]
  }
}

