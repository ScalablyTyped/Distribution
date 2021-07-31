package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Node extends StObject
object Node {
  
  @scala.inline
  def Argument(kind: String, name: Name, value: Value): typings.typedGraphql.mod.Argument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Argument]
  }
  
  @scala.inline
  def BooleanValue(kind: String, value: Boolean): typings.typedGraphql.mod.BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.BooleanValue]
  }
  
  @scala.inline
  def Directive(kind: String, name: Name): typings.typedGraphql.mod.Directive = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Directive]
  }
  
  @scala.inline
  def Document(definitions: js.Array[Definition], kind: String): typings.typedGraphql.mod.Document = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Document]
  }
  
  @scala.inline
  def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition]): typings.typedGraphql.mod.EnumTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.EnumTypeDefinition]
  }
  
  @scala.inline
  def EnumValue(kind: String, value: String): typings.typedGraphql.mod.EnumValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.EnumValue]
  }
  
  @scala.inline
  def EnumValueDefinition(kind: String, name: Name): typings.typedGraphql.mod.EnumValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.EnumValueDefinition]
  }
  
  @scala.inline
  def Field(kind: String, name: Name): typings.typedGraphql.mod.Field = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Field]
  }
  
  @scala.inline
  def FieldDefinition(arguments: js.Array[InputValueDefinition], kind: String, name: Name, `type`: Type): typings.typedGraphql.mod.FieldDefinition = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.FieldDefinition]
  }
  
  @scala.inline
  def FloatValue(kind: String, value: String): typings.typedGraphql.mod.FloatValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.FloatValue]
  }
  
  @scala.inline
  def FragmentDefinition(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): typings.typedGraphql.mod.FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.FragmentDefinition]
  }
  
  @scala.inline
  def FragmentSpread(kind: String, name: Name): typings.typedGraphql.mod.FragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.FragmentSpread]
  }
  
  @scala.inline
  def InlineFragment(kind: String, selectionSet: SelectionSet): typings.typedGraphql.mod.InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.InlineFragment]
  }
  
  @scala.inline
  def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name): typings.typedGraphql.mod.InputObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.InputObjectTypeDefinition]
  }
  
  @scala.inline
  def InputValueDefinition(kind: String, name: Name, `type`: Type): typings.typedGraphql.mod.InputValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.InputValueDefinition]
  }
  
  @scala.inline
  def IntValue(kind: String, value: String): typings.typedGraphql.mod.IntValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntValue]
  }
  
  @scala.inline
  def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typings.typedGraphql.mod.InterfaceTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.InterfaceTypeDefinition]
  }
  
  @scala.inline
  def ListType(kind: String, `type`: Type): typings.typedGraphql.mod.ListType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ListType]
  }
  
  @scala.inline
  def ListValue(kind: String, values: js.Array[Value]): typings.typedGraphql.mod.ListValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ListValue]
  }
  
  @scala.inline
  def Name(kind: String, value: String): typings.typedGraphql.mod.Name = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Name]
  }
  
  @scala.inline
  def NonNullType(kind: String, `type`: NamedType | ListType): typings.typedGraphql.mod.NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.NonNullType]
  }
  
  @scala.inline
  def ObjectField(kind: String, name: Name, value: Value): typings.typedGraphql.mod.ObjectField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ObjectField]
  }
  
  @scala.inline
  def ObjectTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typings.typedGraphql.mod.ObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ObjectTypeDefinition]
  }
  
  @scala.inline
  def ObjectValue(fields: js.Array[ObjectField], kind: String): typings.typedGraphql.mod.ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ObjectValue]
  }
  
  @scala.inline
  def OperationDefinition(kind: String, operation: String, selectionSet: SelectionSet): typings.typedGraphql.mod.OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.OperationDefinition]
  }
  
  @scala.inline
  def ScalarTypeDefinition(kind: String, name: Name): typings.typedGraphql.mod.ScalarTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ScalarTypeDefinition]
  }
  
  @scala.inline
  def SelectionSet(kind: String, selections: js.Array[Selection]): typings.typedGraphql.mod.SelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.SelectionSet]
  }
  
  @scala.inline
  def StringValue(kind: String, value: String): typings.typedGraphql.mod.StringValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.StringValue]
  }
  
  @scala.inline
  def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String): typings.typedGraphql.mod.TypeExtensionDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.TypeExtensionDefinition]
  }
  
  @scala.inline
  def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType]): typings.typedGraphql.mod.UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.UnionTypeDefinition]
  }
  
  @scala.inline
  def Variable(kind: String, name: Name): typings.typedGraphql.mod.Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Variable]
  }
  
  @scala.inline
  def VariableDefinition(kind: String, `type`: Type, variable: Variable): typings.typedGraphql.mod.VariableDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.VariableDefinition]
  }
}
