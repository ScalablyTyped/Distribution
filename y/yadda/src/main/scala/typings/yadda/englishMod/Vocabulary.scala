package typings.yadda.englishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vocabulary
  extends typings.yadda.languageMod.Vocabulary {
  
  var background: String = js.native
  
  var examples: String = js.native
  
  var feature: String = js.native
  
  var given: String = js.native
  
  var only: String = js.native
  
  var pending: String = js.native
  
  var scenario: String = js.native
  
  var `then`: String = js.native
  
  var when: String = js.native
}
object Vocabulary {
  
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    examples: String,
    feature: String,
    given: String,
    only: String,
    pending: String,
    scenario: String,
    `then`: String,
    when: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamples(value: String): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature(value: String): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGiven(value: String): Self = this.set("given", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly(value: String): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: String): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenario(value: String): Self = this.set("scenario", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThen(value: String): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhen(value: String): Self = this.set("when", value.asInstanceOf[js.Any])
  }
}
