package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait License extends js.Object {
  var name: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object License {
  @scala.inline
  def apply(name: java.lang.String, url: java.lang.String = null): License = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[License]
  }
}

