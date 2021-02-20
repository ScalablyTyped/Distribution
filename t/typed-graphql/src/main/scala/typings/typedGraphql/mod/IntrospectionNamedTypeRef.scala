package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionNamedTypeRef extends IntrospectionTypeRef {
  
  var kind: String = js.native
  
  var name: String = js.native
}
object IntrospectionNamedTypeRef {
  
  @scala.inline
  def apply(kind: String, name: String): IntrospectionNamedTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionNamedTypeRef]
  }
  
  @scala.inline
  implicit class IntrospectionNamedTypeRefMutableBuilder[Self <: IntrospectionNamedTypeRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
