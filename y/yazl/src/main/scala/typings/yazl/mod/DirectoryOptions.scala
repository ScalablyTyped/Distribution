package typings.yazl.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryOptions extends js.Object {
  var mode: Double = js.native
  var mtime: Date = js.native
}

object DirectoryOptions {
  @scala.inline
  def apply(mode: Double, mtime: Date): DirectoryOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryOptions]
  }
  @scala.inline
  implicit class DirectoryOptionsOps[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
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
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
  }
  
}

