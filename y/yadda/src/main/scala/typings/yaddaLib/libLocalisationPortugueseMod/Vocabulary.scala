package typings
package yaddaLib.libLocalisationPortugueseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends yaddaLib.libLocalisationEnglishMod.Vocabulary {
  var dada: java.lang.String
  var dadas: java.lang.String
  var dado: java.lang.String
  var dados: java.lang.String
  var entao: java.lang.String
  var quando: java.lang.String
  var se: java.lang.String
  var seja: java.lang.String
  var sejam: java.lang.String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[java.lang.String],
    background: java.lang.String,
    dada: java.lang.String,
    dadas: java.lang.String,
    dado: java.lang.String,
    dados: java.lang.String,
    entao: java.lang.String,
    examples: java.lang.String,
    feature: java.lang.String,
    given: java.lang.String,
    only: java.lang.String,
    pending: java.lang.String,
    quando: java.lang.String,
    scenario: java.lang.String,
    se: java.lang.String,
    seja: java.lang.String,
    sejam: java.lang.String,
    `then`: java.lang.String,
    when: java.lang.String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, dada = dada, dadas = dadas, dado = dado, dados = dados, entao = entao, examples = examples, feature = feature, given = given, only = only, pending = pending, quando = quando, scenario = scenario, se = se, seja = seja, sejam = sejam, when = when)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

