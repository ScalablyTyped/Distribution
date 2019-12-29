package typings.timelinejs3.TL

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeline
  extends ITimelineEvents
     with Instantiable3[
      /* containerId */ String, 
      (/* data */ ITimelineConfig) | (/* data */ String), 
      /* options */ ITimelineOptions, 
      ITimeline
    ]
     with Instantiable2[
      /* containerId */ String, 
      (/* data */ ITimelineConfig) | (/* data */ String), 
      ITimeline
    ] {
  var current_id: String = js.native
  def _getSlideIndex(id: String): Double = js.native
  def _getSlideIndex(id: Double): Double = js.native
  def add(event: ITimelineSlideData): Unit = js.native
  def getCurrentSlide(): ITimelineSlide = js.native
  def getData(n: Double): ITimelineSlideData = js.native
  def getDataById(id: String): ITimelineSlideData = js.native
  def getDataById(id: Double): ITimelineSlideData = js.native
  def getSlide(n: Double): ITimelineSlide = js.native
  def getSlideById(id: String): ITimelineSlide = js.native
  def getSlideById(id: Double): ITimelineSlide = js.native
  def goTo(n: Double): Unit = js.native
  def goToEnd(): Unit = js.native
  def goToId(id: String): Unit = js.native
  def goToId(id: Double): Unit = js.native
  def goToNext(): Unit = js.native
  def goToPrev(): Unit = js.native
  def goToStart(): Unit = js.native
  def remove(n: Double): Unit = js.native
  def removeId(id: String): Unit = js.native
  def removeId(id: Double): Unit = js.native
  def setConfig(config: ITimelineConfig): Unit = js.native
  def setZoom(level: Double): Unit = js.native
  def showMessage(msg: String): Unit = js.native
  def updateDisplay(): Unit = js.native
  def zoomIn(): Unit = js.native
  def zoomOut(): Unit = js.native
}

