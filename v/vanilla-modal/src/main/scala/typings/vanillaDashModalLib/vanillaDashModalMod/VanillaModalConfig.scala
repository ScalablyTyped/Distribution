package typings
package vanillaDashModalLib.vanillaDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VanillaModalConfig extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var clickOutside: js.UndefOr[scala.Boolean] = js.undefined
  var close: js.UndefOr[java.lang.String] = js.undefined
  var closeKeys: js.UndefOr[js.Array[scala.Double] | js.Array[js.UndefOr[scala.Nothing]] | scala.Boolean] = js.undefined
  var loadClass: js.UndefOr[java.lang.String] = js.undefined
  var modal: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var modalContent: js.UndefOr[java.lang.String] = js.undefined
  var modalInner: js.UndefOr[java.lang.String] = js.undefined
  var onBeforeClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  var onBeforeOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  var onClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  var open: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[java.lang.String] = js.undefined
  var transitionEnd: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.undefined
  var transitions: js.UndefOr[java.lang.String] = js.undefined
}

object VanillaModalConfig {
  @scala.inline
  def apply(
    `class`: java.lang.String = null,
    clickOutside: js.UndefOr[scala.Boolean] = js.undefined,
    close: java.lang.String = null,
    closeKeys: js.Array[scala.Double] | js.Array[js.UndefOr[scala.Nothing]] | scala.Boolean = null,
    loadClass: java.lang.String = null,
    modal: java.lang.String | stdLib.HTMLElement = null,
    modalContent: java.lang.String = null,
    modalInner: java.lang.String = null,
    onBeforeClose: () => js.UndefOr[scala.Nothing] = null,
    onBeforeOpen: () => js.UndefOr[scala.Nothing] = null,
    onClose: () => js.UndefOr[scala.Nothing] = null,
    onOpen: () => js.UndefOr[scala.Nothing] = null,
    open: java.lang.String = null,
    page: java.lang.String = null,
    transitionEnd: () => js.UndefOr[scala.Nothing] = null,
    transitions: java.lang.String = null
  ): VanillaModalConfig = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (!js.isUndefined(clickOutside)) __obj.updateDynamic("clickOutside")(clickOutside)
    if (close != null) __obj.updateDynamic("close")(close)
    if (closeKeys != null) __obj.updateDynamic("closeKeys")(closeKeys.asInstanceOf[js.Any])
    if (loadClass != null) __obj.updateDynamic("loadClass")(loadClass)
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (modalContent != null) __obj.updateDynamic("modalContent")(modalContent)
    if (modalInner != null) __obj.updateDynamic("modalInner")(modalInner)
    if (onBeforeClose != null) __obj.updateDynamic("onBeforeClose")(js.Any.fromFunction0(onBeforeClose))
    if (onBeforeOpen != null) __obj.updateDynamic("onBeforeOpen")(js.Any.fromFunction0(onBeforeOpen))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (open != null) __obj.updateDynamic("open")(open)
    if (page != null) __obj.updateDynamic("page")(page)
    if (transitionEnd != null) __obj.updateDynamic("transitionEnd")(js.Any.fromFunction0(transitionEnd))
    if (transitions != null) __obj.updateDynamic("transitions")(transitions)
    __obj.asInstanceOf[VanillaModalConfig]
  }
}

