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

@js.native
trait WaveSurferParams extends js.Object {
  var audioContext: js.UndefOr[AudioContext] = js.native
  var audioRate: js.UndefOr[Double] = js.native
  var audioScriptProcessor: js.UndefOr[ScriptProcessorNode] = js.native
  var autoCenter: js.UndefOr[Boolean] = js.native
  var autoCenterImmediately: js.UndefOr[Boolean] = js.native
  var autoCenterRate: js.UndefOr[Double] = js.native
  var backend: js.UndefOr[WebAudio | MediaElement | MediaElementWebAudio] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var barGap: js.UndefOr[Double] = js.native
  var barHeight: js.UndefOr[Double] = js.native
  var barMinHeight: js.UndefOr[Double] = js.native
  var barRadius: js.UndefOr[Double] = js.native
  var barWidth: js.UndefOr[Double] = js.native
  var closeAudioContext: js.UndefOr[Boolean] = js.native
  var container: String | HTMLElement = js.native
  var cursorColor: js.UndefOr[String] = js.native
  var cursorWidth: js.UndefOr[Double] = js.native
  var drawingContextAttributes: js.UndefOr[js.Object] = js.native
  var duration: js.UndefOr[Double] = js.native
  var fillParent: js.UndefOr[Boolean] = js.native
  var forceDecode: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var hideScrollbar: js.UndefOr[Boolean] = js.native
  var interact: js.UndefOr[Boolean] = js.native
  var loopSelection: js.UndefOr[Boolean] = js.native
  var maxCanvasWidth: js.UndefOr[Double] = js.native
  var mediaControls: js.UndefOr[Boolean] = js.native
  var mediaType: js.UndefOr[String] = js.native
  var minPxPerSec: js.UndefOr[Double] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
  var partialRender: js.UndefOr[Boolean] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.native
  var progressColor: js.UndefOr[String] = js.native
  var removeMediaElementOnDestroy: js.UndefOr[Boolean] = js.native
  var renderer: js.UndefOr[Instantiable] = js.native
  var responsive: js.UndefOr[Boolean | Double] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var scrollParent: js.UndefOr[Boolean] = js.native
  var skipLength: js.UndefOr[Double] = js.native
  var splitChannels: js.UndefOr[Boolean] = js.native
  var waveColor: js.UndefOr[String | CanvasGradient] = js.native
  var xhr: js.UndefOr[XHROptions] = js.native
}

object WaveSurferParams {
  @scala.inline
  def apply(container: String | HTMLElement): WaveSurferParams = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaveSurferParams]
  }
  @scala.inline
  implicit class WaveSurferParamsOps[Self <: WaveSurferParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioContext(value: AudioContext): Self = this.set("audioContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioContext: Self = this.set("audioContext", js.undefined)
    @scala.inline
    def setAudioRate(value: Double): Self = this.set("audioRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioRate: Self = this.set("audioRate", js.undefined)
    @scala.inline
    def setAudioScriptProcessor(value: ScriptProcessorNode): Self = this.set("audioScriptProcessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioScriptProcessor: Self = this.set("audioScriptProcessor", js.undefined)
    @scala.inline
    def setAutoCenter(value: Boolean): Self = this.set("autoCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCenter: Self = this.set("autoCenter", js.undefined)
    @scala.inline
    def setAutoCenterImmediately(value: Boolean): Self = this.set("autoCenterImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCenterImmediately: Self = this.set("autoCenterImmediately", js.undefined)
    @scala.inline
    def setAutoCenterRate(value: Double): Self = this.set("autoCenterRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCenterRate: Self = this.set("autoCenterRate", js.undefined)
    @scala.inline
    def setBackend(value: WebAudio | MediaElement | MediaElementWebAudio): Self = this.set("backend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackend: Self = this.set("backend", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBarGap(value: Double): Self = this.set("barGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarGap: Self = this.set("barGap", js.undefined)
    @scala.inline
    def setBarHeight(value: Double): Self = this.set("barHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarHeight: Self = this.set("barHeight", js.undefined)
    @scala.inline
    def setBarMinHeight(value: Double): Self = this.set("barMinHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarMinHeight: Self = this.set("barMinHeight", js.undefined)
    @scala.inline
    def setBarRadius(value: Double): Self = this.set("barRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarRadius: Self = this.set("barRadius", js.undefined)
    @scala.inline
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarWidth: Self = this.set("barWidth", js.undefined)
    @scala.inline
    def setCloseAudioContext(value: Boolean): Self = this.set("closeAudioContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseAudioContext: Self = this.set("closeAudioContext", js.undefined)
    @scala.inline
    def setCursorColor(value: String): Self = this.set("cursorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorColor: Self = this.set("cursorColor", js.undefined)
    @scala.inline
    def setCursorWidth(value: Double): Self = this.set("cursorWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorWidth: Self = this.set("cursorWidth", js.undefined)
    @scala.inline
    def setDrawingContextAttributes(value: js.Object): Self = this.set("drawingContextAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawingContextAttributes: Self = this.set("drawingContextAttributes", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFillParent(value: Boolean): Self = this.set("fillParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillParent: Self = this.set("fillParent", js.undefined)
    @scala.inline
    def setForceDecode(value: Boolean): Self = this.set("forceDecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDecode: Self = this.set("forceDecode", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHideScrollbar(value: Boolean): Self = this.set("hideScrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideScrollbar: Self = this.set("hideScrollbar", js.undefined)
    @scala.inline
    def setInteract(value: Boolean): Self = this.set("interact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteract: Self = this.set("interact", js.undefined)
    @scala.inline
    def setLoopSelection(value: Boolean): Self = this.set("loopSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopSelection: Self = this.set("loopSelection", js.undefined)
    @scala.inline
    def setMaxCanvasWidth(value: Double): Self = this.set("maxCanvasWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCanvasWidth: Self = this.set("maxCanvasWidth", js.undefined)
    @scala.inline
    def setMediaControls(value: Boolean): Self = this.set("mediaControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaControls: Self = this.set("mediaControls", js.undefined)
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    @scala.inline
    def setMinPxPerSec(value: Double): Self = this.set("minPxPerSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPxPerSec: Self = this.set("minPxPerSec", js.undefined)
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setPartialRender(value: Boolean): Self = this.set("partialRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialRender: Self = this.set("partialRender", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: PluginDefinition*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[PluginDefinition]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setProgressColor(value: String): Self = this.set("progressColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressColor: Self = this.set("progressColor", js.undefined)
    @scala.inline
    def setRemoveMediaElementOnDestroy(value: Boolean): Self = this.set("removeMediaElementOnDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveMediaElementOnDestroy: Self = this.set("removeMediaElementOnDestroy", js.undefined)
    @scala.inline
    def setRenderer(value: Instantiable): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean | Double): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setScrollParent(value: Boolean): Self = this.set("scrollParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollParent: Self = this.set("scrollParent", js.undefined)
    @scala.inline
    def setSkipLength(value: Double): Self = this.set("skipLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLength: Self = this.set("skipLength", js.undefined)
    @scala.inline
    def setSplitChannels(value: Boolean): Self = this.set("splitChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitChannels: Self = this.set("splitChannels", js.undefined)
    @scala.inline
    def setWaveColor(value: String | CanvasGradient): Self = this.set("waveColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaveColor: Self = this.set("waveColor", js.undefined)
    @scala.inline
    def setXhr(value: XHROptions): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

