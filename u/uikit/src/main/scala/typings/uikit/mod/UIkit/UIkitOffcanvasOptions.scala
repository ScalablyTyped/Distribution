package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitOffcanvasOptions extends js.Object {
  var `bg-close`: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var `esc-close`: js.UndefOr[Boolean] = js.native
  var flip: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
  var overlay: js.UndefOr[Boolean] = js.native
}

object UIkitOffcanvasOptions {
  @scala.inline
  def apply(): UIkitOffcanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitOffcanvasOptions]
  }
  @scala.inline
  implicit class UIkitOffcanvasOptionsOps[Self <: UIkitOffcanvasOptions] (val x: Self) extends AnyVal {
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
    def `setBg-close`(value: Boolean): Self = this.set("bg-close", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBg-close`: Self = this.set("bg-close", js.undefined)
    @scala.inline
    def setContainer(value: String | Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def `setEsc-close`(value: Boolean): Self = this.set("esc-close", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEsc-close`: Self = this.set("esc-close", js.undefined)
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOverlay(value: Boolean): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
  }
  
}

