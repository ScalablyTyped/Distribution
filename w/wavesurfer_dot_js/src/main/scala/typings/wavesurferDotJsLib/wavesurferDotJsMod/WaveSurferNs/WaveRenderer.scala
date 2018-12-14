package typings
package wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaveRenderer
  extends wavesurferDotJsLib.wavesurferDotJsMod.Observer {
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  var wrapper: stdLib.HTMLElement = js.native
  def clearWave(): scala.Unit = js.native
  def createWrapper(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def drawBars(
    peaks: js.Array[scala.Double | js.Array[scala.Double]],
    channelIndex: scala.Double,
    start: scala.Double,
    end: scala.Double
  ): scala.Unit = js.native
  def drawPeaks(
    peaks: js.Array[scala.Double | js.Array[scala.Double]],
    length: scala.Double,
    start: scala.Double,
    end: scala.Double
  ): scala.Unit = js.native
  def drawWave(
    peaks: js.Array[scala.Double | js.Array[scala.Double]],
    channelIndex: scala.Double,
    start: scala.Double,
    end: scala.Double
  ): scala.Unit = js.native
  def getScrollX(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def handleEvent(e: stdLib.Event, noPrevent: scala.Boolean): scala.Double = js.native
  def progress(progress: scala.Double): scala.Unit = js.native
  def recenter(percent: scala.Double): scala.Unit = js.native
  def recenterOnPosition(position: scala.Double, immediate: scala.Boolean): scala.Unit = js.native
  def resetScroll(): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Boolean = js.native
  def setWidth(width: scala.Double): scala.Boolean = js.native
  def style(el: stdLib.HTMLElement, styles: org.scalablytyped.runtime.StringDictionary[java.lang.String]): stdLib.HTMLElement = js.native
  def updateProgress(position: scala.Double): scala.Unit = js.native
  def updateSize(): scala.Unit = js.native
}

