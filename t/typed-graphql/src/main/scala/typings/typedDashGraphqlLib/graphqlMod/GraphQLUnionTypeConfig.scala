package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLUnionTypeConfig extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
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
    name: java.lang.String,
    types: js.Array[GraphQLObjectType],
    description: java.lang.String = null,
    resolveType: GraphQLTypeResolveFn = null
  ): GraphQLUnionTypeConfig = {
    val __obj = js.Dynamic.literal(name = name, types = types)
    if (description != null) __obj.updateDynamic("description")(description)
    if (resolveType != null) __obj.updateDynamic("resolveType")(resolveType)
    __obj.asInstanceOf[GraphQLUnionTypeConfig]
  }
}

