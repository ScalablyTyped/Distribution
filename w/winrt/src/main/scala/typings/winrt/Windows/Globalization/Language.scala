package typings.winrt.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language
  extends StObject
     with ILanguage
object Language {
  
  inline def apply(displayName: String, languageTag: String, nativeName: String, script: String): Language = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
}
