package typings.tetherDrop.mod

import typings.std.Element
import typings.std.Event
import typings.tether.mod.ITetherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropOptions extends js.Object {
  var beforeClose: js.UndefOr[js.Function2[/* event */ Event, /* drop */ Drop, Boolean]] = js.undefined
  var blurDelay: js.UndefOr[Double] = js.undefined
  var classes: js.UndefOr[String] = js.undefined
  var closeDelay: js.UndefOr[Double] = js.undefined
  var constrainToScrollParent: js.UndefOr[Boolean] = js.undefined
  var constrainToWindow: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[Element | String | (js.Function1[js.UndefOr[Drop], Element | String])] = js.undefined
  var focusDelay: js.UndefOr[Double] = js.undefined
  var hoverCloseDelay: js.UndefOr[Double] = js.undefined
  var hoverOpenDelay: js.UndefOr[Double] = js.undefined
  var openDelay: js.UndefOr[Double] = js.undefined
  var openOn: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var tetherOptions: js.UndefOr[ITetherOptions] = js.undefined
}

object IDropOptions {
  @scala.inline
  def apply(
    beforeClose: (/* event */ Event, /* drop */ Drop) => Boolean = null,
    blurDelay: js.UndefOr[Double] = js.undefined,
    classes: String = null,
    closeDelay: js.UndefOr[Double] = js.undefined,
    constrainToScrollParent: js.UndefOr[Boolean] = js.undefined,
    constrainToWindow: js.UndefOr[Boolean] = js.undefined,
    content: Element | String | (js.Function1[js.UndefOr[Drop], Element | String]) = null,
    focusDelay: js.UndefOr[Double] = js.undefined,
    hoverCloseDelay: js.UndefOr[Double] = js.undefined,
    hoverOpenDelay: js.UndefOr[Double] = js.undefined,
    openDelay: js.UndefOr[Double] = js.undefined,
    openOn: String = null,
    position: String = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    target: Element = null,
    tetherOptions: ITetherOptions = null
  ): IDropOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction2(beforeClose))
    if (!js.isUndefined(blurDelay)) __obj.updateDynamic("blurDelay")(blurDelay.get.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(closeDelay)) __obj.updateDynamic("closeDelay")(closeDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainToScrollParent)) __obj.updateDynamic("constrainToScrollParent")(constrainToScrollParent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainToWindow)) __obj.updateDynamic("constrainToWindow")(constrainToWindow.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(focusDelay)) __obj.updateDynamic("focusDelay")(focusDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverCloseDelay)) __obj.updateDynamic("hoverCloseDelay")(hoverCloseDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverOpenDelay)) __obj.updateDynamic("hoverOpenDelay")(hoverOpenDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openDelay)) __obj.updateDynamic("openDelay")(openDelay.get.asInstanceOf[js.Any])
    if (openOn != null) __obj.updateDynamic("openOn")(openOn.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tetherOptions != null) __obj.updateDynamic("tetherOptions")(tetherOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropOptions]
  }
}

