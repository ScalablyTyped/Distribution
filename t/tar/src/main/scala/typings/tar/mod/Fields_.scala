package typings.tar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields_ extends js.Object {
  var cksum: Double = js.native
  var devmaj: Double = js.native
  var devmin: Double = js.native
  var fill: Double = js.native
  var gid: Double = js.native
  var gname: Double = js.native
  var linkpath: Double = js.native
  var mode: Double = js.native
  var mtime: Double = js.native
  var path: Double = js.native
  var prefix: Double = js.native
  var size: Double = js.native
  var `type`: Double = js.native
  var uid: Double = js.native
  var uname: Double = js.native
  var ustar: Double = js.native
  var ustarvar: Double = js.native
}

object Fields_ {
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
  ): Fields_ = {
    val __obj = js.Dynamic.literal(cksum = cksum.asInstanceOf[js.Any], devmaj = devmaj.asInstanceOf[js.Any], devmin = devmin.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], gname = gname.asInstanceOf[js.Any], linkpath = linkpath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], uname = uname.asInstanceOf[js.Any], ustar = ustar.asInstanceOf[js.Any], ustarvar = ustarvar.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields_]
  }
  @scala.inline
  implicit class Fields_Ops[Self <: Fields_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCksum(value: Double): Self = this.set("cksum", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevmaj(value: Double): Self = this.set("devmaj", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevmin(value: Double): Self = this.set("devmin", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: Double): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setGname(value: Double): Self = this.set("gname", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkpath(value: Double): Self = this.set("linkpath", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: Double): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: Double): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUname(value: Double): Self = this.set("uname", value.asInstanceOf[js.Any])
    @scala.inline
    def setUstar(value: Double): Self = this.set("ustar", value.asInstanceOf[js.Any])
    @scala.inline
    def setUstarvar(value: Double): Self = this.set("ustarvar", value.asInstanceOf[js.Any])
  }
  
}

