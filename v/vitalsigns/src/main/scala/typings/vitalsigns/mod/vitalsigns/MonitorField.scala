package typings.vitalsigns.mod.vitalsigns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorField extends js.Object {
  /**
    * Name.
    * @type {string}
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Units.
    * @type {string}
    */
  var units: js.UndefOr[String] = js.undefined
}

object MonitorField {
  @scala.inline
  def apply(name: String = null, units: String = null): MonitorField = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorField]
  }
}

