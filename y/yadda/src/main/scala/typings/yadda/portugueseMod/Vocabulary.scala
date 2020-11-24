package typings.yadda.portugueseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vocabulary
  extends typings.yadda.englishMod.Vocabulary {
  
  var dada: String = js.native
  
  var dadas: String = js.native
  
  var dado: String = js.native
  
  var dados: String = js.native
  
  var entao: String = js.native
  
  var quando: String = js.native
  
  var se: String = js.native
  
  var seja: String = js.native
  
  var sejam: String = js.native
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
    def setDada(value: String): Self = this.set("dada", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDadas(value: String): Self = this.set("dadas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDado(value: String): Self = this.set("dado", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDados(value: String): Self = this.set("dados", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntao(value: String): Self = this.set("entao", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuando(value: String): Self = this.set("quando", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSe(value: String): Self = this.set("se", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeja(value: String): Self = this.set("seja", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSejam(value: String): Self = this.set("sejam", value.asInstanceOf[js.Any])
  }
}
