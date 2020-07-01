package typings.wavesurferJs.mod

import typings.std.AudioContext
import typings.std.CanvasGradient
import typings.std.HTMLElement
import typings.std.ScriptProcessorNode
import typings.wavesurferJs.anon.Instantiable
import typings.wavesurferJs.wavesurferJsStrings.MediaElement
import typings.wavesurferJs.wavesurferJsStrings.MediaElementWebAudio
import typings.wavesurferJs.wavesurferJsStrings.WebAudio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveSurferParams extends js.Object {
  var audioContext: js.UndefOr[AudioContext] = js.undefined
  var audioRate: js.UndefOr[Double] = js.undefined
  var audioScriptProcessor: js.UndefOr[ScriptProcessorNode] = js.undefined
  var autoCenter: js.UndefOr[Boolean] = js.undefined
  var autoCenterImmediately: js.UndefOr[Boolean] = js.undefined
  var autoCenterRate: js.UndefOr[Double] = js.undefined
  var backend: js.UndefOr[WebAudio | MediaElement | MediaElementWebAudio] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var barGap: js.UndefOr[Double] = js.undefined
  var barHeight: js.UndefOr[Double] = js.undefined
  var barMinHeight: js.UndefOr[Double] = js.undefined
  var barRadius: js.UndefOr[Double] = js.undefined
  var barWidth: js.UndefOr[Double] = js.undefined
  var closeAudioContext: js.UndefOr[Boolean] = js.undefined
  var container: String | HTMLElement
  var cursorColor: js.UndefOr[String] = js.undefined
  var cursorWidth: js.UndefOr[Double] = js.undefined
  var drawingContextAttributes: js.UndefOr[js.Object] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var fillParent: js.UndefOr[Boolean] = js.undefined
  var forceDecode: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hideScrollbar: js.UndefOr[Boolean] = js.undefined
  var interact: js.UndefOr[Boolean] = js.undefined
  var loopSelection: js.UndefOr[Boolean] = js.undefined
  var maxCanvasWidth: js.UndefOr[Double] = js.undefined
  var mediaControls: js.UndefOr[Boolean] = js.undefined
  var mediaType: js.UndefOr[String] = js.undefined
  var minPxPerSec: js.UndefOr[Double] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var partialRender: js.UndefOr[Boolean] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.undefined
  var progressColor: js.UndefOr[String] = js.undefined
  var removeMediaElementOnDestroy: js.UndefOr[Boolean] = js.undefined
  var renderer: js.UndefOr[Instantiable] = js.undefined
  var responsive: js.UndefOr[Boolean | Double] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var scrollParent: js.UndefOr[Boolean] = js.undefined
  var skipLength: js.UndefOr[Double] = js.undefined
  var splitChannels: js.UndefOr[Boolean] = js.undefined
  var waveColor: js.UndefOr[String | CanvasGradient] = js.undefined
  var xhr: js.UndefOr[XHROptions] = js.undefined
}

