package typings
package timelinejs3Lib.TLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeline
  extends ITimelineEvents
     with ScalablyTyped.runtime.Instantiable2[
      /* containerId */ java.lang.String, 
      (/* data */ java.lang.String) | (/* data */ ITimelineConfig), 
      ITimeline
    ]
     with ScalablyTyped.runtime.Instantiable3[
      /* containerId */ java.lang.String, 
      (/* data */ java.lang.String) | (/* data */ ITimelineConfig), 
      /* options */ ITimelineOptions, 
      ITimeline
    ] {
  var current_id: java.lang.String = js.native
  def _getSlideIndex(id: java.lang.String): scala.Double = js.native
  def _getSlideIndex(id: scala.Double): scala.Double = js.native
  def add(event: ITimelineSlideData): scala.Unit = js.native
  def getCurrentSlide(): ITimelineSlide = js.native
  def getData(n: scala.Double): ITimelineSlideData = js.native
  def getDataById(id: java.lang.String): ITimelineSlideData = js.native
  def getDataById(id: scala.Double): ITimelineSlideData = js.native
  def getSlide(n: scala.Double): ITimelineSlide = js.native
  def getSlideById(id: java.lang.String): ITimelineSlide = js.native
  def getSlideById(id: scala.Double): ITimelineSlide = js.native
  def goTo(n: scala.Double): scala.Unit = js.native
  def goToEnd(): scala.Unit = js.native
  def goToId(id: java.lang.String): scala.Unit = js.native
  def goToId(id: scala.Double): scala.Unit = js.native
  def goToNext(): scala.Unit = js.native
  def goToPrev(): scala.Unit = js.native
  def goToStart(): scala.Unit = js.native
  def remove(n: scala.Double): scala.Unit = js.native
  def removeId(id: java.lang.String): scala.Unit = js.native
  def removeId(id: scala.Double): scala.Unit = js.native
  def setConfig(config: ITimelineConfig): scala.Unit = js.native
  def setZoom(level: scala.Double): scala.Unit = js.native
  def showMessage(msg: java.lang.String): scala.Unit = js.native
  def updateDisplay(): scala.Unit = js.native
  def zoomIn(): scala.Unit = js.native
  def zoomOut(): scala.Unit = js.native
}

