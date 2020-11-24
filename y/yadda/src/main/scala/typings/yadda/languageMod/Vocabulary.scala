package typings.yadda.languageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vocabulary extends js.Object {
  
  var _steps: js.Array[String] = js.native
}
object Vocabulary {
  
  @scala.inline
  def apply(_steps: js.Array[String]): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any])
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
    def set_stepsVarargs(value: String*): Self = this.set("_steps", js.Array(value :_*))
    
    @scala.inline
    def set_steps(value: js.Array[String]): Self = this.set("_steps", value.asInstanceOf[js.Any])
  }
}
