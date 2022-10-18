package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkdownClientCapabilities extends StObject {
  
  /**
    * A list of HTML tags that the client allows / supports in
    * Markdown.
    *
    * @since 3.17.0
    */
  var allowedTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the parser.
    */
  var parser: String
  
  /**
    * The version of the parser.
    */
  var version: js.UndefOr[String] = js.undefined
}
object MarkdownClientCapabilities {
  
  inline def apply(parser: String): MarkdownClientCapabilities = {
    val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownClientCapabilities]
  }
  
  extension [Self <: MarkdownClientCapabilities](x: Self) {
    
    inline def setAllowedTags(value: js.Array[String]): Self = StObject.set(x, "allowedTags", value.asInstanceOf[js.Any])
    
    inline def setAllowedTagsUndefined: Self = StObject.set(x, "allowedTags", js.undefined)
    
    inline def setAllowedTagsVarargs(value: String*): Self = StObject.set(x, "allowedTags", js.Array(value*))
    
    inline def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