object WaveSurferParams {
  @scala.inline
  def apply(
    container: String | HTMLElement,
    audioContext: AudioContext = null,
    audioRate: js.UndefOr[Double] = js.undefined,
    audioScriptProcessor: ScriptProcessorNode = null,
    autoCenter: js.UndefOr[Boolean] = js.undefined,
    autoCenterImmediately: js.UndefOr[Boolean] = js.undefined,
    autoCenterRate: js.UndefOr[Double] = js.undefined,
    backend: WebAudio | MediaElement | MediaElementWebAudio = null,
    backgroundColor: String = null,
    barGap: js.UndefOr[Double] = js.undefined,
    barHeight: js.UndefOr[Double] = js.undefined,
    barMinHeight: js.UndefOr[Double] = js.undefined,
    barRadius: js.UndefOr[Double] = js.undefined,
    barWidth: js.UndefOr[Double] = js.undefined,
    closeAudioContext: js.UndefOr[Boolean] = js.undefined,
    cursorColor: String = null,
    cursorWidth: js.UndefOr[Double] = js.undefined,
    drawingContextAttributes: js.Object = null,
    duration: js.UndefOr[Double] = js.undefined,
    fillParent: js.UndefOr[Boolean] = js.undefined,
    forceDecode: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hideScrollbar: js.UndefOr[Boolean] = js.undefined,
    interact: js.UndefOr[Boolean] = js.undefined,
    loopSelection: js.UndefOr[Boolean] = js.undefined,
    maxCanvasWidth: js.UndefOr[Double] = js.undefined,
    mediaControls: js.UndefOr[Boolean] = js.undefined,
    mediaType: String = null,
    minPxPerSec: js.UndefOr[Double] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    partialRender: js.UndefOr[Boolean] = js.undefined,
    pixelRatio: js.UndefOr[Double] = js.undefined,
    plugins: js.Array[PluginDefinition] = null,
    progressColor: String = null,
    removeMediaElementOnDestroy: js.UndefOr[Boolean] = js.undefined,
    renderer: Instantiable = null,
    responsive: Boolean | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    scrollParent: js.UndefOr[Boolean] = js.undefined,
    skipLength: js.UndefOr[Double] = js.undefined,
    splitChannels: js.UndefOr[Boolean] = js.undefined,
    waveColor: String | CanvasGradient = null,
    xhr: XHROptions = null
  ): WaveSurferParams = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (audioContext != null) __obj.updateDynamic("audioContext")(audioContext.asInstanceOf[js.Any])
    if (!js.isUndefined(audioRate)) __obj.updateDynamic("audioRate")(audioRate.get.asInstanceOf[js.Any])
    if (audioScriptProcessor != null) __obj.updateDynamic("audioScriptProcessor")(audioScriptProcessor.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCenter)) __obj.updateDynamic("autoCenter")(autoCenter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCenterImmediately)) __obj.updateDynamic("autoCenterImmediately")(autoCenterImmediately.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCenterRate)) __obj.updateDynamic("autoCenterRate")(autoCenterRate.get.asInstanceOf[js.Any])
    if (backend != null) __obj.updateDynamic("backend")(backend.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(barGap)) __obj.updateDynamic("barGap")(barGap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barHeight)) __obj.updateDynamic("barHeight")(barHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barMinHeight)) __obj.updateDynamic("barMinHeight")(barMinHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barRadius)) __obj.updateDynamic("barRadius")(barRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barWidth)) __obj.updateDynamic("barWidth")(barWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeAudioContext)) __obj.updateDynamic("closeAudioContext")(closeAudioContext.get.asInstanceOf[js.Any])
    if (cursorColor != null) __obj.updateDynamic("cursorColor")(cursorColor.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorWidth)) __obj.updateDynamic("cursorWidth")(cursorWidth.get.asInstanceOf[js.Any])
    if (drawingContextAttributes != null) __obj.updateDynamic("drawingContextAttributes")(drawingContextAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillParent)) __obj.updateDynamic("fillParent")(fillParent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceDecode)) __obj.updateDynamic("forceDecode")(forceDecode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideScrollbar)) __obj.updateDynamic("hideScrollbar")(hideScrollbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interact)) __obj.updateDynamic("interact")(interact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loopSelection)) __obj.updateDynamic("loopSelection")(loopSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxCanvasWidth)) __obj.updateDynamic("maxCanvasWidth")(maxCanvasWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mediaControls)) __obj.updateDynamic("mediaControls")(mediaControls.get.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(minPxPerSec)) __obj.updateDynamic("minPxPerSec")(minPxPerSec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partialRender)) __obj.updateDynamic("partialRender")(partialRender.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor.asInstanceOf[js.Any])
    if (!js.isUndefined(removeMediaElementOnDestroy)) __obj.updateDynamic("removeMediaElementOnDestroy")(removeMediaElementOnDestroy.get.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollParent)) __obj.updateDynamic("scrollParent")(scrollParent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLength)) __obj.updateDynamic("skipLength")(skipLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(splitChannels)) __obj.updateDynamic("splitChannels")(splitChannels.get.asInstanceOf[js.Any])
    if (waveColor != null) __obj.updateDynamic("waveColor")(waveColor.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaveSurferParams]
  }
}

