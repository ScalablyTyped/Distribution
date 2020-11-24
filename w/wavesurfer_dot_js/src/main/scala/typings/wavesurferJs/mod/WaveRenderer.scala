package typings.wavesurferJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wavesurfer.js", "WaveRenderer")
@js.native
class WaveRenderer protected () extends Observer {
  def this(container: HTMLElement, params: WaveSurferParams) = this()
  
  def clearWave(): Unit = js.native
  
  def createWrapper(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def drawBars(peaks: js.Array[js.Array[Double] | Double], channelIndex: Double, start: Double, end: Double): Unit = js.native
  
  def drawPeaks(peaks: js.Array[js.Array[Double] | Double], length: Double, start: Double, end: Double): Unit = js.native
  
  def drawWave(peaks: js.Array[js.Array[Double] | Double], channelIndex: Double, start: Double, end: Double): Unit = js.native
  
  def getScrollX(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def handleEvent(e: Event, noPrevent: Boolean): Double = js.native
  
  var height: Double = js.native
  
  def progress(progress: Double): Unit = js.native
  
  def recenter(percent: Double): Unit = js.native
  
  def recenterOnPosition(position: Double, immediate: Boolean): Unit = js.native
  
  def resetScroll(): Unit = js.native
  
  def setHeight(height: Double): Boolean = js.native
  
  def setWidth(width: Double): Boolean = js.native
  
  def style(el: HTMLElement, styles: StringDictionary[String]): HTMLElement = js.native
  
  def updateProgress(position: Double): Unit = js.native
  
  def updateSize(): Unit = js.native
  
  var width: Double = js.native
  
  var wrapper: HTMLElement = js.native
}
