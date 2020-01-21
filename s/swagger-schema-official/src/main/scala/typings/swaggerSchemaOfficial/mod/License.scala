package typings.swaggerSchemaOfficial.mod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[License]
  }
}

