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

object GraphQLSchemaConfig {
  @scala.inline
  def apply(
    query: GraphQLObjectType,
    directives: js.Array[GraphQLDirective] = null,
    mutation: GraphQLObjectType = null,
    subscription: GraphQLObjectType = null,
    types: js.Array[GraphQLNamedType] = null
  ): GraphQLSchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (mutation != null) __obj.updateDynamic("mutation")(mutation)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[GraphQLSchemaConfig]
  }
}

