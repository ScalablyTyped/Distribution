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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("cksum")(cksum)
    __obj.updateDynamic("devmaj")(devmaj)
    __obj.updateDynamic("devmin")(devmin)
    __obj.updateDynamic("fill")(fill)
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("gname")(gname)
    __obj.updateDynamic("linkpath")(linkpath)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uid")(uid)
    __obj.updateDynamic("uname")(uname)
    __obj.updateDynamic("ustar")(ustar)
    __obj.updateDynamic("ustarvar")(ustarvar)
    __obj.asInstanceOf[Fields]
  }
}

