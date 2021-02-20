package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.NON_NULL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionNonNullTypeRef extends IntrospectionTypeRef {
  
  var kind: NON_NULL = js.native
  
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.native
}
object IntrospectionNonNullTypeRef {
  
  @scala.inline
  def apply(kind: NON_NULL): IntrospectionNonNullTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionNonNullTypeRef]
  }
  
  @scala.inline
  implicit class IntrospectionNonNullTypeRefMutableBuilder[Self <: IntrospectionNonNullTypeRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: NON_NULL): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfType(value: IntrospectionTypeRef): Self = StObject.set(x, "ofType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfTypeUndefined: Self = StObject.set(x, "ofType", js.undefined)
  }
}
