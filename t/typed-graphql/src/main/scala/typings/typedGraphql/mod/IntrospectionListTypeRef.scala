package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.LIST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionListTypeRef extends IntrospectionTypeRef {
  
  var kind: LIST = js.native
  
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.native
}
object IntrospectionListTypeRef {
  
  @scala.inline
  def apply(kind: LIST): IntrospectionListTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
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
