package typings
package tingleDotJsLib.tingleDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var beforeClose: js.UndefOr[js.ThisFunction0[/* this */ modal, js.UndefOr[scala.Boolean]]] = js.undefined
  var beforeOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var closeLabel: js.UndefOr[java.lang.String] = js.undefined
  var closeMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var cssClass: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var footer: js.UndefOr[scala.Boolean] = js.undefined
  var onClose: js.UndefOr[js.ThisFunction0[/* this */ modal, scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.ThisFunction0[/* this */ modal, scala.Unit]] = js.undefined
  var stickyFooter: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    beforeClose: js.ThisFunction0[/* this */ modal, js.UndefOr[scala.Boolean]] = null,
    beforeOpen: js.Function0[scala.Unit] = null,
    closeLabel: java.lang.String = null,
    closeMethods: js.Array[java.lang.String] = null,
    cssClass: js.Array[java.lang.String] = null,
    footer: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: js.ThisFunction0[/* this */ modal, scala.Unit] = null,
    onOpen: js.ThisFunction0[/* this */ modal, scala.Unit] = null,
    stickyFooter: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen)
    if (closeLabel != null) __obj.updateDynamic("closeLabel")(closeLabel)
    if (closeMethods != null) __obj.updateDynamic("closeMethods")(closeMethods)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (!js.isUndefined(stickyFooter)) __obj.updateDynamic("stickyFooter")(stickyFooter)
    __obj.asInstanceOf[Options]
  }
}

