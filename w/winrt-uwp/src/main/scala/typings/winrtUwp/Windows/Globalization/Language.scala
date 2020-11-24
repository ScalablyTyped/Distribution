package typings.winrtUwp.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A class that provides information related to BCP-47 language tags such as the language name and the script. */
@js.native
trait Language extends js.Object {
  
  /** Gets a localized string that is suitable for display to the user for identifying the language. */
  var displayName: String = js.native
  
  /**
    * Retrieves a vector of extension subtags in the current language for the given extension identified by singleton.
    * @param singleton A single-character subtag for the LanguageTag of the current language. See BCP-47 language tags, Extensions and the Extensions Registry.
    * @return The list of extension subtags identified by singleton.
    */
  def getExtensionSubtags(singleton: String): IVectorView[String] = js.native
  
  /** Gets the normalized BCP-47 language tag for this language. */
  var languageTag: String = js.native
  
  /** Gets the name of the language in the language itself. */
  var nativeName: String = js.native
  
  /** Gets the four-letter ISO 15924 script code of the language. */
  var script: String = js.native
}
object Language {
  
  @scala.inline
  def apply(
    displayName: String,
    getExtensionSubtags: String => IVectorView[String],
    languageTag: String,
    nativeName: String,
    script: String
  ): Language = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], getExtensionSubtags = js.Any.fromFunction1(getExtensionSubtags), languageTag = languageTag.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExtensionSubtags(value: String => IVectorView[String]): Self = this.set("getExtensionSubtags", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguageTag(value: String): Self = this.set("languageTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeName(value: String): Self = this.set("nativeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
  }
}
