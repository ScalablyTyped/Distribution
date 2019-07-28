package typings.tar.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var cksum: Double
  var devmaj: Double
  var devmin: Double
  var fill: Double
  var gid: Double
  var gname: Double
  var linkpath: Double
  var mode: Double
  var mtime: Double
  var path: Double
  var prefix: Double
  var size: Double
  var `type`: Double
  var uid: Double
  var uname: Double
  var ustar: Double
  var ustarvar: Double
}

object Fields {
  @scala.inline
  def apply(
    cksum: Double,
    devmaj: Double,
    devmin: Double,
    fill: Double,
    gid: Double,
    gname: Double,
    linkpath: Double,
    mode: Double,
    mtime: Double,
    path: Double,
    prefix: Double,
    size: Double,
    `type`: Double,
    uid: Double,
    uname: Double,
    ustar: Double,
    ustarvar: Double
  ): Fields = {
    val __obj = js.Dynamic.literal(cksum = cksum, devmaj = devmaj, devmin = devmin, fill = fill, gid = gid, gname = gname, linkpath = linkpath, mode = mode, mtime = mtime, path = path, prefix = prefix, size = size, uid = uid, uname = uname, ustar = ustar, ustarvar = ustarvar)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Fields]
  }
}

