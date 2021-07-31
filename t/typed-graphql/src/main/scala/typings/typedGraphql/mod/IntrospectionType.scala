package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.mod.IntrospectionScalarType
  - typings.typedGraphql.mod.IntrospectionObjectType
  - typings.typedGraphql.mod.IntrospectionInterfaceType
  - typings.typedGraphql.mod.IntrospectionUnionType
  - typings.typedGraphql.mod.IntrospectionEnumType
  - typings.typedGraphql.mod.IntrospectionInputObjectType
*/
trait IntrospectionType extends StObject
object IntrospectionType {
  
  @scala.inline
  def IntrospectionEnumType(enumValues: js.Array[IntrospectionEnumValue], name: String): typings.typedGraphql.mod.IntrospectionEnumType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = "ENUM", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionEnumType]
  }
  
  @scala.inline
  def IntrospectionInputObjectType(inputFields: js.Array[IntrospectionInputValue], name: String): typings.typedGraphql.mod.IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = "INPUT_OBJECT", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionInputObjectType]
  }
  
  @scala.inline
  def IntrospectionInterfaceType(
    fields: js.Array[IntrospectionField],
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef]
  ): typings.typedGraphql.mod.IntrospectionInterfaceType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = "INTERFACE", name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionInterfaceType]
  }
  
  @scala.inline
  def IntrospectionObjectType(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef],
    name: String
  ): typings.typedGraphql.mod.IntrospectionObjectType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = "OBJECT", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionObjectType]
  }
  
  @scala.inline
  def IntrospectionScalarType(name: String): typings.typedGraphql.mod.IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = "SCALAR", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionScalarType]
  }
  
  @scala.inline
  def IntrospectionUnionType(name: String, possibleTypes: js.Array[IntrospectionNamedTypeRef]): typings.typedGraphql.mod.IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = "UNION", name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionUnionType]
  }
}
