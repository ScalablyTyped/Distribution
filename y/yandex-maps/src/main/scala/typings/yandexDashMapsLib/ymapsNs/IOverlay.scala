package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlay extends ICustomizable {
  def getData(): js.Object = js.native
  def getGeometry(): IPixelGeometry = js.native
  def getMap(): Map | scala.Null = js.native
  def getShape(): IShape | scala.Null = js.native
  def isEmpty(): scala.Boolean = js.native
  def setData(data: js.Object): scala.Unit = js.native
  def setGeometry(geometry: IPixelGeometry): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
}

