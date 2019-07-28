package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var values: GraphQLEnumValueConfigMap
}

object GraphQLEnumTypeConfig {
  @scala.inline
  def apply(name: String, values: GraphQLEnumValueConfigMap, description: String = null): GraphQLEnumTypeConfig = {
    val __obj = js.Dynamic.literal(name = name, values = values)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[GraphQLEnumTypeConfig]
  }
}

