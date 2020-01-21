package typings.systeminformation.mod.Systeminformation

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
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsSizeData]
  }
}

