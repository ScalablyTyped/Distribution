package typings
package typedDashGraphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlMod {
  type Definition = OperationDefinition | FragmentDefinition | TypeDefinition
  type GraphQLAbstractType = GraphQLInterfaceType | GraphQLUnionType
  type GraphQLCompositeType = GraphQLObjectType | GraphQLInterfaceType | GraphQLUnionType
  // error/*.js
  type GraphQLError = stdLib.Error
  type GraphQLFieldConfigMapThunk = js.Function0[GraphQLFieldConfigMap]
  type GraphQLFieldResolveFn = js.Function4[
    /* source */ js.Any, 
    /* args */ ScalablyTyped.runtime.StringDictionary[js.Any], 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInputType = GraphQLScalarType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList | GraphQLNonNull
  type GraphQLInterfacesThunk = js.Function0[js.Array[GraphQLInterfaceType]]
  type GraphQLIsTypeOfFn = js.Function3[
    /* source */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    scala.Boolean
  ]
  type GraphQLLeafType = GraphQLScalarType | GraphQLEnumType
  type GraphQLNamedType = GraphQLScalarType | GraphQLObjectType | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLInputObjectType
  type GraphQLNullableType = GraphQLScalarType | GraphQLObjectType | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList
  type GraphQLOutputType = GraphQLScalarType | GraphQLObjectType | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLList | GraphQLNonNull
  // type/definition.js
  type GraphQLType = GraphQLScalarType | GraphQLObjectType | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList | GraphQLNonNull
  type GraphQLTypeResolveFn = js.Function3[
    /* value */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    GraphQLObjectType
  ]
  type HasSelectionSet = OperationDefinition | FragmentDefinition
  type InputObjectConfigFieldMapThunk = js.Function0[InputObjectConfigFieldMap]
  type IntrospectionType = IntrospectionScalarType | IntrospectionObjectType | IntrospectionInterfaceType | IntrospectionUnionType | IntrospectionEnumType | IntrospectionInputObjectType
  type IntrospectionTypeRef = IntrospectionNamedTypeRef | IntrospectionListTypeRef | IntrospectionNonNullTypeRef
  type Lexer = js.Function1[/* resetPosition */ js.UndefOr[scala.Double], Token]
  type Node = Name | Document | OperationDefinition | VariableDefinition | Variable | SelectionSet | Field | Argument | FragmentSpread | InlineFragment | FragmentDefinition | IntValue | FloatValue | StringValue | BooleanValue | EnumValue | ListValue | ObjectValue | ObjectField | Directive | ListType | NonNullType | ObjectTypeDefinition | FieldDefinition | InputValueDefinition | InterfaceTypeDefinition | UnionTypeDefinition | ScalarTypeDefinition | EnumTypeDefinition | EnumValueDefinition | InputObjectTypeDefinition | TypeExtensionDefinition
  type Selection = Field | FragmentSpread | InlineFragment
  // Type Reference
  type Type = NamedType | ListType | NonNullType
  // Type Definition
  type TypeDefinition = ObjectTypeDefinition | InterfaceTypeDefinition | UnionTypeDefinition | ScalarTypeDefinition | EnumTypeDefinition | InputObjectTypeDefinition | TypeExtensionDefinition
  // validation/*.js
  type ValidationRule = js.Function1[/* context */ ValidationContext, js.Any]
  // Values
  type Value = Variable | IntValue | FloatValue | StringValue | BooleanValue | EnumValue | ListValue | ObjectValue
}
