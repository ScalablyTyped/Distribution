package typings
package vegaDashEmbedLib.vegaDashEmbedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbedOptions extends js.Object {
  var actions: js.UndefOr[scala.Boolean | Actions] = js.undefined
  var config: js.UndefOr[java.lang.String | vegaDashEmbedLib.buildSrcTypesMod.Config] = js.undefined
  var defaultStyle: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var editorUrl: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hover: js.UndefOr[scala.Boolean] = js.undefined
  var i18n: js.UndefOr[stdLib.Partial[vegaDashEmbedLib.Anon_COMPILEDACTION]] = js.undefined
  var loader: js.UndefOr[
    vegaDashTypingsLib.typesRuntimeMod.Loader | vegaDashTypingsLib.typesRuntimeMod.LoaderOptions
  ] = js.undefined
  var logLevel: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[vegaDashEmbedLib.buildSrcTypesMod.Mode] = js.undefined
  var onBeforeParse: js.UndefOr[js.Function1[/* spec */ VisualizationSpec, VisualizationSpec]] = js.undefined
  var padding: js.UndefOr[scala.Double | vegaDashEmbedLib.Anon_Bottom] = js.undefined
  var renderer: js.UndefOr[vegaDashTypingsLib.typesRuntimeRendererMod.Renderers] = js.undefined
  var runAsync: js.UndefOr[scala.Boolean] = js.undefined
  var scaleFactor: js.UndefOr[scala.Double] = js.undefined
  var sourceFooter: js.UndefOr[java.lang.String] = js.undefined
  var sourceHeader: js.UndefOr[java.lang.String] = js.undefined
  var theme: js.UndefOr[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.excel | vegaDashEmbedLib.vegaDashEmbedLibStrings.ggplot2 | vegaDashEmbedLib.vegaDashEmbedLibStrings.quartz | vegaDashEmbedLib.vegaDashEmbedLibStrings.vox | vegaDashEmbedLib.vegaDashEmbedLibStrings.dark
  ] = js.undefined
  var tooltip: js.UndefOr[
    vegaDashTypingsLib.typesRuntimeMod.TooltipHandler | vegaDashTooltipLib.buildDefaultsMod.Options | scala.Boolean
  ] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object EmbedOptions {
  @scala.inline
  def apply(
    actions: scala.Boolean | Actions = null,
    config: java.lang.String | vegaDashEmbedLib.buildSrcTypesMod.Config = null,
    defaultStyle: scala.Boolean | java.lang.String = null,
    editorUrl: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    hover: js.UndefOr[scala.Boolean] = js.undefined,
    i18n: stdLib.Partial[vegaDashEmbedLib.Anon_COMPILEDACTION] = null,
    loader: vegaDashTypingsLib.typesRuntimeMod.Loader | vegaDashTypingsLib.typesRuntimeMod.LoaderOptions = null,
    logLevel: scala.Int | scala.Double = null,
    mode: vegaDashEmbedLib.buildSrcTypesMod.Mode = null,
    onBeforeParse: /* spec */ VisualizationSpec => VisualizationSpec = null,
    padding: scala.Double | vegaDashEmbedLib.Anon_Bottom = null,
    renderer: vegaDashTypingsLib.typesRuntimeRendererMod.Renderers = null,
    runAsync: js.UndefOr[scala.Boolean] = js.undefined,
    scaleFactor: scala.Int | scala.Double = null,
    sourceFooter: java.lang.String = null,
    sourceHeader: java.lang.String = null,
    theme: vegaDashEmbedLib.vegaDashEmbedLibStrings.excel | vegaDashEmbedLib.vegaDashEmbedLibStrings.ggplot2 | vegaDashEmbedLib.vegaDashEmbedLibStrings.quartz | vegaDashEmbedLib.vegaDashEmbedLibStrings.vox | vegaDashEmbedLib.vegaDashEmbedLibStrings.dark = null,
    tooltip: vegaDashTypingsLib.typesRuntimeMod.TooltipHandler | vegaDashTooltipLib.buildDefaultsMod.Options | scala.Boolean = null,
    width: scala.Int | scala.Double = null
  ): EmbedOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle.asInstanceOf[js.Any])
    if (editorUrl != null) __obj.updateDynamic("editorUrl")(editorUrl)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onBeforeParse != null) __obj.updateDynamic("onBeforeParse")(js.Any.fromFunction1(onBeforeParse))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(runAsync)) __obj.updateDynamic("runAsync")(runAsync)
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (sourceFooter != null) __obj.updateDynamic("sourceFooter")(sourceFooter)
    if (sourceHeader != null) __obj.updateDynamic("sourceHeader")(sourceHeader)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbedOptions]
  }
}

