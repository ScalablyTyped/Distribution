package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.mod.Name
  - typings.typedGraphql.mod.Document
  - typings.typedGraphql.mod.OperationDefinition
  - typings.typedGraphql.mod.VariableDefinition
  - typings.typedGraphql.mod.Variable
  - typings.typedGraphql.mod.SelectionSet
  - typings.typedGraphql.mod.Field
  - typings.typedGraphql.mod.Argument
  - typings.typedGraphql.mod.FragmentSpread
  - typings.typedGraphql.mod.InlineFragment
  - typings.typedGraphql.mod.FragmentDefinition
  - typings.typedGraphql.mod.IntValue
  - typings.typedGraphql.mod.FloatValue
  - typings.typedGraphql.mod.StringValue
  - typings.typedGraphql.mod.BooleanValue
  - typings.typedGraphql.mod.EnumValue
  - typings.typedGraphql.mod.ListValue
  - typings.typedGraphql.mod.ObjectValue
  - typings.typedGraphql.mod.ObjectField
  - typings.typedGraphql.mod.Directive
  - typings.typedGraphql.mod.ListType
  - typings.typedGraphql.mod.NonNullType
  - typings.typedGraphql.mod.ObjectTypeDefinition
  - typings.typedGraphql.mod.FieldDefinition
  - typings.typedGraphql.mod.InputValueDefinition
  - typings.typedGraphql.mod.InterfaceTypeDefinition
  - typings.typedGraphql.mod.UnionTypeDefinition
  - typings.typedGraphql.mod.ScalarTypeDefinition
  - typings.typedGraphql.mod.EnumTypeDefinition
  - typings.typedGraphql.mod.EnumValueDefinition
  - typings.typedGraphql.mod.InputObjectTypeDefinition
  - typings.typedGraphql.mod.TypeExtensionDefinition
*/
trait Node extends js.Object

object Node {
  @scala.inline
  def ObjectTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): Node = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def EnumValueDefinition(kind: String, name: Name): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def SelectionSet(kind: String, selections: js.Array[Selection]): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Argument(kind: String, name: Name, value: Value): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String): Node = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Field(kind: String, name: Name): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def InputValueDefinition(kind: String, name: Name, `type`: Type): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def FieldDefinition(arguments: js.Array[InputValueDefinition], kind: String, name: Name, `type`: Type): Node = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Document(definitions: js.Array[Definition], kind: String): Node = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def VariableDefinition(kind: String, `type`: Type, variable: Variable): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def FragmentDefinition(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def BooleanValue(kind: String, value: Boolean): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def ObjectField(kind: String, name: Name, value: Value): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def FragmentSpread(kind: String, name: Name): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def InlineFragment(kind: String, selectionSet: SelectionSet): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def OperationDefinition(kind: String, operation: String, selectionSet: SelectionSet): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def ListValue(kind: String, values: js.Array[Value]): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType]): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Name(kind: String, value: String): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def ScalarTypeDefinition(kind: String, name: Name): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def FloatValue(kind: String, value: String): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def NonNullType(kind: String, `type`: NamedType | ListType): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def ObjectValue(fields: js.Array[ObjectField], kind: String): Node = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def StringValue(kind: String, value: String): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): Node = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Variable(kind: String, name: Name): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def EnumValue(kind: String, value: String): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition]): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def Directive(kind: String, name: Name): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name): Node = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def ListType(kind: String, `type`: Type): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def IntValue(kind: String, value: String): Node = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

