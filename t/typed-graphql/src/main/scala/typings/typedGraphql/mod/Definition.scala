package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.mod.OperationDefinition
  - typings.typedGraphql.mod.FragmentDefinition
  - typings.typedGraphql.mod.TypeDefinition
*/
trait Definition extends js.Object

object Definition {
  @scala.inline
  def ObjectTypeDefinition(
    fields: js.Array[FieldDefinition],
    kind: String,
    name: Name,
    interfaces: js.Array[NamedType] = null,
    loc: Location = null
  ): Definition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String, loc: Location = null): Definition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def FragmentDefinition(
    kind: String,
    name: Name,
    selectionSet: SelectionSet,
    typeCondition: NamedType,
    directives: js.Array[Directive] = null,
    loc: Location = null
  ): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def OperationDefinition(
    kind: String,
    operation: String,
    selectionSet: SelectionSet,
    directives: js.Array[Directive] = null,
    loc: Location = null,
    name: Name = null,
    variableDefinitions: js.Array[VariableDefinition] = null
  ): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (variableDefinitions != null) __obj.updateDynamic("variableDefinitions")(variableDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType], loc: Location = null): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def ScalarTypeDefinition(kind: String, name: Name, loc: Location = null): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name, loc: Location = null): Definition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition], loc: Location = null): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name, loc: Location = null): Definition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}

