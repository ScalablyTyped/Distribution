package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeDefinition
  extends StObject
     with Node
     with TypeDefinition {
  
  var fields: js.Array[FieldDefinition]
  
  var interfaces: js.UndefOr[js.Array[NamedType]] = js.undefined
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var name: Name
}
object ObjectTypeDefinition {
  
  inline def apply(fields: js.Array[FieldDefinition], kind: String, name: Name): ObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeDefinition]
  }
  
  extension [Self <: ObjectTypeDefinition](x: Self) {
    
    inline def setFields(value: js.Array[FieldDefinition]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldDefinition*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setInterfaces(value: js.Array[NamedType]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
    
    inline def setInterfacesUndefined: Self = StObject.set(x, "interfaces", js.undefined)
    
    inline def setInterfacesVarargs(value: NamedType*): Self = StObject.set(x, "interfaces", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
