package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait IGeoObject
  extends IChild[IControlParent]
     with IParentOnMap {
  var geometry: IGeometry | Null = js.native
  var options: IOptionManager = js.native
  var properties: IDataManager = js.native
  var state: IDataManager = js.native
  def getOverlay(): js.Promise[IOverlay | Null] = js.native
  def getOverlaySync(): IOverlay | Null = js.native
}

