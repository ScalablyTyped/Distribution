package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFilter extends StObject {
  
  /**
    * A language id, like `typescript`.
    */
  val language: js.UndefOr[String] = js.undefined
  
  /**
    * A [glob pattern](#GlobPattern) that is matched on the absolute path of the document. Use a [relative pattern](#RelativePattern)
    * to filter documents to a [workspace folder](#WorkspaceFolder).
    */
  val pattern: js.UndefOr[GlobPattern] = js.undefined
  
  /**
    * A Uri [scheme](#Uri.scheme), like `file` or `untitled`.
    */
  val scheme: js.UndefOr[String] = js.undefined
}
object DocumentFilter {
  
  inline def apply(): DocumentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFilter]
  }
  
  extension [Self <: DocumentFilter](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPattern(value: GlobPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
