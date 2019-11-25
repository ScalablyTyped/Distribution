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
    val __obj = js.Dynamic.literal(cksum = cksum.asInstanceOf[js.Any], devmaj = devmaj.asInstanceOf[js.Any], devmin = devmin.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], gname = gname.asInstanceOf[js.Any], linkpath = linkpath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], uname = uname.asInstanceOf[js.Any], ustar = ustar.asInstanceOf[js.Any], ustarvar = ustarvar.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

