package typings.vegaTypings.anon

import typings.vegaTypings.vegaTypingsStrings.topojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  var property: js.UndefOr[String] = js.undefined
  var `type`: topojson
}

object Property {
  @scala.inline
  def apply(`type`: topojson, property: String = null): Property = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

