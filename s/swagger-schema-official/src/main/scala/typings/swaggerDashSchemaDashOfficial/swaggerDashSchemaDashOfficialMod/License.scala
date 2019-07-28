package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait License extends js.Object {
  var name: String
  var url: js.UndefOr[String] = js.undefined
}

object License {
  @scala.inline
  def apply(name: String, url: String = null): License = {
    val __obj = js.Dynamic.literal(name = name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[License]
  }
}

