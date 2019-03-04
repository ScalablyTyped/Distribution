package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFieldConfig extends js.Object {
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.undefined
  var deprecationReason: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var resolve: js.UndefOr[GraphQLFieldResolveFn] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphQLFieldConfig {
  @scala.inline
  def apply(
    `type`: GraphQLOutputType,
    args: GraphQLFieldConfigArgumentMap = null,
    deprecationReason: java.lang.String = null,
    description: java.lang.String = null,
    resolve: GraphQLFieldResolveFn = null
  ): GraphQLFieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (args != null) __obj.updateDynamic("args")(args)
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (description != null) __obj.updateDynamic("description")(description)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[GraphQLFieldConfig]
  }
}

