package typings
package typedDashGraphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlMod {
  type GraphQLEnumValueConfigMap = org.scalablytyped.runtime.StringDictionary[GraphQLEnumValueConfig]
  // error/*.js
  type GraphQLError = stdLib.Error
  type GraphQLFieldConfigArgumentMap = org.scalablytyped.runtime.StringDictionary[GraphQLArgumentConfig]
  type GraphQLFieldConfigMap = org.scalablytyped.runtime.StringDictionary[GraphQLFieldConfig]
  type GraphQLFieldConfigMapThunk = js.Function0[GraphQLFieldConfigMap]
  type GraphQLFieldDefinitionMap = org.scalablytyped.runtime.StringDictionary[GraphQLFieldDefinition]
  type GraphQLFieldResolveFn = js.Function4[
    /* source */ js.Any, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInterfacesThunk = js.Function0[js.Array[GraphQLInterfaceType]]
  type GraphQLIsTypeOfFn = js.Function3[
    /* source */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    scala.Boolean
  ]
  type GraphQLTypeResolveFn = js.Function3[
    /* value */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    GraphQLObjectType
  ]
  type InputObjectConfigFieldMap = org.scalablytyped.runtime.StringDictionary[InputObjectFieldConfig]
  type InputObjectConfigFieldMapThunk = js.Function0[InputObjectConfigFieldMap]
  type InputObjectFieldMap = org.scalablytyped.runtime.StringDictionary[InputObjectField]
  type Lexer = js.Function1[/* resetPosition */ js.UndefOr[scala.Double], Token]
  type TokenKind = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type TypeKind = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TypeMap = org.scalablytyped.runtime.StringDictionary[GraphQLType]
  // validation/*.js
  type ValidationRule = js.Function1[/* context */ ValidationContext, js.Any]
}
