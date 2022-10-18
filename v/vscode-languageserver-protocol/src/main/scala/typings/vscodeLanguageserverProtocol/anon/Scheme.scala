package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.NotebookDocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scheme
  extends StObject
     with NotebookDocumentFilter {
  
  /** The type of the enclosing notebook. */
  var notebookType: js.UndefOr[String] = js.undefined
  
  /** A glob pattern. */
  var pattern: String
  
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[String] = js.undefined
}
object Scheme {
  
  inline def apply(pattern: String): Scheme = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scheme]
  }
  
  extension [Self <: Scheme](x: Self) {
    
    inline def setNotebookType(value: String): Self = StObject.set(x, "notebookType", value.asInstanceOf[js.Any])
    
    inline def setNotebookTypeUndefined: Self = StObject.set(x, "notebookType", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
