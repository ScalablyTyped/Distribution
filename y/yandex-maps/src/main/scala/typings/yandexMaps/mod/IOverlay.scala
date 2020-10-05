package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlay extends ICustomizable {
  def getData(): js.Object = js.native
  def getGeometry(): IPixelGeometry = js.native
  def getMap(): Map_ | Null = js.native
  def getShape(): IShape | Null = js.native
  def isEmpty(): Boolean = js.native
  def setData(data: js.Object): Unit = js.native
  def setGeometry(geometry: IPixelGeometry): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map_): Unit = js.native
}

