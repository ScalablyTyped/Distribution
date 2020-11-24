package typings.yadda.pirateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vocabulary
  extends typings.yadda.englishMod.Vocabulary {
  
  var giveth: String = js.native
  
  var thence: String = js.native
  
  var whence: String = js.native
}
object Vocabulary {
  
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    examples: String,
    feature: String,
    given: String,
    giveth: String,
    only: String,
    pending: String,
    scenario: String,
    `then`: String,
    thence: String,
    when: String,
    whence: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], giveth = giveth.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], thence = thence.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any], whence = whence.asInstanceOf[js.Any])
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
    def setGiveth(value: String): Self = this.set("giveth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThence(value: String): Self = this.set("thence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhence(value: String): Self = this.set("whence", value.asInstanceOf[js.Any])
  }
}
