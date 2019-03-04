package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var cksum: scala.Double
  var devmaj: scala.Double
  var devmin: scala.Double
  var fill: scala.Double
  var gid: scala.Double
  var gname: scala.Double
  var linkpath: scala.Double
  var mode: scala.Double
  var mtime: scala.Double
  var path: scala.Double
  var prefix: scala.Double
  var size: scala.Double
  var `type`: scala.Double
  var uid: scala.Double
  var uname: scala.Double
  var ustar: scala.Double
  var ustarvar: scala.Double
}

object Fields {
  @scala.inline
  def apply(
    cksum: scala.Double,
    devmaj: scala.Double,
    devmin: scala.Double,
    fill: scala.Double,
    gid: scala.Double,
    gname: scala.Double,
    linkpath: scala.Double,
    mode: scala.Double,
    mtime: scala.Double,
    path: scala.Double,
    prefix: scala.Double,
    size: scala.Double,
    `type`: scala.Double,
    uid: scala.Double,
    uname: scala.Double,
    ustar: scala.Double,
    ustarvar: scala.Double
  ): Fields = {
    val __obj = js.Dynamic.literal(cksum = cksum, devmaj = devmaj, devmin = devmin, fill = fill, gid = gid, gname = gname, linkpath = linkpath, mode = mode, mtime = mtime, path = path, prefix = prefix, size = size, uid = uid, uname = uname, ustar = ustar, ustarvar = ustarvar)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Fields]
  }
}

