package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFieldDefinition extends js.Object {
  var args: js.Array[GraphQLArgument]
  var deprecationReason: js.UndefOr[java.lang.String] = js.undefined
  var description: java.lang.String
  var name: java.lang.String
  var resolve: js.UndefOr[GraphQLFieldResolveFn] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphQLFieldDefinition {
  @scala.inline
  def apply(
    args: js.Array[GraphQLArgument],
    description: java.lang.String,
    name: java.lang.String,
    `type`: GraphQLOutputType,
    deprecationReason: java.lang.String = null,
    resolve: GraphQLFieldResolveFn = null
  ): GraphQLFieldDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("name")(name)
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[GraphQLFieldDefinition]
  }
}

