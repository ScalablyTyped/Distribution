package typings.vscode.anon

import typings.vscode.mod.ConfigurationScope
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageId extends ConfigurationScope {
  
  var languageId: String = js.native
  
  var uri: js.UndefOr[Uri] = js.native
}
object LanguageId {
  
  @scala.inline
  def apply(languageId: String): LanguageId = {
    val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageId]
  }
  
  @scala.inline
  implicit class LanguageIdMutableBuilder[Self <: LanguageId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageId(value: String): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
