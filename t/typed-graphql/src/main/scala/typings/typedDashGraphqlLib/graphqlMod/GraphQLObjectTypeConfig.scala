package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectTypeConfig extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap
  var interfaces: js.UndefOr[GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType]] = js.undefined
  var isTypeOf: js.UndefOr[GraphQLIsTypeOfFn] = js.undefined
  var name: java.lang.String
}

object GraphQLObjectTypeConfig {
  @scala.inline
  def apply(
    fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap,
    name: java.lang.String,
    description: java.lang.String = null,
    interfaces: GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType] = null,
    isTypeOf: GraphQLIsTypeOfFn = null
  ): GraphQLObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (isTypeOf != null) __obj.updateDynamic("isTypeOf")(isTypeOf)
    __obj.asInstanceOf[GraphQLObjectTypeConfig]
  }
}

