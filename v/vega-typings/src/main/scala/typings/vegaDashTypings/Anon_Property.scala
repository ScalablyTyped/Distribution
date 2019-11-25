package typings.vegaDashTypings

import typings.vegaDashTypings.vegaDashTypingsStrings.topojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Property extends js.Object {
  var property: js.UndefOr[String] = js.undefined
  var `type`: topojson
}

object Anon_Property {
  @scala.inline
  def apply(`type`: topojson, property: String = null): Anon_Property = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Property]
  }
}

