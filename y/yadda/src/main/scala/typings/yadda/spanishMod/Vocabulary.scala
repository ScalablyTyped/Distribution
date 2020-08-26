package typings.yadda.spanishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vocabulary
  extends typings.yadda.englishMod.Vocabulary {
  var cuando: String = js.native
  var dada: String = js.native
  var dadas: String = js.native
  var dado: String = js.native
  var dados: String = js.native
  var entonces: String = js.native
  var sea: String = js.native
  var sean: String = js.native
  var si: String = js.native
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
  @scala.inline
  implicit class VocabularyOps[Self <: Vocabulary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCuando(value: String): Self = this.set("cuando", value.asInstanceOf[js.Any])
    @scala.inline
    def setDada(value: String): Self = this.set("dada", value.asInstanceOf[js.Any])
    @scala.inline
    def setDadas(value: String): Self = this.set("dadas", value.asInstanceOf[js.Any])
    @scala.inline
    def setDado(value: String): Self = this.set("dado", value.asInstanceOf[js.Any])
    @scala.inline
    def setDados(value: String): Self = this.set("dados", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntonces(value: String): Self = this.set("entonces", value.asInstanceOf[js.Any])
    @scala.inline
    def setSea(value: String): Self = this.set("sea", value.asInstanceOf[js.Any])
    @scala.inline
    def setSean(value: String): Self = this.set("sean", value.asInstanceOf[js.Any])
    @scala.inline
    def setSi(value: String): Self = this.set("si", value.asInstanceOf[js.Any])
  }
  
}

