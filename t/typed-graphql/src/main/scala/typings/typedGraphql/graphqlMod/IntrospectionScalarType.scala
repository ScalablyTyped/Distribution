package typings.typedGraphql.graphqlMod

import typings.typedGraphql.typedGraphqlStrings.SCALAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionScalarType
  extends StObject
     with IntrospectionType {
  
  var description: js.UndefOr[String] = js.undefined
  
  var kind: SCALAR
  
  var name: String
}
object IntrospectionScalarType {
  
  inline def apply(name: String): IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = "SCALAR", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionScalarType]
  }
  
  extension [Self <: IntrospectionScalarType](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKind(value: SCALAR): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
