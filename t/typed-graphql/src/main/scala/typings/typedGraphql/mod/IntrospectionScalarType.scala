package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.SCALAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionScalarType extends IntrospectionType {
  
  var description: js.UndefOr[String] = js.native
  
  var kind: SCALAR = js.native
  
  var name: String = js.native
}
object IntrospectionScalarType {
  
  @scala.inline
  def apply(kind: SCALAR, name: String): IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionScalarType]
  }
  
  @scala.inline
  implicit class IntrospectionScalarTypeMutableBuilder[Self <: IntrospectionScalarType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setKind(value: SCALAR): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
