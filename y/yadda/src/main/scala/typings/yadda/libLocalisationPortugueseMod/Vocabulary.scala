package typings.yadda.libLocalisationPortugueseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends typings.yadda.libLocalisationEnglishMod.Vocabulary {
  var dada: String
  var dadas: String
  var dado: String
  var dados: String
  var entao: String
  var quando: String
  var se: String
  var seja: String
  var sejam: String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    dada: String,
    dadas: String,
    dado: String,
    dados: String,
    entao: String,
    examples: String,
    feature: String,
    given: String,
    only: String,
    pending: String,
    quando: String,
    scenario: String,
    se: String,
    seja: String,
    sejam: String,
    `then`: String,
    when: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, dada = dada, dadas = dadas, dado = dado, dados = dados, entao = entao, examples = examples, feature = feature, given = given, only = only, pending = pending, quando = quando, scenario = scenario, se = se, seja = seja, sejam = sejam, when = when)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

