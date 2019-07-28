package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFieldDefinition extends js.Object {
  var args: js.Array[GraphQLArgument]
  var deprecationReason: js.UndefOr[String] = js.undefined
  var description: String
  var name: String
  var resolve: js.UndefOr[GraphQLFieldResolveFn] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphQLFieldDefinition {
  @scala.inline
  def apply(
    args: js.Array[GraphQLArgument],
    description: String,
    name: String,
    `type`: GraphQLOutputType,
    deprecationReason: String = null,
    resolve: GraphQLFieldResolveFn = null
  ): GraphQLFieldDefinition = {
    val __obj = js.Dynamic.literal(args = args, description = description, name = name)
    __obj.updateDynamic("type")(`type`)
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[GraphQLFieldDefinition]
  }
}

