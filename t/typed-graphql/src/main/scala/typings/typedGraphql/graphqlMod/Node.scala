package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.graphqlMod.Name
  - typings.typedGraphql.graphqlMod.Document
  - typings.typedGraphql.graphqlMod.OperationDefinition
  - typings.typedGraphql.graphqlMod.VariableDefinition
  - typings.typedGraphql.graphqlMod.Variable
  - typings.typedGraphql.graphqlMod.SelectionSet
  - typings.typedGraphql.graphqlMod.Field
  - typings.typedGraphql.graphqlMod.Argument
  - typings.typedGraphql.graphqlMod.FragmentSpread
  - typings.typedGraphql.graphqlMod.InlineFragment
  - typings.typedGraphql.graphqlMod.FragmentDefinition
  - typings.typedGraphql.graphqlMod.IntValue
  - typings.typedGraphql.graphqlMod.FloatValue
  - typings.typedGraphql.graphqlMod.StringValue
  - typings.typedGraphql.graphqlMod.BooleanValue
  - typings.typedGraphql.graphqlMod.EnumValue
  - typings.typedGraphql.graphqlMod.ListValue
  - typings.typedGraphql.graphqlMod.ObjectValue
  - typings.typedGraphql.graphqlMod.ObjectField
  - typings.typedGraphql.graphqlMod.Directive
  - typings.typedGraphql.graphqlMod.ListType
  - typings.typedGraphql.graphqlMod.NonNullType
  - typings.typedGraphql.graphqlMod.ObjectTypeDefinition
  - typings.typedGraphql.graphqlMod.FieldDefinition
  - typings.typedGraphql.graphqlMod.InputValueDefinition
  - typings.typedGraphql.graphqlMod.InterfaceTypeDefinition
  - typings.typedGraphql.graphqlMod.UnionTypeDefinition
  - typings.typedGraphql.graphqlMod.ScalarTypeDefinition
  - typings.typedGraphql.graphqlMod.EnumTypeDefinition
  - typings.typedGraphql.graphqlMod.EnumValueDefinition
  - typings.typedGraphql.graphqlMod.InputObjectTypeDefinition
  - typings.typedGraphql.graphqlMod.TypeExtensionDefinition
*/
trait Node extends StObject
object Node {
  
  inline def Argument(kind: String, name: Name, value: Value): typings.typedGraphql.graphqlMod.Argument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.Argument]
  }
  
  inline def BooleanValue(kind: String, value: Boolean): typings.typedGraphql.graphqlMod.BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.BooleanValue]
  }
  
  inline def Directive(kind: String, name: Name): typings.typedGraphql.graphqlMod.Directive = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.Directive]
  }
  
  inline def Document(definitions: js.Array[Definition], kind: String): typings.typedGraphql.graphqlMod.Document = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.Document]
  }
  
  inline def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition]): typings.typedGraphql.graphqlMod.EnumTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.EnumTypeDefinition]
  }
  
  inline def EnumValue(kind: String, value: String): typings.typedGraphql.graphqlMod.EnumValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.EnumValue]
  }
  
  inline def EnumValueDefinition(kind: String, name: Name): typings.typedGraphql.graphqlMod.EnumValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.EnumValueDefinition]
  }
  
  inline def Field(kind: String, name: Name): typings.typedGraphql.graphqlMod.Field = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.Field]
  }
  
  inline def FieldDefinition(arguments: js.Array[InputValueDefinition], kind: String, name: Name, `type`: Type): typings.typedGraphql.graphqlMod.FieldDefinition = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.FieldDefinition]
  }
  
  inline def FloatValue(kind: String, value: String): typings.typedGraphql.graphqlMod.FloatValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.FloatValue]
  }
  
  inline def FragmentDefinition(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): typings.typedGraphql.graphqlMod.FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.FragmentDefinition]
  }
  
  inline def FragmentSpread(kind: String, name: Name): typings.typedGraphql.graphqlMod.FragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.FragmentSpread]
  }
  
  inline def InlineFragment(kind: String, selectionSet: SelectionSet): typings.typedGraphql.graphqlMod.InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.InlineFragment]
  }
  
  inline def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name): typings.typedGraphql.graphqlMod.InputObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.InputObjectTypeDefinition]
  }
  
  inline def InputValueDefinition(kind: String, name: Name, `type`: Type): typings.typedGraphql.graphqlMod.InputValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.InputValueDefinition]
  }
  
  inline def IntValue(kind: String, value: String): typings.typedGraphql.graphqlMod.IntValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.IntValue]
  }
  
  inline def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typings.typedGraphql.graphqlMod.InterfaceTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.InterfaceTypeDefinition]
  }
  
  inline def ListType(kind: String, `type`: Type): typings.typedGraphql.graphqlMod.ListType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ListType]
  }
  
  inline def ListValue(kind: String, values: js.Array[Value]): typings.typedGraphql.graphqlMod.ListValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ListValue]
  }
  
  inline def Name(kind: String, value: String): typings.typedGraphql.graphqlMod.Name = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.Name]
  }
  
  inline def NonNullType(kind: String, `type`: NamedType | ListType): typings.typedGraphql.graphqlMod.NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.NonNullType]
  }
  
  inline def ObjectField(kind: String, name: Name, value: Value): typings.typedGraphql.graphqlMod.ObjectField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ObjectField]
  }
  
  inline def ObjectTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): typings.typedGraphql.graphqlMod.ObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ObjectTypeDefinition]
  }
  
  inline def ObjectValue(fields: js.Array[ObjectField], kind: String): typings.typedGraphql.graphqlMod.ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ObjectValue]
  }
  
  inline def OperationDefinition(kind: String, operation: String, selectionSet: SelectionSet): typings.typedGraphql.graphqlMod.OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.OperationDefinition]
  }
  
  inline def ScalarTypeDefinition(kind: String, name: Name): typings.typedGraphql.graphqlMod.ScalarTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ScalarTypeDefinition]
  }
  
  inline def SelectionSet(kind: String, selections: js.Array[Selection]): typings.typedGraphql.graphqlMod.SelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.SelectionSet]
  }
  
  inline def StringValue(kind: String, value: String): typings.typedGraphql.graphqlMod.StringValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.StringValue]
  }
  
  inline def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String): typings.typedGraphql.graphqlMod.TypeExtensionDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.TypeExtensionDefinition]
  }
  
  inline def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType]): typings.typedGraphql.graphqlMod.UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.UnionTypeDefinition]
  }
  
  inline def Variable(kind: String, name: Name): typings.typedGraphql.graphqlMod.Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.Variable]
  }
  
  inline def VariableDefinition(kind: String, `type`: Type, variable: Variable): typings.typedGraphql.graphqlMod.VariableDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.VariableDefinition]
  }
}
