package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 5. File System
trait FsSizeData extends js.Object {
  var fs: String
  var mount: String
  var size: Double
  var `type`: String
  var use: Double
  var used: Double
}

object FsSizeData {
  @scala.inline
  def apply(fs: String, mount: String, size: Double, `type`: String, use: Double, used: Double): FsSizeData = {
    val __obj = js.Dynamic.literal(fs = fs, mount = mount, size = size, use = use, used = used)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FsSizeData]
  }
}

