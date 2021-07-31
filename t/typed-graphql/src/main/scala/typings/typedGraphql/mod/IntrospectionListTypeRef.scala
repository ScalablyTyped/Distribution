package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.LIST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionListTypeRef
  extends StObject
     with IntrospectionTypeRef {
  
  var kind: LIST
  
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.undefined
}
object IntrospectionListTypeRef {
  
  @scala.inline
  def apply(): IntrospectionListTypeRef = {
    val __obj = js.Dynamic.literal(kind = "LIST")
    __obj.asInstanceOf[IntrospectionListTypeRef]
  }
  
  @scala.inline
  implicit class IntrospectionListTypeRefMutableBuilder[Self <: IntrospectionListTypeRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: LIST): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfType(value: IntrospectionTypeRef): Self = StObject.set(x, "ofType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfTypeUndefined: Self = StObject.set(x, "ofType", js.undefined)
  }
}
