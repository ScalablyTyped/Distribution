package typings.testingLibraryUserEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITypeOpts extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var initialSelectionEnd: js.UndefOr[Double] = js.native
  var initialSelectionStart: js.UndefOr[Double] = js.native
  var skipAutoClose: js.UndefOr[Boolean] = js.native
  var skipClick: js.UndefOr[Boolean] = js.native
}

object ITypeOpts {
  @scala.inline
  def apply(): ITypeOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeOpts]
  }
  @scala.inline
  implicit class ITypeOptsOps[Self <: ITypeOpts] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setInitialSelectionEnd(value: Double): Self = this.set("initialSelectionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSelectionEnd: Self = this.set("initialSelectionEnd", js.undefined)
    @scala.inline
    def setInitialSelectionStart(value: Double): Self = this.set("initialSelectionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSelectionStart: Self = this.set("initialSelectionStart", js.undefined)
    @scala.inline
    def setSkipAutoClose(value: Boolean): Self = this.set("skipAutoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipAutoClose: Self = this.set("skipAutoClose", js.undefined)
    @scala.inline
    def setSkipClick(value: Boolean): Self = this.set("skipClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipClick: Self = this.set("skipClick", js.undefined)
  }
  
}

