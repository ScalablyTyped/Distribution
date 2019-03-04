package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSecurity extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object BaseSecurity {
  @scala.inline
  def apply(`type`: java.lang.String, description: java.lang.String = null): BaseSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[BaseSecurity]
  }
}

