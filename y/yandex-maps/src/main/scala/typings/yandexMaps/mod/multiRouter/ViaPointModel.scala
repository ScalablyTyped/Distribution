package typings.yandexMaps.mod.multiRouter

import typings.yandexMaps.mod.IEventEmitter
import typings.yandexMaps.mod.data.Manager
import typings.yandexMaps.mod.geometry.base.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "multiRouter.ViaPointModel")
@js.native
class ViaPointModel () extends IEventEmitter {
  
  def destroy(): Unit = js.native
  
  var geometry: Point = js.native
  
  def getReferencePoint(): js.Object = js.native
  
  def getReferencePointIndex(): Double = js.native
  
  var multiRoute: MultiRouteModel = js.native
  
  var properties: Manager = js.native
  
  def setReferencePoint(referencePoint: js.Object): Unit = js.native
  
  def update(viaPointJson: js.Object): Unit = js.native
}
