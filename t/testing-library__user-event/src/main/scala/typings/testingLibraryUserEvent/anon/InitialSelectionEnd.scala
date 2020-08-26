package typings.testingLibraryUserEvent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialSelectionEnd extends js.Object {
  var initialSelectionEnd: js.UndefOr[Double] = js.native
  var initialSelectionStart: js.UndefOr[Double] = js.native
}

object InitialSelectionEnd {
  @scala.inline
  def apply(): InitialSelectionEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialSelectionEnd]
  }
  @scala.inline
  implicit class InitialSelectionEndOps[Self <: InitialSelectionEnd] (val x: Self) extends AnyVal {
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
    def setInitialSelectionEnd(value: Double): Self = this.set("initialSelectionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSelectionEnd: Self = this.set("initialSelectionEnd", js.undefined)
    @scala.inline
    def setInitialSelectionStart(value: Double): Self = this.set("initialSelectionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSelectionStart: Self = this.set("initialSelectionStart", js.undefined)
  }
  
}

