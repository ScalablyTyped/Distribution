package typings
package yaddaLib.libLocalisationPolishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends yaddaLib.libLocalisationEnglishMod.Vocabulary {
  var gdy: java.lang.String
  var jesli: java.lang.String
  var jezeli: java.lang.String
  var kiedy: java.lang.String
  var majac: java.lang.String
  var wtedy: java.lang.String
  var zakladajac: java.lang.String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[java.lang.String],
    background: java.lang.String,
    examples: java.lang.String,
    feature: java.lang.String,
    gdy: java.lang.String,
    given: java.lang.String,
    jesli: java.lang.String,
    jezeli: java.lang.String,
    kiedy: java.lang.String,
    majac: java.lang.String,
    only: java.lang.String,
    pending: java.lang.String,
    scenario: java.lang.String,
    `then`: java.lang.String,
    when: java.lang.String,
    wtedy: java.lang.String,
    zakladajac: java.lang.String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, examples = examples, feature = feature, gdy = gdy, given = given, jesli = jesli, jezeli = jezeli, kiedy = kiedy, majac = majac, only = only, pending = pending, scenario = scenario, when = when, wtedy = wtedy, zakladajac = zakladajac)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

