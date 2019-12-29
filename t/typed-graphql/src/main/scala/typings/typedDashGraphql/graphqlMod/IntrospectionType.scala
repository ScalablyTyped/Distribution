package typings.typedDashGraphql.graphqlMod

import typings.typedDashGraphql.typedDashGraphqlStrings.ENUM
import typings.typedDashGraphql.typedDashGraphqlStrings.INPUT_OBJECT
import typings.typedDashGraphql.typedDashGraphqlStrings.INTERFACE
import typings.typedDashGraphql.typedDashGraphqlStrings.OBJECT
import typings.typedDashGraphql.typedDashGraphqlStrings.SCALAR
import typings.typedDashGraphql.typedDashGraphqlStrings.UNION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typedDashGraphql.graphqlMod.IntrospectionScalarType
  - typings.typedDashGraphql.graphqlMod.IntrospectionObjectType
  - typings.typedDashGraphql.graphqlMod.IntrospectionInterfaceType
  - typings.typedDashGraphql.graphqlMod.IntrospectionUnionType
  - typings.typedDashGraphql.graphqlMod.IntrospectionEnumType
  - typings.typedDashGraphql.graphqlMod.IntrospectionInputObjectType
*/
trait IntrospectionType extends js.Object

object IntrospectionType {
  @scala.inline
  def IntrospectionUnionType(
    kind: UNION,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef],
    description: String = null
  ): IntrospectionType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
  @scala.inline
  def IntrospectionScalarType(kind: SCALAR, name: String, description: String = null): IntrospectionType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
  @scala.inline
  def IntrospectionInputObjectType(
    inputFields: js.Array[IntrospectionInputValue],
    kind: INPUT_OBJECT,
    name: String,
    description: String = null
  ): IntrospectionType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
  @scala.inline
  def IntrospectionEnumType(enumValues: js.Array[IntrospectionEnumValue], kind: ENUM, name: String, description: String = null): IntrospectionType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
  @scala.inline
  def IntrospectionObjectType(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef],
    kind: OBJECT,
    name: String,
    description: String = null
  ): IntrospectionType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
  @scala.inline
  def IntrospectionInterfaceType(
    fields: js.Array[IntrospectionField],
    kind: INTERFACE,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef],
    description: String = null
  ): IntrospectionType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionType]
  }
}

