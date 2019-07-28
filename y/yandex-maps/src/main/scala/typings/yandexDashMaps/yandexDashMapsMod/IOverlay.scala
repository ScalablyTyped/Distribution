package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlay extends ICustomizable {
  def getData(): js.Object = js.native
  def getGeometry(): IPixelGeometry = js.native
  def getMap(): Map | Null = js.native
  def getShape(): IShape | Null = js.native
  def isEmpty(): Boolean = js.native
  def setData(data: js.Object): Unit = js.native
  def setGeometry(geometry: IPixelGeometry): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
}

