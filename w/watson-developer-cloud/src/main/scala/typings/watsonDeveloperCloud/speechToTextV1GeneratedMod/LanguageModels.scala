package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** LanguageModels. */
@js.native
trait LanguageModels extends js.Object {
  
  /** An array of `LanguageModel` objects that provides information about each available custom language model. The array is empty if the requesting credentials own no custom language models (if no language is specified) or own no custom language models for the specified language. */
  var customizations: js.Array[LanguageModel] = js.native
}
object LanguageModels {
  
  @scala.inline
  def apply(customizations: js.Array[LanguageModel]): LanguageModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageModels]
  }
  
  @scala.inline
  implicit class LanguageModelsOps[Self <: LanguageModels] (val x: Self) extends AnyVal {
    
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
    def setCustomizationsVarargs(value: LanguageModel*): Self = this.set("customizations", js.Array(value :_*))
    
    @scala.inline
    def setCustomizations(value: js.Array[LanguageModel]): Self = this.set("customizations", value.asInstanceOf[js.Any])
  }
}
