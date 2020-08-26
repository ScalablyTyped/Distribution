package typings.tetherShepherd.TetherShepherd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShepherdTourStepOptions extends js.Object {
  var advanceOn: js.UndefOr[js.Any] = js.native
  var attachTo: js.UndefOr[js.Any] = js.native
  var beforeShowPromise: js.UndefOr[js.Any] = js.native
  var buttons: js.UndefOr[js.Array[IShepherdTourButton]] = js.native
  var classes: js.UndefOr[String] = js.native
  var scrollTo: js.UndefOr[Boolean] = js.native
  var showCancelLink: js.UndefOr[Boolean] = js.native
  var showOn: js.UndefOr[js.Function0[Boolean]] = js.native
  // TODO: Tie this in with the tether.d.ts
  var tetherOptions: js.UndefOr[js.Any] = js.native
  var text: js.UndefOr[js.Any] = js.native
  var title: js.UndefOr[String] = js.native
  var when: js.UndefOr[js.Any] = js.native
}

object IShepherdTourStepOptions {
  @scala.inline
  def apply(): IShepherdTourStepOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShepherdTourStepOptions]
  }
  @scala.inline
  implicit class IShepherdTourStepOptionsOps[Self <: IShepherdTourStepOptions] (val x: Self) extends AnyVal {
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
    def setAdvanceOn(value: js.Any): Self = this.set("advanceOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvanceOn: Self = this.set("advanceOn", js.undefined)
    @scala.inline
    def setAttachTo(value: js.Any): Self = this.set("attachTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachTo: Self = this.set("attachTo", js.undefined)
    @scala.inline
    def setBeforeShowPromise(value: js.Any): Self = this.set("beforeShowPromise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeShowPromise: Self = this.set("beforeShowPromise", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: IShepherdTourButton*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[IShepherdTourButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setScrollTo(value: Boolean): Self = this.set("scrollTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    @scala.inline
    def setShowCancelLink(value: Boolean): Self = this.set("showCancelLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCancelLink: Self = this.set("showCancelLink", js.undefined)
    @scala.inline
    def setShowOn(value: () => Boolean): Self = this.set("showOn", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShowOn: Self = this.set("showOn", js.undefined)
    @scala.inline
    def setTetherOptions(value: js.Any): Self = this.set("tetherOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTetherOptions: Self = this.set("tetherOptions", js.undefined)
    @scala.inline
    def setText(value: js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWhen(value: js.Any): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
  
}

