package typings.wavesurferJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.AudioNode
import typings.std.Blob
import typings.std.File
import typings.std.HTMLMediaElement
import typings.wavesurferJs.wavesurferJsStrings.blob
import typings.wavesurferJs.wavesurferJsStrings.dataURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaveSurfer
  extends Observer
     with // [x: string]: any
//   pluginName -> WaveSurferPlugin
//   propertyNameAddedByPlugin -> any
/* x */ StringDictionary[js.Any] {
  var backend: WaveSurferBackend = js.native
  var util: WaveSurferUtil = js.native
  def addPlugin(plugin: PluginDefinition): WaveSurfer = js.native
  def cancelAjax(): Unit = js.native
  def destroy(): Unit = js.native
  def destroyPlugin(name: String): WaveSurfer = js.native
  def empty(): Unit = js.native
  def exportImage(): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
  def exportImage(format: String): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
  def exportImage(format: String, quality: Double): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
  @JSName("exportImage")
  def exportImage_blob(format: String, quality: Double, `type`: blob): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
  @JSName("exportImage")
  def exportImage_dataURL(format: String, quality: Double, `type`: dataURL): String | js.Array[String] | js.Promise[js.Array[Blob]] = js.native
  def exportPCM(): js.Promise[String] = js.native
  def exportPCM(length: Double): js.Promise[String] = js.native
  def exportPCM(length: Double, accuracy: Double): js.Promise[String] = js.native
  def exportPCM(length: Double, accuracy: Double, noWindow: Boolean): js.Promise[String] = js.native
  def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Double): js.Promise[String] = js.native
  def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Double, end: Double): js.Promise[String] = js.native
  def getActivePlugins(): js.Object = js.native
  def getBackgroundColor(): String = js.native
  def getCurrentTime(): Double = js.native
  def getCursorColor(): String = js.native
  def getDuration(): Double = js.native
  def getFilters(): js.Array[AudioNode] = js.native
  def getHeight(): Double = js.native
  def getMute(): Boolean = js.native
  def getPlaybackRate(): Double = js.native
  def getProgressColor(): String = js.native
  def getVolume(): Double = js.native
  def getWaveColor(): String = js.native
  def init(): WaveSurfer = js.native
  def initPlugin(name: String): WaveSurfer = js.native
  def isPlaying(): Boolean = js.native
  def isReady(): Boolean = js.native
  def load(url: String): Unit = js.native
  def load(url: String, peaks: js.Array[js.Array[Double] | Double]): Unit = js.native
  def load(url: String, peaks: js.Array[js.Array[Double] | Double], preload: String): Unit = js.native
  def load(url: String, peaks: js.Array[js.Array[Double] | Double], preload: String, duration: Double): Unit = js.native
  def load(url: HTMLMediaElement): Unit = js.native
  def load(url: HTMLMediaElement, peaks: js.Array[js.Array[Double] | Double]): Unit = js.native
  def load(url: HTMLMediaElement, peaks: js.Array[js.Array[Double] | Double], preload: String): Unit = js.native
  def load(
    url: HTMLMediaElement,
    peaks: js.Array[js.Array[Double] | Double],
    preload: String,
    duration: Double
  ): Unit = js.native
  def loadBlob(url: Blob): Unit = js.native
  def loadBlob(url: File): Unit = js.native
  def pause(): js.UndefOr[js.Promise[Unit]] = js.native
  def play(): js.UndefOr[js.Promise[Unit]] = js.native
  def play(start: Double): js.UndefOr[js.Promise[Unit]] = js.native
  def play(start: Double, end: Double): js.UndefOr[js.Promise[Unit]] = js.native
  def playPause(): js.UndefOr[js.Promise[Unit]] = js.native
  def registerPlugins(plugins: js.Array[PluginDefinition]): WaveSurfer = js.native
  def seekAndCenter(progress: Double): Unit = js.native
  def seekTo(progress: Double): Unit = js.native
  def setBackgroundColor(color: String): Unit = js.native
  def setCurrentTime(seconds: Double): Unit = js.native
  def setCursorColor(color: String): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setMute(mute: Boolean): Unit = js.native
  def setPlayEnd(position: Double): Unit = js.native
  def setPlaybackRate(rate: Double): Unit = js.native
  def setSinkId(deviceId: String): js.Promise[_] = js.native
  def setVolume(newVolume: Double): Unit = js.native
  def setWaveColor(color: String): Unit = js.native
  def skip(offset: Double): Unit = js.native
  def skipBackward(): Unit = js.native
  def skipBackward(seconds: Double): Unit = js.native
  def skipForward(): Unit = js.native
  def skipForward(seconds: Double): Unit = js.native
  def stop(): Unit = js.native
  def toggleInteraction(): Unit = js.native
  def toggleMute(): Unit = js.native
  def toggleScroll(): Unit = js.native
  def zoom(): Unit = js.native
  def zoom(pxPerSec: Double): Unit = js.native
}

