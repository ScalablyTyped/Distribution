package typings.yadda.frenchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends typings.yadda.englishMod.Vocabulary {
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
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], alors = alors.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], etantdonnalors = etantdonnalors.asInstanceOf[js.Any], etantdonnalorss = etantdonnalorss.asInstanceOf[js.Any], etantdonne = etantdonne.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], lorsque = lorsque.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], quand = quand.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], soit = soit.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vocabulary]
  }
}

