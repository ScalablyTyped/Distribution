package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInterfaceTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap
  var name: String
  var resolveType: js.UndefOr[GraphQLTypeResolveFn] = js.undefined
}

object GraphQLInterfaceTypeConfig {
  @scala.inline
  def apply(
    fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap,
    name: String,
    description: String = null,
    resolveType: (/* value */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => GraphQLObjectType = null
  ): GraphQLInterfaceTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction3(resolveType))
    __obj.asInstanceOf[GraphQLInterfaceTypeConfig]
  }
}

