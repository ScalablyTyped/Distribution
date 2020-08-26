package typings.wordpressEditor.postPublishButtonMod.PostPublishButton

import typings.wordpressEditor.wordpressEditorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleProps
  extends BaseProps
     with Props {
  var isToggle: `true` = js.native
  def onToggle(): Unit = js.native
}

object ToggleProps {
  @scala.inline
  def apply(isToggle: `true`, onToggle: () => Unit): ToggleProps = {
    val __obj = js.Dynamic.literal(isToggle = isToggle.asInstanceOf[js.Any], onToggle = js.Any.fromFunction0(onToggle))
    __obj.asInstanceOf[ToggleProps]
  }
  @scala.inline
  implicit class TogglePropsOps[Self <: ToggleProps] (val x: Self) extends AnyVal {
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
    def setIsToggle(value: `true`): Self = this.set("isToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnToggle(value: () => Unit): Self = this.set("onToggle", js.Any.fromFunction0(value))
  }
  
}

