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
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], dada = dada.asInstanceOf[js.Any], dadas = dadas.asInstanceOf[js.Any], dado = dado.asInstanceOf[js.Any], dados = dados.asInstanceOf[js.Any], entao = entao.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], quando = quando.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], seja = seja.asInstanceOf[js.Any], sejam = sejam.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vocabulary]
  }
}

