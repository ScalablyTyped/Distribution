package typings
package tarDashFsLib.tarDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var gid: scala.Double
  var mode: scala.Double
  var mtime: stdLib.Date
  var name: java.lang.String
  var size: scala.Double
  var `type`: tarDashFsLib.tarDashFsLibStrings.file | tarDashFsLib.tarDashFsLibStrings.directory | tarDashFsLib.tarDashFsLibStrings.link | tarDashFsLib.tarDashFsLibStrings.symlink
  var uid: scala.Double
}

object Headers {
  @scala.inline
  def apply(
    gid: scala.Double,
    mode: scala.Double,
    mtime: stdLib.Date,
    name: java.lang.String,
    size: scala.Double,
    `type`: tarDashFsLib.tarDashFsLibStrings.file | tarDashFsLib.tarDashFsLibStrings.directory | tarDashFsLib.tarDashFsLibStrings.link | tarDashFsLib.tarDashFsLibStrings.symlink,
    uid: scala.Double
  ): Headers = {
    val __obj = js.Dynamic.literal(gid = gid, mode = mode, mtime = mtime, name = name, size = size, uid = uid)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

