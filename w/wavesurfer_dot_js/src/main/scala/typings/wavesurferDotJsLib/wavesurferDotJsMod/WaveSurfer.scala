package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaveSurfer
  extends Observer
     with // [x: string]: any
//   pluginName -> WaveSurferPlugin
//   propertyNameAddedByPlugin -> any
/* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var util: WaveSurferUtil = js.native
  def destroy(): scala.Unit = js.native
  def empty(): scala.Unit = js.native
  def exportImage(format: java.lang.String, quality: scala.Double): java.lang.String = js.native
  def exportPCM(length: scala.Double, accuracy: scala.Double): java.lang.String = js.native
  def exportPCM(length: scala.Double, accuracy: scala.Double, noWindow: scala.Boolean): java.lang.String = js.native
  def exportPCM(length: scala.Double, accuracy: scala.Double, noWindow: scala.Boolean, start: scala.Double): java.lang.String = js.native
  def getCurrentTime(): scala.Double = js.native
  def getDuration(): scala.Double = js.native
  def getFilters(): js.Array[stdLib.AudioNode] = js.native
  def getMute(): scala.Boolean = js.native
  def getPlaybackRate(): scala.Double = js.native
  def getVolume(): scala.Double = js.native
  def getWaveColor(): java.lang.String = js.native
  def init(): scala.Unit = js.native
  def isPlaying(): scala.Boolean = js.native
  def isReady(): scala.Boolean = js.native
  def load(url: java.lang.String): scala.Unit = js.native
  def load(url: java.lang.String, peaks: js.Array[js.Array[scala.Double] | scala.Double]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    peaks: js.Array[js.Array[scala.Double] | scala.Double],
    preload: java.lang.String
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    peaks: js.Array[js.Array[scala.Double] | scala.Double],
    preload: java.lang.String,
    duration: scala.Double
  ): scala.Unit = js.native
  def load(url: stdLib.HTMLMediaElement): scala.Unit = js.native
  def load(url: stdLib.HTMLMediaElement, peaks: js.Array[js.Array[scala.Double] | scala.Double]): scala.Unit = js.native
  def load(
    url: stdLib.HTMLMediaElement,
    peaks: js.Array[js.Array[scala.Double] | scala.Double],
    preload: java.lang.String
  ): scala.Unit = js.native
  def load(
    url: stdLib.HTMLMediaElement,
    peaks: js.Array[js.Array[scala.Double] | scala.Double],
    preload: java.lang.String,
    duration: scala.Double
  ): scala.Unit = js.native
  def loadBlob(url: stdLib.Blob): scala.Unit = js.native
  def loadBlob(url: stdLib.File): scala.Unit = js.native
  def pause(): js.UndefOr[js.Promise[scala.Unit]] = js.native
  def play(): js.UndefOr[js.Promise[scala.Unit]] = js.native
  def play(start: scala.Double): js.UndefOr[js.Promise[scala.Unit]] = js.native
  def play(start: scala.Double, end: scala.Double): js.UndefOr[js.Promise[scala.Unit]] = js.native
  def playPause(): js.UndefOr[js.Promise[scala.Unit]] = js.native
  def seekAndCenter(progress: scala.Double): scala.Unit = js.native
  def seekTo(progress: scala.Double): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Unit = js.native
  def setMute(mute: scala.Boolean): scala.Unit = js.native
  def setPlaybackRate(rate: scala.Double): scala.Unit = js.native
  def setSinkId(deviceId: java.lang.String): scala.Unit = js.native
  def setVolume(newVolume: scala.Double): scala.Unit = js.native
  def setWaveColor(color: java.lang.String): scala.Unit = js.native
  def skip(offset: scala.Double): scala.Unit = js.native
  def skipBackward(): scala.Unit = js.native
  def skipBackward(seconds: scala.Double): scala.Unit = js.native
  def skipForward(): scala.Unit = js.native
  def skipForward(seconds: scala.Double): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def toggleInteraction(): scala.Unit = js.native
  def toggleMute(): scala.Unit = js.native
  def toggleScroll(): scala.Unit = js.native
  def zoom(): scala.Unit = js.native
  def zoom(pxPerSec: scala.Double): scala.Unit = js.native
}

