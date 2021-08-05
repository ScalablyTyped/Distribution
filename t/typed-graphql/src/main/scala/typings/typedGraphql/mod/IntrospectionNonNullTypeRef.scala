package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.NON_NULL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionNonNullTypeRef
  extends StObject
     with IntrospectionTypeRef {
  
  var kind: NON_NULL
  
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.undefined
}
object IntrospectionNonNullTypeRef {
  
  inline def apply(): IntrospectionNonNullTypeRef = {
    val __obj = js.Dynamic.literal(kind = "NON_NULL")
    __obj.asInstanceOf[IntrospectionNonNullTypeRef]
  }
  
  extension [Self <: IntrospectionNonNullTypeRef](x: Self) {
    
    inline def setKind(value: NON_NULL): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOfType(value: IntrospectionTypeRef): Self = StObject.set(x, "ofType", value.asInstanceOf[js.Any])
    
    inline def setOfTypeUndefined: Self = StObject.set(x, "ofType", js.undefined)
  }
}
