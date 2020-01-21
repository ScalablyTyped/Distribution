package typings.vegaTypings

import typings.vegaTypings.vegaTypingsStrings.topojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperty extends js.Object {
  var property: js.UndefOr[String] = js.undefined
  var `type`: topojson
}

object AnonProperty {
  @scala.inline
  def apply(`type`: topojson, property: String = null): AnonProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProperty]
  }
}

