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
  
  inline def Argument(kind: String, name: Name, value: Value): typings.typedGraphql.mod.Argument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Argument]
  }
  
  inline def BooleanValue(kind: String, value: Boolean): typings.typedGraphql.mod.BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.BooleanValue]
  }
  
  inline def Directive(kind: String, name: Name): typings.typedGraphql.mod.Directive = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Directive]
  }
  
  inline def Document(definitions: js.Array[Definition], kind: String): typings.typedGraphql.mod.Document = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Document]
  }
  
  inline def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition]): typings.typedGraphql.mod.EnumTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.EnumTypeDefinition]
  }
  
  inline def EnumValue(kind: String, value: String): typings.typedGraphql.mod.EnumValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.EnumValue]
  }
  
  inline def EnumValueDefinition(kind: String, name: Name): typings.typedGraphql.mod.EnumValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.EnumValueDefinition]
  }
  
  inline def Field(kind: String, name: Name): typings.typedGraphql.mod.Field = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Field]
  }
  
  inline def FieldDefinition(arguments: js.Array[InputValueDefinition], kind: String, name: Name, `type`: Type): typings.typedGraphql.mod.FieldDefinition = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.FieldDefinition]
  }
  
  inline def FloatValue(kind: String, value: String): typings.typedGraphql.mod.FloatValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.FloatValue]
  }
  
  inline def FragmentDefinition(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): typings.typedGraphql.mod.FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.FragmentDefinition]
  }
  
  inline def FragmentSpread(kind: String, name: Name): typings.typedGraphql.mod.FragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.FragmentSpread]
  }
  
  inline def InlineFragment(kind: String, selectionSet: SelectionSet): typings.typedGraphql.mod.InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.InlineFragment]
  }
  
  inline def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name): typings.typedGraphql.mod.InputObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.InputObjectTypeDefinition]
  }
  
  inline def InputValueDefinition(kind: String, name: Name, `type`: Type): typings.typedGraphql.mod.InputValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.InputValueDefinition]
  }
  
  inline def IntValue(kind: String, value: String): typings.typedGraphql.mod.IntValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntValue]
  }
  
  inline def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typings.typedGraphql.mod.InterfaceTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.InterfaceTypeDefinition]
  }
  
  inline def ListType(kind: String, `type`: Type): typings.typedGraphql.mod.ListType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ListType]
  }
  
  inline def ListValue(kind: String, values: js.Array[Value]): typings.typedGraphql.mod.ListValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ListValue]
  }
  
  inline def Name(kind: String, value: String): typings.typedGraphql.mod.Name = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Name]
  }
  
  inline def NonNullType(kind: String, `type`: NamedType | ListType): typings.typedGraphql.mod.NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.NonNullType]
  }
  
  inline def ObjectField(kind: String, name: Name, value: Value): typings.typedGraphql.mod.ObjectField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ObjectField]
  }
  
  inline def ObjectTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typings.typedGraphql.mod.ObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ObjectTypeDefinition]
  }
  
  inline def ObjectValue(fields: js.Array[ObjectField], kind: String): typings.typedGraphql.mod.ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ObjectValue]
  }
  
  inline def OperationDefinition(kind: String, operation: String, selectionSet: SelectionSet): typings.typedGraphql.mod.OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.OperationDefinition]
  }
  
  inline def ScalarTypeDefinition(kind: String, name: Name): typings.typedGraphql.mod.ScalarTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ScalarTypeDefinition]
  }
  
  inline def SelectionSet(kind: String, selections: js.Array[Selection]): typings.typedGraphql.mod.SelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.SelectionSet]
  }
  
  inline def StringValue(kind: String, value: String): typings.typedGraphql.mod.StringValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.StringValue]
  }
  
  inline def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String): typings.typedGraphql.mod.TypeExtensionDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.TypeExtensionDefinition]
  }
  
  inline def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType]): typings.typedGraphql.mod.UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.UnionTypeDefinition]
  }
  
  inline def Variable(kind: String, name: Name): typings.typedGraphql.mod.Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Variable]
  }
  
  inline def VariableDefinition(kind: String, `type`: Type, variable: Variable): typings.typedGraphql.mod.VariableDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.VariableDefinition]
  }
}
