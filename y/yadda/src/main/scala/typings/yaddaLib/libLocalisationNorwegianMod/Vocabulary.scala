package typings
package yaddaLib.libLocalisationNorwegianMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends yaddaLib.libLocalisationEnglishMod.Vocabulary {
  var gitt: java.lang.String
  var når: java.lang.String
  var så: java.lang.String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[java.lang.String],
    background: java.lang.String,
    examples: java.lang.String,
    feature: java.lang.String,
    gitt: java.lang.String,
    given: java.lang.String,
    når: java.lang.String,
    only: java.lang.String,
    pending: java.lang.String,
    scenario: java.lang.String,
    så: java.lang.String,
    `then`: java.lang.String,
    when: java.lang.String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, examples = examples, feature = feature, gitt = gitt, given = given, når = når, only = only, pending = pending, scenario = scenario, så = så, when = when)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

