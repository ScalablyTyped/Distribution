package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLSchemaConfig extends js.Object {
  var directives: js.UndefOr[js.Array[GraphQLDirective]] = js.undefined
  var mutation: js.UndefOr[GraphQLObjectType] = js.undefined
  var query: GraphQLObjectType
  var subscription: js.UndefOr[GraphQLObjectType] = js.undefined
  var types: js.UndefOr[js.Array[GraphQLNamedType]] = js.undefined
}

