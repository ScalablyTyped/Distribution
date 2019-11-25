package typings.vexDashJs.vexDashJsMod

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVexOptions extends js.Object {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterOpen: js.UndefOr[js.Function1[/* vexContent */ JQuery[HTMLElement], Unit]] = js.undefined
  var appendLocation: js.UndefOr[HTMLElement | JQuery[HTMLElement] | String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeCSS: js.UndefOr[ICSSAttributes] = js.undefined
  var closeClassName: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentCSS: js.UndefOr[ICSSAttributes] = js.undefined
  var contentClassName: js.UndefOr[String] = js.undefined
  var css: js.UndefOr[ICSSAttributes] = js.undefined
  var escapeButtonCloses: js.UndefOr[Boolean] = js.undefined
  var overlayCSS: js.UndefOr[ICSSAttributes] = js.undefined
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayClosesOnClick: js.UndefOr[Boolean] = js.undefined
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
}

object IVexOptions {
  @scala.inline
  def apply(
    afterClose: () => Unit = null,
    afterOpen: /* vexContent */ JQuery[HTMLElement] => Unit = null,
    appendLocation: HTMLElement | JQuery[HTMLElement] | String = null,
    className: String = null,
    closeCSS: ICSSAttributes = null,
    closeClassName: String = null,
    content: String = null,
    contentCSS: ICSSAttributes = null,
    contentClassName: String = null,
    css: ICSSAttributes = null,
    escapeButtonCloses: js.UndefOr[Boolean] = js.undefined,
    overlayCSS: ICSSAttributes = null,
    overlayClassName: String = null,
    overlayClosesOnClick: js.UndefOr[Boolean] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined
  ): IVexOptions = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (afterOpen != null) __obj.updateDynamic("afterOpen")(js.Any.fromFunction1(afterOpen))
    if (appendLocation != null) __obj.updateDynamic("appendLocation")(appendLocation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeCSS != null) __obj.updateDynamic("closeCSS")(closeCSS.asInstanceOf[js.Any])
    if (closeClassName != null) __obj.updateDynamic("closeClassName")(closeClassName.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentCSS != null) __obj.updateDynamic("contentCSS")(contentCSS.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeButtonCloses)) __obj.updateDynamic("escapeButtonCloses")(escapeButtonCloses.asInstanceOf[js.Any])
    if (overlayCSS != null) __obj.updateDynamic("overlayCSS")(overlayCSS.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayClosesOnClick)) __obj.updateDynamic("overlayClosesOnClick")(overlayClosesOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVexOptions]
  }
}

