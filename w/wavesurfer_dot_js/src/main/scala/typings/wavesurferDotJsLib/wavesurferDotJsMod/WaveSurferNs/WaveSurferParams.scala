package typings
package wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveSurferParams extends js.Object {
  var audioContext: js.UndefOr[stdLib.AudioContext] = js.undefined
  var audioRate: js.UndefOr[scala.Double] = js.undefined
  var audioScriptProcessor: js.UndefOr[stdLib.ScriptProcessorNode] = js.undefined
  var autoCenter: js.UndefOr[scala.Boolean] = js.undefined
  var backend: js.UndefOr[java.lang.String] = js.undefined
  var barGap: js.UndefOr[scala.Double] = js.undefined
  var barHeight: js.UndefOr[scala.Double] = js.undefined
  var barWidth: js.UndefOr[scala.Double] = js.undefined
  var closeAudioContext: js.UndefOr[scala.Boolean] = js.undefined
  var container: java.lang.String | stdLib.HTMLElement
  var cursorColor: js.UndefOr[java.lang.String] = js.undefined
  var cursorWidth: js.UndefOr[scala.Double] = js.undefined
  var fillParent: js.UndefOr[scala.Boolean] = js.undefined
  var forceDecode: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hideScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  var interact: js.UndefOr[scala.Boolean] = js.undefined
  var loopSelection: js.UndefOr[scala.Boolean] = js.undefined
  var maxCanvasWidth: js.UndefOr[scala.Double] = js.undefined
  var mediaControls: js.UndefOr[scala.Boolean] = js.undefined
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
  var minPxPerSec: js.UndefOr[scala.Double] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var partialRender: js.UndefOr[scala.Boolean] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.undefined
  var progressColor: js.UndefOr[java.lang.String] = js.undefined
  var removeMediaElementOnDestroy: js.UndefOr[scala.Boolean] = js.undefined
  var renderer: js.UndefOr[wavesurferDotJsLib.Anon_Container] = js.undefined
  var responsive: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var scrollParent: js.UndefOr[scala.Boolean] = js.undefined
  var skipLength: js.UndefOr[scala.Double] = js.undefined
  var splitChannels: js.UndefOr[scala.Boolean] = js.undefined
  var waveColor: js.UndefOr[java.lang.String] = js.undefined
  var xhr: js.UndefOr[XHROptions] = js.undefined
}

object WaveSurferParams {
  @scala.inline
  def apply(
    container: java.lang.String | stdLib.HTMLElement,
    audioContext: stdLib.AudioContext = null,
    audioRate: scala.Int | scala.Double = null,
    audioScriptProcessor: stdLib.ScriptProcessorNode = null,
    autoCenter: js.UndefOr[scala.Boolean] = js.undefined,
    backend: java.lang.String = null,
    barGap: scala.Int | scala.Double = null,
    barHeight: scala.Int | scala.Double = null,
    barWidth: scala.Int | scala.Double = null,
    closeAudioContext: js.UndefOr[scala.Boolean] = js.undefined,
    cursorColor: java.lang.String = null,
    cursorWidth: scala.Int | scala.Double = null,
    fillParent: js.UndefOr[scala.Boolean] = js.undefined,
    forceDecode: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    hideScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    interact: js.UndefOr[scala.Boolean] = js.undefined,
    loopSelection: js.UndefOr[scala.Boolean] = js.undefined,
    maxCanvasWidth: scala.Int | scala.Double = null,
    mediaControls: js.UndefOr[scala.Boolean] = js.undefined,
    mediaType: java.lang.String = null,
    minPxPerSec: scala.Int | scala.Double = null,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    partialRender: js.UndefOr[scala.Boolean] = js.undefined,
    pixelRatio: scala.Int | scala.Double = null,
    plugins: js.Array[PluginDefinition] = null,
    progressColor: java.lang.String = null,
    removeMediaElementOnDestroy: js.UndefOr[scala.Boolean] = js.undefined,
    renderer: wavesurferDotJsLib.Anon_Container = null,
    responsive: scala.Boolean | scala.Double = null,
    scrollParent: js.UndefOr[scala.Boolean] = js.undefined,
    skipLength: scala.Int | scala.Double = null,
    splitChannels: js.UndefOr[scala.Boolean] = js.undefined,
    waveColor: java.lang.String = null,
    xhr: XHROptions = null
  ): WaveSurferParams = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (audioContext != null) __obj.updateDynamic("audioContext")(audioContext)
    if (audioRate != null) __obj.updateDynamic("audioRate")(audioRate.asInstanceOf[js.Any])
    if (audioScriptProcessor != null) __obj.updateDynamic("audioScriptProcessor")(audioScriptProcessor)
    if (!js.isUndefined(autoCenter)) __obj.updateDynamic("autoCenter")(autoCenter)
    if (backend != null) __obj.updateDynamic("backend")(backend)
    if (barGap != null) __obj.updateDynamic("barGap")(barGap.asInstanceOf[js.Any])
    if (barHeight != null) __obj.updateDynamic("barHeight")(barHeight.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(closeAudioContext)) __obj.updateDynamic("closeAudioContext")(closeAudioContext)
    if (cursorColor != null) __obj.updateDynamic("cursorColor")(cursorColor)
    if (cursorWidth != null) __obj.updateDynamic("cursorWidth")(cursorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fillParent)) __obj.updateDynamic("fillParent")(fillParent)
    if (!js.isUndefined(forceDecode)) __obj.updateDynamic("forceDecode")(forceDecode)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideScrollbar)) __obj.updateDynamic("hideScrollbar")(hideScrollbar)
    if (!js.isUndefined(interact)) __obj.updateDynamic("interact")(interact)
    if (!js.isUndefined(loopSelection)) __obj.updateDynamic("loopSelection")(loopSelection)
    if (maxCanvasWidth != null) __obj.updateDynamic("maxCanvasWidth")(maxCanvasWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(mediaControls)) __obj.updateDynamic("mediaControls")(mediaControls)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    if (minPxPerSec != null) __obj.updateDynamic("minPxPerSec")(minPxPerSec.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (!js.isUndefined(partialRender)) __obj.updateDynamic("partialRender")(partialRender)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor)
    if (!js.isUndefined(removeMediaElementOnDestroy)) __obj.updateDynamic("removeMediaElementOnDestroy")(removeMediaElementOnDestroy)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollParent)) __obj.updateDynamic("scrollParent")(scrollParent)
    if (skipLength != null) __obj.updateDynamic("skipLength")(skipLength.asInstanceOf[js.Any])
    if (!js.isUndefined(splitChannels)) __obj.updateDynamic("splitChannels")(splitChannels)
    if (waveColor != null) __obj.updateDynamic("waveColor")(waveColor)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[WaveSurferParams]
  }
}

