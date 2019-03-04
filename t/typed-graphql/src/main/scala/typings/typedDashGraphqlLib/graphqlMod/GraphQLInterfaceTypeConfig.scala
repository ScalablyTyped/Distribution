package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInterfaceTypeConfig extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap
  var name: java.lang.String
  var resolveType: js.UndefOr[GraphQLTypeResolveFn] = js.undefined
}

object GraphQLInterfaceTypeConfig {
  @scala.inline
  def apply(
    fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap,
    name: java.lang.String,
    description: java.lang.String = null,
    resolveType: GraphQLTypeResolveFn = null
  ): GraphQLInterfaceTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (resolveType != null) __obj.updateDynamic("resolveType")(resolveType)
    __obj.asInstanceOf[GraphQLInterfaceTypeConfig]
  }
}

