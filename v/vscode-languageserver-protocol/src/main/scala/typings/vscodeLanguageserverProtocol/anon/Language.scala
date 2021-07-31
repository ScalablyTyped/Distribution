package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language
  extends StObject
     with DocumentFilter {
  
  /** A language id, like `typescript`. */
  var language: String
  
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[String] = js.undefined
}
object Language {
  
  @scala.inline
  def apply(language: String): Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
