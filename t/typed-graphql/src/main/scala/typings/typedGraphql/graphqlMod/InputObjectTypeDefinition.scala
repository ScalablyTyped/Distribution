package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputObjectTypeDefinition
  extends StObject
     with Node
     with TypeDefinition {
  
  var fields: js.Array[InputValueDefinition]
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var name: Name
}
object InputObjectTypeDefinition {
  
  inline def apply(fields: js.Array[InputValueDefinition], kind: String, name: Name): InputObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObjectTypeDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputObjectTypeDefinition] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[InputValueDefinition]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: InputValueDefinition*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
