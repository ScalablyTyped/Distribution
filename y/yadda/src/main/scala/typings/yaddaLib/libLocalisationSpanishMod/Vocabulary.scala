package typings
package yaddaLib.libLocalisationSpanishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vocabulary
  extends yaddaLib.libLocalisationEnglishMod.Vocabulary {
  var cuando: java.lang.String
  var dada: java.lang.String
  var dadas: java.lang.String
  var dado: java.lang.String
  var dados: java.lang.String
  var entonces: java.lang.String
  var sea: java.lang.String
  var sean: java.lang.String
  var si: java.lang.String
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[java.lang.String],
    background: java.lang.String,
    cuando: java.lang.String,
    dada: java.lang.String,
    dadas: java.lang.String,
    dado: java.lang.String,
    dados: java.lang.String,
    entonces: java.lang.String,
    examples: java.lang.String,
    feature: java.lang.String,
    given: java.lang.String,
    only: java.lang.String,
    pending: java.lang.String,
    scenario: java.lang.String,
    sea: java.lang.String,
    sean: java.lang.String,
    si: java.lang.String,
    `then`: java.lang.String,
    when: java.lang.String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps, background = background, cuando = cuando, dada = dada, dadas = dadas, dado = dado, dados = dados, entonces = entonces, examples = examples, feature = feature, given = given, only = only, pending = pending, scenario = scenario, sea = sea, sean = sean, si = si, when = when)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Vocabulary]
  }
}

