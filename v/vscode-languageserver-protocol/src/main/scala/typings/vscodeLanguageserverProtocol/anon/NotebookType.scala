package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.NotebookDocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookType
  extends StObject
     with NotebookDocumentFilter {
  
  /** The type of the enclosing notebook. */
  var notebookType: String
  
  /** A glob pattern. */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** A Uri {@link Uri.scheme scheme}, like `file` or `untitled`. */
  var scheme: js.UndefOr[String] = js.undefined
}
object NotebookType {
  
  inline def apply(notebookType: String): NotebookType = {
    val __obj = js.Dynamic.literal(notebookType = notebookType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookType] (val x: Self) extends AnyVal {
    
    inline def setNotebookType(value: String): Self = StObject.set(x, "notebookType", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
