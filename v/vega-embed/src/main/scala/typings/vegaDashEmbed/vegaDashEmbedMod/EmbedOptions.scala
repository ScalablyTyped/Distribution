package typings.vegaDashEmbed.vegaDashEmbedMod

import typings.std.Partial
import typings.vegaDashEmbed.Anon_Bottom
import typings.vegaDashEmbed.Anon_CLICKTOVIEWACTIONS
import typings.vegaDashEmbed.buildSrcTypesMod.Config
import typings.vegaDashEmbed.buildSrcTypesMod.Mode
import typings.vegaDashEmbed.buildSrcUtilMod.DeepPartial
import typings.vegaDashEmbed.vegaDashEmbedStrings.dark
import typings.vegaDashEmbed.vegaDashEmbedStrings.excel
import typings.vegaDashEmbed.vegaDashEmbedStrings.ggplot2
import typings.vegaDashEmbed.vegaDashEmbedStrings.quartz
import typings.vegaDashEmbed.vegaDashEmbedStrings.vox
import typings.vegaDashTooltip.buildSrcDefaultsMod.Options
import typings.vegaDashTypings.typesRuntimeMod.Loader
import typings.vegaDashTypings.typesRuntimeMod.LoaderOptions
import typings.vegaDashTypings.typesRuntimeMod.TooltipHandler
import typings.vegaDashTypings.typesRuntimeRendererMod.Renderers
import typings.vegaDashTypings.typesSpecMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbedOptions extends js.Object {
  var actions: js.UndefOr[Boolean | Actions] = js.undefined
  var config: js.UndefOr[String | Config] = js.undefined
  var defaultStyle: js.UndefOr[Boolean | String] = js.undefined
  var downloadFileName: js.UndefOr[String] = js.undefined
  var editorUrl: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[Boolean | Hover] = js.undefined
  var i18n: js.UndefOr[Partial[Anon_CLICKTOVIEWACTIONS]] = js.undefined
  var loader: js.UndefOr[Loader | LoaderOptions] = js.undefined
  var logLevel: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var onBeforeParse: js.UndefOr[PatchFunc] = js.undefined
  var padding: js.UndefOr[Double | Anon_Bottom] = js.undefined
  var patch: js.UndefOr[String | PatchFunc | DeepPartial[Spec]] = js.undefined
  var renderer: js.UndefOr[Renderers] = js.undefined
  var scaleFactor: js.UndefOr[Double] = js.undefined
  var sourceFooter: js.UndefOr[String] = js.undefined
  var sourceHeader: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[excel | ggplot2 | quartz | vox | dark] = js.undefined
  var tooltip: js.UndefOr[TooltipHandler | Options | Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object EmbedOptions {
  @scala.inline
  def apply(
    actions: Boolean | Actions = null,
    config: String | Config = null,
    defaultStyle: Boolean | String = null,
    downloadFileName: String = null,
    editorUrl: String = null,
    height: Int | Double = null,
    hover: Boolean | Hover = null,
    i18n: Partial[Anon_CLICKTOVIEWACTIONS] = null,
    loader: Loader | LoaderOptions = null,
    logLevel: Int | Double = null,
    mode: Mode = null,
    onBeforeParse: PatchFunc = null,
    padding: Double | Anon_Bottom = null,
    patch: String | PatchFunc | DeepPartial[Spec] = null,
    renderer: Renderers = null,
    scaleFactor: Int | Double = null,
    sourceFooter: String = null,
    sourceHeader: String = null,
    theme: excel | ggplot2 | quartz | vox | dark = null,
    tooltip: TooltipHandler | Options | Boolean = null,
    width: Int | Double = null
  ): EmbedOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle.asInstanceOf[js.Any])
    if (downloadFileName != null) __obj.updateDynamic("downloadFileName")(downloadFileName)
    if (editorUrl != null) __obj.updateDynamic("editorUrl")(editorUrl)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onBeforeParse != null) __obj.updateDynamic("onBeforeParse")(onBeforeParse)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (sourceFooter != null) __obj.updateDynamic("sourceFooter")(sourceFooter)
    if (sourceHeader != null) __obj.updateDynamic("sourceHeader")(sourceHeader)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbedOptions]
  }
}

