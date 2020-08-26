package typings.write.anon

import typings.node.fsMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<node.fs.MakeDirectoryOptions, 'recursive'> */
@js.native
trait OmitMakeDirectoryOptionsr extends js.Object {
  var mode: js.UndefOr[Mode] = js.native
}

object OmitMakeDirectoryOptionsr {
  @scala.inline
  def apply(): OmitMakeDirectoryOptionsr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitMakeDirectoryOptionsr]
  }
  @scala.inline
  implicit class OmitMakeDirectoryOptionsrOps[Self <: OmitMakeDirectoryOptionsr] (val x: Self) extends AnyVal {
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
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

