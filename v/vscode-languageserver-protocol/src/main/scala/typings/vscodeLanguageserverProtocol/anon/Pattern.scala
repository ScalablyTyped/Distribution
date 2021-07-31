package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern
  extends StObject
     with DocumentFilter {
  
  /** A language id, like `typescript`. */
  var language: js.UndefOr[String] = js.undefined
  
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: String
}
object Pattern {
  
  @scala.inline
  def apply(scheme: String): Pattern = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
