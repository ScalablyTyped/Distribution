package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageString extends StObject {
  
  var language: String
}
object LanguageString {
  
  inline def apply(language: String): LanguageString = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageString] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
