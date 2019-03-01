package typings
package tarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Atime extends js.Object {
  var atime: scala.Boolean
  var cksum: scala.Boolean
  var ctime: scala.Boolean
  var dev: scala.Boolean
  var devmaj: scala.Boolean
  var devmin: scala.Boolean
  var gid: scala.Boolean
  var ino: scala.Boolean
  var mode: scala.Boolean
  var mtime: scala.Boolean
  var nlink: scala.Boolean
  var size: scala.Boolean
  var uid: scala.Boolean
}

object Anon_Atime {
  @scala.inline
  def apply(
    atime: scala.Boolean,
    cksum: scala.Boolean,
    ctime: scala.Boolean,
    dev: scala.Boolean,
    devmaj: scala.Boolean,
    devmin: scala.Boolean,
    gid: scala.Boolean,
    ino: scala.Boolean,
    mode: scala.Boolean,
    mtime: scala.Boolean,
    nlink: scala.Boolean,
    size: scala.Boolean,
    uid: scala.Boolean
  ): Anon_Atime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atime")(atime)
    __obj.updateDynamic("cksum")(cksum)
    __obj.updateDynamic("ctime")(ctime)
    __obj.updateDynamic("dev")(dev)
    __obj.updateDynamic("devmaj")(devmaj)
    __obj.updateDynamic("devmin")(devmin)
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("ino")(ino)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("nlink")(nlink)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[Anon_Atime]
  }
}

