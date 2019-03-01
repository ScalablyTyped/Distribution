package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputObjectFieldConfig extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var `type`: GraphQLInputType
}

object InputObjectFieldConfig {
  @scala.inline
  def apply(`type`: GraphQLInputType, defaultValue: js.Any = null, description: java.lang.String = null): InputObjectFieldConfig = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[InputObjectFieldConfig]
  }
}

