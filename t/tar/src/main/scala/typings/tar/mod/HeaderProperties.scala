package typings.tar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderProperties extends js.Object {
  var devmaj: js.UndefOr[Double] = js.native
  var devmin: js.UndefOr[Double] = js.native
  var gid: js.UndefOr[Double] = js.native
  var gname: js.UndefOr[String] = js.native
  var mode: js.UndefOr[Double] = js.native
  var mtime: js.UndefOr[Double] = js.native
  var noProprietary: js.UndefOr[Boolean] = js.native
  var path: String = js.native
  var size: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var uid: js.UndefOr[Double] = js.native
  var uname: js.UndefOr[String] = js.native
}

object HeaderProperties {
  @scala.inline
  def apply(path: String): HeaderProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProperties]
  }
  @scala.inline
  implicit class HeaderPropertiesOps[Self <: HeaderProperties] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevmaj(value: Double): Self = this.set("devmaj", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevmaj: Self = this.set("devmaj", js.undefined)
    @scala.inline
    def setDevmin(value: Double): Self = this.set("devmin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevmin: Self = this.set("devmin", js.undefined)
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setGname(value: String): Self = this.set("gname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGname: Self = this.set("gname", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMtime(value: Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    @scala.inline
    def setNoProprietary(value: Boolean): Self = this.set("noProprietary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoProprietary: Self = this.set("noProprietary", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setUname(value: String): Self = this.set("uname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUname: Self = this.set("uname", js.undefined)
  }
  
}

