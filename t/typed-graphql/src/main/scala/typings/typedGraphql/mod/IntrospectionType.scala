package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.ENUM
import typings.typedGraphql.typedGraphqlStrings.INPUT_OBJECT
import typings.typedGraphql.typedGraphqlStrings.INTERFACE
import typings.typedGraphql.typedGraphqlStrings.OBJECT
import typings.typedGraphql.typedGraphqlStrings.SCALAR
import typings.typedGraphql.typedGraphqlStrings.UNION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def IntrospectionEnumType(enumValues: js.Array[IntrospectionEnumValue], kind: ENUM, name: String): typings.typedGraphql.mod.IntrospectionEnumType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionEnumType]
  }
  
  @scala.inline
  def IntrospectionInputObjectType(inputFields: js.Array[IntrospectionInputValue], kind: INPUT_OBJECT, name: String): typings.typedGraphql.mod.IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionInputObjectType]
  }
  
  @scala.inline
  def IntrospectionInterfaceType(
    fields: js.Array[IntrospectionField],
    kind: INTERFACE,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef]
  ): typings.typedGraphql.mod.IntrospectionInterfaceType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionInterfaceType]
  }
  
  @scala.inline
  def IntrospectionObjectType(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef],
    kind: OBJECT,
    name: String
  ): typings.typedGraphql.mod.IntrospectionObjectType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionObjectType]
  }
  
  @scala.inline
  def IntrospectionScalarType(kind: SCALAR, name: String): typings.typedGraphql.mod.IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionScalarType]
  }
  
  @scala.inline
  def IntrospectionUnionType(kind: UNION, name: String, possibleTypes: js.Array[IntrospectionNamedTypeRef]): typings.typedGraphql.mod.IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntrospectionUnionType]
  }
}
