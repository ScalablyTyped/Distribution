package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.NotebookDocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternScheme
  extends StObject
     with NotebookDocumentFilter {
  
  /** The type of the enclosing notebook. */
  var notebookType: js.UndefOr[String] = js.undefined
  
  /** A glob pattern. */
  var pattern: String
  
  /** A Uri {@link Uri.scheme scheme}, like `file` or `untitled`. */
  var scheme: js.UndefOr[String] = js.undefined
}
object PatternScheme {
  
  inline def apply(pattern: String): PatternScheme = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternScheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatternScheme] (val x: Self) extends AnyVal {
    
    inline def setNotebookType(value: String): Self = StObject.set(x, "notebookType", value.asInstanceOf[js.Any])
    
    inline def setNotebookTypeUndefined: Self = StObject.set(x, "notebookType", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
