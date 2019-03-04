package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsSizeData extends js.Object {
  var fs: java.lang.String
  var mount: java.lang.String
  var size: scala.Double
  var `type`: java.lang.String
  var use: scala.Double
  var used: scala.Double
}

object FsSizeData {
  @scala.inline
  def apply(
    fs: java.lang.String,
    mount: java.lang.String,
    size: scala.Double,
    `type`: java.lang.String,
    use: scala.Double,
    used: scala.Double
  ): FsSizeData = {
    val __obj = js.Dynamic.literal(fs = fs, mount = mount, size = size, use = use, used = used)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FsSizeData]
  }
}

