package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSymbolInformation extends StObject {
  
  /**
    * The name of the symbol containing this symbol. This information is for
    * user interface purposes (e.g. to render a qualifier in the user interface
    * if necessary). It can't be used to re-infer a hierarchy for the document
    * symbols.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of this symbol.
    */
  var kind: SymbolKind
  
  /**
    * The name of this symbol.
    */
  var name: String
  
  /**
    * Tags for this symbol.
    *
    * @since 3.16.0
    */
  var tags: js.UndefOr[js.Array[SymbolTag]] = js.undefined
}
object BaseSymbolInformation {
  
  inline def apply(kind: SymbolKind, name: String): BaseSymbolInformation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSymbolInformation]
  }
  
  extension [Self <: BaseSymbolInformation](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setKind(value: SymbolKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[SymbolTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: SymbolTag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
