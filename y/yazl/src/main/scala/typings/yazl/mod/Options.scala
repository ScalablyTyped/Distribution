package typings.yazl.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var compress: Boolean = js.native
  var forceZip64Format: Boolean = js.native
  var mode: Double = js.native
  var mtime: Date = js.native
}

object Options {
  @scala.inline
  def apply(compress: Boolean, forceZip64Format: Boolean, mode: Double, mtime: Date): Options = {
    val __obj = js.Dynamic.literal(compress = compress.asInstanceOf[js.Any], forceZip64Format = forceZip64Format.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceZip64Format(value: Boolean): Self = this.set("forceZip64Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
  }
  
}

