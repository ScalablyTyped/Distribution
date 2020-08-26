package typings.wordpressEditor.postPublishButtonMod.PostPublishButton

import typings.wordpressEditor.wordpressEditorBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitProps
  extends BaseProps
     with Props {
  var isToggle: js.UndefOr[`false`] = js.native
  var onSubmit: js.UndefOr[js.Function0[Unit]] = js.native
}

object SubmitProps {
  @scala.inline
  def apply(): SubmitProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitProps]
  }
  @scala.inline
  implicit class SubmitPropsOps[Self <: SubmitProps] (val x: Self) extends AnyVal {
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
    def setIsToggle(value: `false`): Self = this.set("isToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsToggle: Self = this.set("isToggle", js.undefined)
    @scala.inline
    def setOnSubmit(value: () => Unit): Self = this.set("onSubmit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
  }
  
}

