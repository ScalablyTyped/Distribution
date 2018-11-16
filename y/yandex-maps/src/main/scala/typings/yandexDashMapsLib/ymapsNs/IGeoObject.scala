package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.ICustomizable because Would inherit conflicting mutable fields List(events))*/
@js.native
trait IGeoObject
  extends IChild[IControlParent]
     with IParentOnMap {
  var geometry: IGeometry | scala.Null = js.native
  var properties: IDataManager = js.native
  var state: IDataManager = js.native
  def getOverlay(): stdLib.Promise[IOverlay | scala.Null] = js.native
  def getOverlaySync(): IOverlay | scala.Null = js.native
}

