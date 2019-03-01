package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputObjectConfig extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fields: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap
  var name: java.lang.String
}

object InputObjectConfig {
  @scala.inline
  def apply(
    fields: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap,
    name: java.lang.String,
    description: java.lang.String = null
  ): InputObjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[InputObjectConfig]
  }
}

