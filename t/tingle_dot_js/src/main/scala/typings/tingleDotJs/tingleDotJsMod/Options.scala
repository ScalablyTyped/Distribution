package typings.tingleDotJs.tingleDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var beforeClose: js.UndefOr[js.ThisFunction0[/* this */ modal, js.UndefOr[Boolean]]] = js.undefined
  var beforeOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var closeLabel: js.UndefOr[String] = js.undefined
  var closeMethods: js.UndefOr[js.Array[String]] = js.undefined
  var cssClass: js.UndefOr[js.Array[String]] = js.undefined
  var footer: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[js.ThisFunction0[/* this */ modal, Unit]] = js.undefined
  var onOpen: js.UndefOr[js.ThisFunction0[/* this */ modal, Unit]] = js.undefined
  var stickyFooter: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    beforeClose: js.ThisFunction0[/* this */ modal, js.UndefOr[Boolean]] = null,
    beforeOpen: () => Unit = null,
    closeLabel: String = null,
    closeMethods: js.Array[String] = null,
    cssClass: js.Array[String] = null,
    footer: js.UndefOr[Boolean] = js.undefined,
    onClose: js.ThisFunction0[/* this */ modal, Unit] = null,
    onOpen: js.ThisFunction0[/* this */ modal, Unit] = null,
    stickyFooter: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose.asInstanceOf[js.Any])
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction0(beforeOpen))
    if (closeLabel != null) __obj.updateDynamic("closeLabel")(closeLabel.asInstanceOf[js.Any])
    if (closeMethods != null) __obj.updateDynamic("closeMethods")(closeMethods.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyFooter)) __obj.updateDynamic("stickyFooter")(stickyFooter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

