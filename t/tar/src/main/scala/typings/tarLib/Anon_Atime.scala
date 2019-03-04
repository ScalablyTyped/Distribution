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
    val __obj = js.Dynamic.literal(atime = atime, cksum = cksum, ctime = ctime, dev = dev, devmaj = devmaj, devmin = devmin, gid = gid, ino = ino, mode = mode, mtime = mtime, nlink = nlink, size = size, uid = uid)
  
    __obj.asInstanceOf[Anon_Atime]
  }
}

