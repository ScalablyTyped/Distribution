package typings.vscode.anon

import typings.vscode.mod.ConfigurationScope
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageId
  extends StObject
     with ConfigurationScope {
  
  var languageId: String
  
  var uri: js.UndefOr[Uri] = js.undefined
}
object LanguageId {
  
  inline def apply(languageId: String): LanguageId = {
    val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageId]
  }
  
  extension [Self <: LanguageId](x: Self) {
    
    inline def setLanguageId(value: String): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
