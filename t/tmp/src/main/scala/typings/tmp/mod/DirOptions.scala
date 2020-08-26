package typings.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirOptions extends TmpNameOptions {
  var keep: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[Double] = js.native
  var unsafeCleanup: js.UndefOr[Boolean] = js.native
}

object DirOptions {
  @scala.inline
  def apply(): DirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirOptions]
  }
  @scala.inline
  implicit class DirOptionsOps[Self <: DirOptions] (val x: Self) extends AnyVal {
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
    def setKeep(value: Boolean): Self = this.set("keep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep: Self = this.set("keep", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setUnsafeCleanup(value: Boolean): Self = this.set("unsafeCleanup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafeCleanup: Self = this.set("unsafeCleanup", js.undefined)
  }
  
}

