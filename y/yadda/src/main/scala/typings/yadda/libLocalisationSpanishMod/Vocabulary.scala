package typings.yadda.libLocalisationSpanishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends typings.yadda.libLocalisationEnglishMod.Vocabulary {
  var cuando: String
  var dada: String
  var dadas: String
  var dado: String
  var dados: String
  var entonces: String
  var sea: String
  var sean: String
  var si: String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    cuando: String,
    dada: String,
    dadas: String,
    dado: String,
    dados: String,
    entonces: String,
    examples: String,
    feature: String,
    given: String,
    only: String,
    pending: String,
    scenario: String,
    sea: String,
    sean: String,
    si: String,
    `then`: String,
    when: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], cuando = cuando.asInstanceOf[js.Any], dada = dada.asInstanceOf[js.Any], dadas = dadas.asInstanceOf[js.Any], dado = dado.asInstanceOf[js.Any], dados = dados.asInstanceOf[js.Any], entonces = entonces.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], sea = sea.asInstanceOf[js.Any], sean = sean.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vocabulary]
  }
}

