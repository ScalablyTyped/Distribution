package typings.targz.mod

import typings.node.zlibMod.ZlibOptions
import typings.tarFs.mod.ExtractOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait options extends js.Object {
  var dest: String = js.native
  var gz: js.UndefOr[ZlibOptions] = js.native
  var src: String = js.native
  var tar: js.UndefOr[ExtractOptions] = js.native
}

object options {
  @scala.inline
  def apply(dest: String, src: String): options = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
  @scala.inline
  implicit class optionsOps[Self <: options] (val x: Self) extends AnyVal {
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
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setGz(value: ZlibOptions): Self = this.set("gz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGz: Self = this.set("gz", js.undefined)
    @scala.inline
    def setTar(value: ExtractOptions): Self = this.set("tar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTar: Self = this.set("tar", js.undefined)
  }
  
}

