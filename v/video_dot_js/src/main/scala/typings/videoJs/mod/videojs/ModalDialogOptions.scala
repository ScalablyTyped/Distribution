package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for this class
  *
  * @param [content=undefined]
  *        Provide customized content for this modal.
  *
  * @param [description]
  *        A text description for the modal, primarily for accessibility.
  *
  * @param [fillAlways=false]
  *        Normally, modals are automatically filled only the first time
  *        they open. This tells the modal to refresh its content
  *        every time it opens.
  *
  * @param [label]
  *        A text label for the modal, primarily for accessibility.
  *
  * @param [temporary=true]
  *        If `true`, the modal can only be opened once; it will be
  *        disposed as soon as it's closed.
  *
  * @param [uncloseable=false]
  *        If `true`, the user will not be able to close the modal
  *        through the UI in the normal ways. Programmatic closing is
  *        still possible.
  */
@js.native
trait ModalDialogOptions extends ComponentOptions {
  var content: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String] = js.native
  var fillAlways: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var temporary: js.UndefOr[Boolean] = js.native
  var uncloseable: js.UndefOr[Boolean] = js.native
}

object ModalDialogOptions {
  @scala.inline
  def apply(): ModalDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogOptions]
  }
  @scala.inline
  implicit class ModalDialogOptionsOps[Self <: ModalDialogOptions] (val x: Self) extends AnyVal {
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFillAlways(value: Boolean): Self = this.set("fillAlways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillAlways: Self = this.set("fillAlways", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setTemporary(value: Boolean): Self = this.set("temporary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporary: Self = this.set("temporary", js.undefined)
    @scala.inline
    def setUncloseable(value: Boolean): Self = this.set("uncloseable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncloseable: Self = this.set("uncloseable", js.undefined)
  }
  
}

