package typings
package tetherDashDropLib.tetherDashDropMod.DropNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropOptions extends js.Object {
  var beforeClose: js.UndefOr[
    js.Function2[
      /* event */ stdLib.Event, 
      /* drop */ tetherDashDropLib.tetherDashDropMod.Drop, 
      scala.Boolean
    ]
  ] = js.undefined
  var blurDelay: js.UndefOr[scala.Double] = js.undefined
  var classes: js.UndefOr[java.lang.String] = js.undefined
  var closeDelay: js.UndefOr[scala.Double] = js.undefined
  var constrainToScrollParent: js.UndefOr[scala.Boolean] = js.undefined
  var constrainToWindow: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[
    stdLib.Element | java.lang.String | (js.Function1[/* drop */ js.UndefOr[tetherDashDropLib.tetherDashDropMod.Drop], java.lang.String]) | (js.Function1[/* drop */ js.UndefOr[tetherDashDropLib.tetherDashDropMod.Drop], stdLib.Element])
  ] = js.undefined
  var focusDelay: js.UndefOr[scala.Double] = js.undefined
  var hoverCloseDelay: js.UndefOr[scala.Double] = js.undefined
  var hoverOpenDelay: js.UndefOr[scala.Double] = js.undefined
  var openDelay: js.UndefOr[scala.Double] = js.undefined
  var openOn: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var tetherOptions: js.UndefOr[tetherLib.tetherMod.TetherNs.ITetherOptions] = js.undefined
}

object IDropOptions {
  @scala.inline
  def apply(
    beforeClose: (/* event */ stdLib.Event, /* drop */ tetherDashDropLib.tetherDashDropMod.Drop) => scala.Boolean = null,
    blurDelay: scala.Int | scala.Double = null,
    classes: java.lang.String = null,
    closeDelay: scala.Int | scala.Double = null,
    constrainToScrollParent: js.UndefOr[scala.Boolean] = js.undefined,
    constrainToWindow: js.UndefOr[scala.Boolean] = js.undefined,
    content: stdLib.Element | java.lang.String | (js.Function1[/* drop */ js.UndefOr[tetherDashDropLib.tetherDashDropMod.Drop], java.lang.String]) | (js.Function1[/* drop */ js.UndefOr[tetherDashDropLib.tetherDashDropMod.Drop], stdLib.Element]) = null,
    focusDelay: scala.Int | scala.Double = null,
    hoverCloseDelay: scala.Int | scala.Double = null,
    hoverOpenDelay: scala.Int | scala.Double = null,
    openDelay: scala.Int | scala.Double = null,
    openOn: java.lang.String = null,
    position: java.lang.String = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    target: stdLib.Element = null,
    tetherOptions: tetherLib.tetherMod.TetherNs.ITetherOptions = null
  ): IDropOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction2(beforeClose))
    if (blurDelay != null) __obj.updateDynamic("blurDelay")(blurDelay.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (closeDelay != null) __obj.updateDynamic("closeDelay")(closeDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainToScrollParent)) __obj.updateDynamic("constrainToScrollParent")(constrainToScrollParent)
    if (!js.isUndefined(constrainToWindow)) __obj.updateDynamic("constrainToWindow")(constrainToWindow)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (focusDelay != null) __obj.updateDynamic("focusDelay")(focusDelay.asInstanceOf[js.Any])
    if (hoverCloseDelay != null) __obj.updateDynamic("hoverCloseDelay")(hoverCloseDelay.asInstanceOf[js.Any])
    if (hoverOpenDelay != null) __obj.updateDynamic("hoverOpenDelay")(hoverOpenDelay.asInstanceOf[js.Any])
    if (openDelay != null) __obj.updateDynamic("openDelay")(openDelay.asInstanceOf[js.Any])
    if (openOn != null) __obj.updateDynamic("openOn")(openOn)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (target != null) __obj.updateDynamic("target")(target)
    if (tetherOptions != null) __obj.updateDynamic("tetherOptions")(tetherOptions)
    __obj.asInstanceOf[IDropOptions]
  }
}

