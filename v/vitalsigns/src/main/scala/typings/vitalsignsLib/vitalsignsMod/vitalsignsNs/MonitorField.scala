package typings
package vitalsignsLib.vitalsignsMod.vitalsignsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorField extends js.Object {
  /**
    * Name.
    * @type {string}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Units.
    * @type {string}
    */
  var units: js.UndefOr[java.lang.String] = js.undefined
}

object MonitorField {
  @scala.inline
  def apply(name: java.lang.String = null, units: java.lang.String = null): MonitorField = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[MonitorField]
  }
}

