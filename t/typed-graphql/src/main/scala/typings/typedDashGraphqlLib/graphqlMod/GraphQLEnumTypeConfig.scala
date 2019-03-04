package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumTypeConfig extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var values: GraphQLEnumValueConfigMap
}

object GraphQLEnumTypeConfig {
  @scala.inline
  def apply(name: java.lang.String, values: GraphQLEnumValueConfigMap, description: java.lang.String = null): GraphQLEnumTypeConfig = {
    val __obj = js.Dynamic.literal(name = name, values = values)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[GraphQLEnumTypeConfig]
  }
}

