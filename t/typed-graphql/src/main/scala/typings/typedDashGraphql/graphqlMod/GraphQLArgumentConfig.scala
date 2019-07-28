package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLArgumentConfig extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var `type`: GraphQLInputType
}

object GraphQLArgumentConfig {
  @scala.inline
  def apply(`type`: GraphQLInputType, defaultValue: js.Any = null, description: String = null): GraphQLArgumentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[GraphQLArgumentConfig]
  }
}

