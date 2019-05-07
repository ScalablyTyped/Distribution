package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait IGeoObject
  extends IChild[IControlParent]
     with IParentOnMap {
  var geometry: IGeometry | scala.Null = js.native
  var options: IOptionManager = js.native
  var properties: IDataManager = js.native
  var state: IDataManager = js.native
  def getOverlay(): js.Promise[IOverlay | scala.Null] = js.native
  def getOverlaySync(): IOverlay | scala.Null = js.native
}

