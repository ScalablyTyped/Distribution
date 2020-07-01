package typings.vegaTypings.anon

import typings.std.Element
import typings.std.MouseEvent
import typings.vegaTypings.rendererMod.Renderers
import typings.vegaTypings.runtimeMod.Item
import typings.vegaTypings.runtimeMod.Loader_
import typings.vegaTypings.runtimeMod.LocaleFormatters
import typings.vegaTypings.runtimeMod.TooltipHandler
import typings.vegaUtil.mod.LoggerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var background: js.UndefOr[typings.vegaTypings.colorMod.Color] = js.undefined
  var bind: js.UndefOr[Element | String] = js.undefined
  var container: js.UndefOr[Element | String] = js.undefined
  var expr: js.UndefOr[js.Any] = js.undefined
  var hover: js.UndefOr[Boolean] = js.undefined
  var loader: js.UndefOr[Loader_] = js.undefined
  var locale: js.UndefOr[LocaleFormatters] = js.undefined
  var logLevel: js.UndefOr[Double] = js.undefined
  var logger: js.UndefOr[LoggerInterface] = js.undefined
  var renderer: js.UndefOr[Renderers] = js.undefined
  var tooltip: js.UndefOr[TooltipHandler] = js.undefined
}

object Background {
  @scala.inline
  def apply(
    background: typings.vegaTypings.colorMod.Color = null,
    bind: Element | String = null,
    container: Element | String = null,
    expr: js.Any = null,
    hover: js.UndefOr[Boolean] = js.undefined,
    loader: Loader_ = null,
    locale: LocaleFormatters = null,
    logLevel: js.UndefOr[Double] = js.undefined,
    logger: LoggerInterface = null,
    renderer: Renderers = null,
    tooltip: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit = null
  ): Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (expr != null) __obj.updateDynamic("expr")(expr.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover.get.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(logLevel)) __obj.updateDynamic("logLevel")(logLevel.get.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction4(tooltip))
    __obj.asInstanceOf[Background]
  }
}

