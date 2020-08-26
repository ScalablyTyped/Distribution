package typings.yazl.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yazl.yazl.ReadStreamOptions> */
@js.native
trait PartialReadStreamOptions extends js.Object {
  var compress: js.UndefOr[Boolean] = js.native
  var forceZip64Format: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[Double] = js.native
  var mtime: js.UndefOr[Date] = js.native
  var size: js.UndefOr[Double] = js.native
}

object PartialReadStreamOptions {
  @scala.inline
  def apply(): PartialReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadStreamOptions]
  }
  @scala.inline
  implicit class PartialReadStreamOptionsOps[Self <: PartialReadStreamOptions] (val x: Self) extends AnyVal {
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
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setForceZip64Format(value: Boolean): Self = this.set("forceZip64Format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceZip64Format: Self = this.set("forceZip64Format", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

