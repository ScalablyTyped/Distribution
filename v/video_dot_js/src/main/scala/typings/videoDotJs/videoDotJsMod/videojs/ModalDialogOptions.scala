package typings.videoDotJs.videoDotJsMod.videojs

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
trait ModalDialogOptions extends ComponentOptions {
  var content: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var fillAlways: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var temporary: js.UndefOr[Boolean] = js.undefined
  var uncloseable: js.UndefOr[Boolean] = js.undefined
}

object ModalDialogOptions {
  @scala.inline
  def apply(
    children: js.Array[Child] = null,
    content: js.Any = null,
    description: String = null,
    fillAlways: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    temporary: js.UndefOr[Boolean] = js.undefined,
    uncloseable: js.UndefOr[Boolean] = js.undefined
  ): ModalDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (content != null) __obj.updateDynamic("content")(content)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(fillAlways)) __obj.updateDynamic("fillAlways")(fillAlways)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary)
    if (!js.isUndefined(uncloseable)) __obj.updateDynamic("uncloseable")(uncloseable)
    __obj.asInstanceOf[ModalDialogOptions]
  }
}

