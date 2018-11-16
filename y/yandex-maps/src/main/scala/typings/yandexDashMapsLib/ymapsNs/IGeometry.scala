package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.ICustomizable because Would inherit conflicting mutable fields List(events))*/
@js.native
trait IGeometry extends IBaseGeometry {
  def getMap(): Map | scala.Null = js.native
  def getPixelGeometry(): IPixelGeometry = js.native
  def getPixelGeometry(options: js.Object): IPixelGeometry = js.native
  def setMap(map: Map): scala.Unit = js.native
}

