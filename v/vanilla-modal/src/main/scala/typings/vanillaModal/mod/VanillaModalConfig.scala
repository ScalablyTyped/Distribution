package typings.vanillaModal.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VanillaModalConfig extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var clickOutside: js.UndefOr[Boolean] = js.undefined
  var close: js.UndefOr[String] = js.undefined
  var closeKeys: js.UndefOr[js.Array[js.UndefOr[Double]] | Boolean] = js.undefined
  var loadClass: js.UndefOr[String] = js.undefined
  var modal: js.UndefOr[String | HTMLElement] = js.undefined
  var modalContent: js.UndefOr[String] = js.undefined
  var modalInner: js.UndefOr[String] = js.undefined
  var onBeforeClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  var onBeforeOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  var onClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  var open: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[String] = js.undefined
  var transitionEnd: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  var transitions: js.UndefOr[String] = js.undefined
}

object VanillaModalConfig {
  @scala.inline
  def apply(
    `class`: String = null,
    clickOutside: js.UndefOr[Boolean] = js.undefined,
    close: String = null,
    closeKeys: js.Array[js.UndefOr[Double]] | Boolean = null,
    loadClass: String = null,
    modal: String | HTMLElement = null,
    modalContent: String = null,
    modalInner: String = null,
    onBeforeClose: () => js.UndefOr[scala.Nothing] = null,
    onBeforeOpen: () => js.UndefOr[scala.Nothing] = null,
    onClose: () => js.UndefOr[scala.Nothing] = null,
    onOpen: () => js.UndefOr[scala.Nothing] = null,
    open: String = null,
    page: String = null,
    transitionEnd: () => js.UndefOr[scala.Nothing] = null,
    transitions: String = null
  ): VanillaModalConfig = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(clickOutside)) __obj.updateDynamic("clickOutside")(clickOutside.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (closeKeys != null) __obj.updateDynamic("closeKeys")(closeKeys.asInstanceOf[js.Any])
    if (loadClass != null) __obj.updateDynamic("loadClass")(loadClass.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (modalContent != null) __obj.updateDynamic("modalContent")(modalContent.asInstanceOf[js.Any])
    if (modalInner != null) __obj.updateDynamic("modalInner")(modalInner.asInstanceOf[js.Any])
    if (onBeforeClose != null) __obj.updateDynamic("onBeforeClose")(js.Any.fromFunction0(onBeforeClose))
    if (onBeforeOpen != null) __obj.updateDynamic("onBeforeOpen")(js.Any.fromFunction0(onBeforeOpen))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (transitionEnd != null) __obj.updateDynamic("transitionEnd")(js.Any.fromFunction0(transitionEnd))
    if (transitions != null) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VanillaModalConfig]
  }
}

