package typings.wavesurferJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.AudioNode
import typings.std.Blob
import typings.std.File
import typings.std.HTMLMediaElement
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
  var util: WaveSurferUtil = js.native
  def destroy(): Unit = js.native
  def empty(): Unit = js.native
  def exportImage(format: String, quality: Double): String = js.native
  def exportPCM(length: Double, accuracy: Double): String = js.native
  def exportPCM(length: Double, accuracy: Double, noWindow: Boolean): String = js.native
  def exportPCM(length: Double, accuracy: Double, noWindow: Boolean, start: Double): String = js.native
  def getCurrentTime(): Double = js.native
  def getDuration(): Double = js.native
  def getFilters(): js.Array[AudioNode] = js.native
  def getMute(): Boolean = js.native
  def getPlaybackRate(): Double = js.native
  def getVolume(): Double = js.native
  def getWaveColor(): String = js.native
  def init(): Unit = js.native
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
  def seekAndCenter(progress: Double): Unit = js.native
  def seekTo(progress: Double): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setMute(mute: Boolean): Unit = js.native
  def setPlaybackRate(rate: Double): Unit = js.native
  def setSinkId(deviceId: String): Unit = js.native
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

