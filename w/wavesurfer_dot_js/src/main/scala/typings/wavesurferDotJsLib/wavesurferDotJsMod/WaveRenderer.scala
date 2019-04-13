package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wavesurfer.js", "WaveRenderer")
@js.native
class WaveRenderer protected () extends Observer {
  def this(container: stdLib.HTMLElement, params: WaveSurferParams) = this()
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  var wrapper: stdLib.HTMLElement = js.native
  def clearWave(): scala.Unit = js.native
  def createWrapper(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def drawBars(
    peaks: js.Array[js.Array[scala.Double] | scala.Double],
    channelIndex: scala.Double,
    start: scala.Double,
    end: scala.Double
  ): scala.Unit = js.native
  def drawPeaks(
    peaks: js.Array[js.Array[scala.Double] | scala.Double],
    length: scala.Double,
    start: scala.Double,
    end: scala.Double
  ): scala.Unit = js.native
  def drawWave(
    peaks: js.Array[js.Array[scala.Double] | scala.Double],
    channelIndex: scala.Double,
    start: scala.Double,
    end: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def fireEvent(eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
  def getScrollX(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def handleEvent(e: stdLib.Event, noPrevent: scala.Boolean): scala.Double = js.native
  /* CompleteClass */
  override def on(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): ListenerDescriptor = js.native
  /* CompleteClass */
  override def once(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): ListenerDescriptor = js.native
  def progress(progress: scala.Double): scala.Unit = js.native
  def recenter(percent: scala.Double): scala.Unit = js.native
  def recenterOnPosition(position: scala.Double, immediate: scala.Boolean): scala.Unit = js.native
  def resetScroll(): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Boolean = js.native
  def setWidth(width: scala.Double): scala.Boolean = js.native
  def style(el: stdLib.HTMLElement, styles: org.scalablytyped.runtime.StringDictionary[java.lang.String]): stdLib.HTMLElement = js.native
  /* CompleteClass */
  override def un(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def unAll(): scala.Unit = js.native
  def updateProgress(position: scala.Double): scala.Unit = js.native
  def updateSize(): scala.Unit = js.native
}

