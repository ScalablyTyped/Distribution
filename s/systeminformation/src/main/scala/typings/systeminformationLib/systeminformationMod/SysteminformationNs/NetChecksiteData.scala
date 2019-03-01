package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetChecksiteData extends js.Object {
  var ms: scala.Double
  var ok: scala.Boolean
  var status: scala.Double
  var url: java.lang.String
}

object NetChecksiteData {
  @scala.inline
  def apply(ms: scala.Double, ok: scala.Boolean, status: scala.Double, url: java.lang.String): NetChecksiteData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ms")(ms)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[NetChecksiteData]
  }
}

