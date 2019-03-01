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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fs")(fs)
    __obj.updateDynamic("mount")(mount)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("use")(use)
    __obj.updateDynamic("used")(used)
    __obj.asInstanceOf[FsSizeData]
  }
}

