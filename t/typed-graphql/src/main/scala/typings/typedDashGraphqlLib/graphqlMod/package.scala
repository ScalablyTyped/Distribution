package typings
package typedDashGraphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlMod {
  // error/*.js
  type GraphQLError = stdLib.Error
  type GraphQLFieldConfigMapThunk = js.Function0[GraphQLFieldConfigMap]
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
  type InputObjectConfigFieldMapThunk = js.Function0[InputObjectConfigFieldMap]
  type Lexer = js.Function1[/* resetPosition */ js.UndefOr[scala.Double], Token]
  // validation/*.js
  type ValidationRule = js.Function1[/* context */ ValidationContext, js.Any]
}
