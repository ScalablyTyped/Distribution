package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.OBJECT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionObjectType extends IntrospectionType {
  
  var description: js.UndefOr[String] = js.native
  
  var fields: js.Array[IntrospectionField] = js.native
  
  var interfaces: js.Array[IntrospectionNamedTypeRef] = js.native
  
  var kind: OBJECT = js.native
  
  var name: String = js.native
}
object IntrospectionObjectType {
  
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef],
    kind: OBJECT,
    name: String
  ): IntrospectionObjectType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionObjectType]
  }
  
  @scala.inline
  implicit class IntrospectionObjectTypeMutableBuilder[Self <: IntrospectionObjectType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[IntrospectionField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: IntrospectionField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setInterfaces(value: js.Array[IntrospectionNamedTypeRef]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfacesVarargs(value: IntrospectionNamedTypeRef*): Self = StObject.set(x, "interfaces", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: OBJECT): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
