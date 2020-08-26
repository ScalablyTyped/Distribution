package typings.yazl.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yazl.yazl.DirectoryOptions> */
@js.native
trait PartialDirectoryOptions extends js.Object {
  var mode: js.UndefOr[Double] = js.native
  var mtime: js.UndefOr[Date] = js.native
}

object PartialDirectoryOptions {
  @scala.inline
  def apply(): PartialDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDirectoryOptions]
  }
  @scala.inline
  implicit class PartialDirectoryOptionsOps[Self <: PartialDirectoryOptions] (val x: Self) extends AnyVal {
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
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
  }
  
}

