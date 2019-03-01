package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalDocs extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object ExternalDocs {
  @scala.inline
  def apply(url: java.lang.String, description: java.lang.String = null): ExternalDocs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ExternalDocs]
  }
}

