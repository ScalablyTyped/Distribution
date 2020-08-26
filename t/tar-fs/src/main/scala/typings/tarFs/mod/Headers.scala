package typings.tarFs.mod

import typings.std.Date
import typings.tarFs.tarFsStrings.directory
import typings.tarFs.tarFsStrings.file
import typings.tarFs.tarFsStrings.link
import typings.tarFs.tarFsStrings.symlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  var gid: Double = js.native
  var mode: Double = js.native
  var mtime: Date = js.native
  var name: String = js.native
  var size: Double = js.native
  var `type`: file | directory | link | symlink = js.native
  var uid: Double = js.native
}

object Headers {
  @scala.inline
  def apply(
    gid: Double,
    mode: Double,
    mtime: Date,
    name: String,
    size: Double,
    `type`: file | directory | link | symlink,
    uid: Double
  ): Headers = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
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
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: file | directory | link | symlink): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

