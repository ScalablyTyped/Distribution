package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputObjectField extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var `type`: GraphQLInputType
}

object InputObjectField {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: GraphQLInputType,
    defaultValue: js.Any = null,
    description: java.lang.String = null
  ): InputObjectField = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[InputObjectField]
  }
}

