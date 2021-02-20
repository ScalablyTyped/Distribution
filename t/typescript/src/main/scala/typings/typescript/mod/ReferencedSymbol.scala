package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferencedSymbol extends StObject {
  
  var definition: ReferencedSymbolDefinitionInfo = js.native
  
  var references: js.Array[ReferenceEntry] = js.native
}
object ReferencedSymbol {
  
  @scala.inline
  def apply(definition: ReferencedSymbolDefinitionInfo, references: js.Array[ReferenceEntry]): ReferencedSymbol = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencedSymbol]
  }
  
  @scala.inline
  implicit class ReferencedSymbolMutableBuilder[Self <: ReferencedSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: ReferencedSymbolDefinitionInfo): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferences(value: js.Array[ReferenceEntry]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesVarargs(value: ReferenceEntry*): Self = StObject.set(x, "references", js.Array(value :_*))
  }
}
