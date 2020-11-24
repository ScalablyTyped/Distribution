package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IdentifiedLanguages. */
@js.native
trait IdentifiedLanguages extends js.Object {
  
  /** A ranking of identified languages with confidence scores. */
  var languages: js.Array[IdentifiedLanguage] = js.native
}
object IdentifiedLanguages {
  
  @scala.inline
  def apply(languages: js.Array[IdentifiedLanguage]): IdentifiedLanguages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiedLanguages]
  }
  
  @scala.inline
  implicit class IdentifiedLanguagesOps[Self <: IdentifiedLanguages] (val x: Self) extends AnyVal {
    
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
    def setLanguagesVarargs(value: IdentifiedLanguage*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[IdentifiedLanguage]): Self = this.set("languages", value.asInstanceOf[js.Any])
  }
}
