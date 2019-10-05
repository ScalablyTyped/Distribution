package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLUnionTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[GraphQLTypeResolveFn] = js.undefined
  var types: js.Array[GraphQLObjectType]
}

object GraphQLUnionTypeConfig {
  @scala.inline
  def apply(
    name: String,
    types: js.Array[GraphQLObjectType],
    description: String = null,
    resolveType: (/* value */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => GraphQLObjectType = null
  ): GraphQLUnionTypeConfig = {
    val __obj = js.Dynamic.literal(name = name, types = types)
    if (description != null) __obj.updateDynamic("description")(description)
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction3(resolveType))
    __obj.asInstanceOf[GraphQLUnionTypeConfig]
  }
}

