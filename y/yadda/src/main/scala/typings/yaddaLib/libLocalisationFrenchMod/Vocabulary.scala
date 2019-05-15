package typings
package yaddaLib.libLocalisationFrenchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends yaddaLib.libLocalisationEnglishMod.Vocabulary {
  var alors: java.lang.String
  var etantdonnalors: java.lang.String
  var etantdonnalorss: java.lang.String
  var etantdonne: java.lang.String
  var lorsque: java.lang.String
  var quand: java.lang.String
  var soit: java.lang.String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[java.lang.String],
    alors: java.lang.String,
    background: java.lang.String,
    etantdonnalors: java.lang.String,
    etantdonnalorss: java.lang.String,
    etantdonne: java.lang.String,
    examples: java.lang.String,
    feature: java.lang.String,
    given: java.lang.String,
    lorsque: java.lang.String,
    only: java.lang.String,
    pending: java.lang.String,
    quand: java.lang.String,
    scenario: java.lang.String,
    soit: java.lang.String,
    `then`: java.lang.String,
    when: java.lang.String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, alors = alors, background = background, etantdonnalors = etantdonnalors, etantdonnalorss = etantdonnalorss, etantdonne = etantdonne, examples = examples, feature = feature, given = given, lorsque = lorsque, only = only, pending = pending, quand = quand, scenario = scenario, soit = soit, when = when)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

