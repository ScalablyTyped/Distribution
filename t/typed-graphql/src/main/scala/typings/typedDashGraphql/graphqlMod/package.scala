package typings.typedDashGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type GraphQLEnumValueConfigMap = StringDictionary[GraphQLEnumValueConfig]
  // error/*.js
  type GraphQLError = Error
  type GraphQLFieldConfigArgumentMap = StringDictionary[GraphQLArgumentConfig]
  type GraphQLFieldConfigMap = StringDictionary[GraphQLFieldConfig]
  type GraphQLFieldConfigMapThunk = js.Function0[GraphQLFieldConfigMap]
  type GraphQLFieldDefinitionMap = StringDictionary[GraphQLFieldDefinition]
  type GraphQLFieldResolveFn = js.Function4[
    /* source */ js.Any, 
    /* args */ StringDictionary[js.Any], 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInterfacesThunk = js.Function0[js.Array[GraphQLInterfaceType]]
  type GraphQLIsTypeOfFn = js.Function3[/* source */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo, Boolean]
  type GraphQLTypeResolveFn = js.Function3[
    /* value */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    GraphQLObjectType
  ]
  type InputObjectConfigFieldMap = StringDictionary[InputObjectFieldConfig]
  type InputObjectConfigFieldMapThunk = js.Function0[InputObjectConfigFieldMap]
  type InputObjectFieldMap = StringDictionary[InputObjectField]
  type Lexer = js.Function1[/* resetPosition */ js.UndefOr[Double], Token]
  type TokenKind = StringDictionary[Double]
  type TypeKind = StringDictionary[String]
  type TypeMap = StringDictionary[GraphQLType]
  // validation/*.js
  type ValidationRule = js.Function1[/* context */ ValidationContext, js.Any]
}
