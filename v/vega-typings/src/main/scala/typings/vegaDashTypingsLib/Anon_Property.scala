package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Property extends js.Object {
  var property: js.UndefOr[java.lang.String] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.topojson
}

object Anon_Property {
  @scala.inline
  def apply(`type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.topojson, property: java.lang.String = null): Anon_Property = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[Anon_Property]
  }
}

