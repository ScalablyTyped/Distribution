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
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, cuando = cuando, dada = dada, dadas = dadas, dado = dado, dados = dados, entonces = entonces, examples = examples, feature = feature, given = given, only = only, pending = pending, scenario = scenario, sea = sea, sean = sean, si = si, when = when)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

