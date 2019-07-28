package typings.yadda.libLocalisationFrenchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends typings.yadda.libLocalisationEnglishMod.Vocabulary {
  var alors: String
  var etantdonnalors: String
  var etantdonnalorss: String
  var etantdonne: String
  var lorsque: String
  var quand: String
  var soit: String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    alors: String,
    background: String,
    etantdonnalors: String,
    etantdonnalorss: String,
    etantdonne: String,
    examples: String,
    feature: String,
    given: String,
    lorsque: String,
    only: String,
    pending: String,
    quand: String,
    scenario: String,
    soit: String,
    `then`: String,
    when: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, alors = alors, background = background, etantdonnalors = etantdonnalors, etantdonnalorss = etantdonnalorss, etantdonne = etantdonne, examples = examples, feature = feature, given = given, lorsque = lorsque, only = only, pending = pending, quand = quand, scenario = scenario, soit = soit, when = when)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

