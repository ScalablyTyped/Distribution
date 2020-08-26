package typings.wordpressEditor.postPublishButtonMod.PostPublishButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProps extends js.Object {
  var children: js.UndefOr[scala.Nothing] = js.native
  var focusOnMount: js.UndefOr[Boolean] = js.native
  var forceIsDirty: js.UndefOr[Boolean] = js.native
  var forceIsSaving: js.UndefOr[Boolean] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
}

object BaseProps {
  @scala.inline
  def apply(): BaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProps]
  }
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
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
    def setFocusOnMount(value: Boolean): Self = this.set("focusOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusOnMount: Self = this.set("focusOnMount", js.undefined)
    @scala.inline
    def setForceIsDirty(value: Boolean): Self = this.set("forceIsDirty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIsDirty: Self = this.set("forceIsDirty", js.undefined)
    @scala.inline
    def setForceIsSaving(value: Boolean): Self = this.set("forceIsSaving", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIsSaving: Self = this.set("forceIsSaving", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
  }
  
}

