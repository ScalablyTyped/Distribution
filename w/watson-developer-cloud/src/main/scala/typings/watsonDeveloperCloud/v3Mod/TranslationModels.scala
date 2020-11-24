package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response type for listing existing translation models. */
@js.native
trait TranslationModels extends js.Object {
  
  /** An array of available models. */
  var models: js.Array[TranslationModel] = js.native
}
object TranslationModels {
  
  @scala.inline
  def apply(models: js.Array[TranslationModel]): TranslationModels = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationModels]
  }
  
  @scala.inline
  implicit class TranslationModelsOps[Self <: TranslationModels] (val x: Self) extends AnyVal {
    
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
    def setModelsVarargs(value: TranslationModel*): Self = this.set("models", js.Array(value :_*))
    
    @scala.inline
    def setModels(value: js.Array[TranslationModel]): Self = this.set("models", value.asInstanceOf[js.Any])
  }
}
