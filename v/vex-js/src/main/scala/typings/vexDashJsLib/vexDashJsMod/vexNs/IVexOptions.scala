package typings
package vexDashJsLib.vexDashJsMod.vexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVexOptions extends js.Object {
  var afterClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterOpen: js.UndefOr[js.Function1[/* vexContent */ jqueryLib.JQuery[stdLib.HTMLElement], scala.Unit]] = js.undefined
  var appendLocation: js.UndefOr[stdLib.HTMLElement | jqueryLib.JQuery[stdLib.HTMLElement] | java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closeCSS: js.UndefOr[ICSSAttributes] = js.undefined
  var closeClassName: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var contentCSS: js.UndefOr[ICSSAttributes] = js.undefined
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var css: js.UndefOr[ICSSAttributes] = js.undefined
  var escapeButtonCloses: js.UndefOr[scala.Boolean] = js.undefined
  var overlayCSS: js.UndefOr[ICSSAttributes] = js.undefined
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayClosesOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
}

object IVexOptions {
  @scala.inline
  def apply(
    afterClose: js.Function0[scala.Unit] = null,
    afterOpen: js.Function1[/* vexContent */ jqueryLib.JQuery[stdLib.HTMLElement], scala.Unit] = null,
    appendLocation: stdLib.HTMLElement | jqueryLib.JQuery[stdLib.HTMLElement] | java.lang.String = null,
    className: java.lang.String = null,
    closeCSS: ICSSAttributes = null,
    closeClassName: java.lang.String = null,
    content: java.lang.String = null,
    contentCSS: ICSSAttributes = null,
    contentClassName: java.lang.String = null,
    css: ICSSAttributes = null,
    escapeButtonCloses: js.UndefOr[scala.Boolean] = js.undefined,
    overlayCSS: ICSSAttributes = null,
    overlayClassName: java.lang.String = null,
    overlayClosesOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  ): IVexOptions = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(afterClose)
    if (afterOpen != null) __obj.updateDynamic("afterOpen")(afterOpen)
    if (appendLocation != null) __obj.updateDynamic("appendLocation")(appendLocation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (closeCSS != null) __obj.updateDynamic("closeCSS")(closeCSS)
    if (closeClassName != null) __obj.updateDynamic("closeClassName")(closeClassName)
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentCSS != null) __obj.updateDynamic("contentCSS")(contentCSS)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(escapeButtonCloses)) __obj.updateDynamic("escapeButtonCloses")(escapeButtonCloses)
    if (overlayCSS != null) __obj.updateDynamic("overlayCSS")(overlayCSS)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (!js.isUndefined(overlayClosesOnClick)) __obj.updateDynamic("overlayClosesOnClick")(overlayClosesOnClick)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    __obj.asInstanceOf[IVexOptions]
  }
}

