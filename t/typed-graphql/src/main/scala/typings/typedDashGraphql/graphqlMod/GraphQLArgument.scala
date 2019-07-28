package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLArgument extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var `type`: GraphQLInputType
}

object GraphQLArgument {
  @scala.inline
  def apply(name: String, `type`: GraphQLInputType, defaultValue: js.Any = null, description: String = null): GraphQLArgument = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[GraphQLArgument]
  }
}

