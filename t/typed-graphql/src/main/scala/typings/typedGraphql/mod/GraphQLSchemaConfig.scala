package typings.typedGraphql.mod

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
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (mutation != null) __obj.updateDynamic("mutation")(mutation.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaConfig]
  }
}

