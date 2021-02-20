package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scheme extends DocumentFilter {
  
  /** A language id, like `typescript`. */
  var language: js.UndefOr[String] = js.native
  
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: String = js.native
  
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[String] = js.native
}
object Scheme {
  
  @scala.inline
  def apply(pattern: String): Scheme = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scheme]
  }
  
  @scala.inline
  implicit class SchemeMutableBuilder[Self <: Scheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
