package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeExtensionDefinition
  extends StObject
     with Node
     with TypeDefinition {
  
  var definition: ObjectTypeDefinition
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
}
object TypeExtensionDefinition {
  
  @scala.inline
  def apply(definition: ObjectTypeDefinition, kind: String): TypeExtensionDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionDefinition]
  }
  
  @scala.inline
  implicit class TypeExtensionDefinitionMutableBuilder[Self <: TypeExtensionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: ObjectTypeDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
