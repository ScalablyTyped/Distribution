package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryEditor extends ICustomizable {
  var geometry: IGeometry
  var state: IDataManager
  def startEditing(): scala.Unit
  def stopEditing(): scala.Unit
}

object IGeometryEditor {
  @scala.inline
  def apply(
    events: IEventManager,
    geometry: IGeometry,
    options: IOptionManager,
    startEditing: () => scala.Unit,
    state: IDataManager,
    stopEditing: () => scala.Unit
  ): IGeometryEditor = {
    val __obj = js.Dynamic.literal(events = events, geometry = geometry, options = options, startEditing = js.Any.fromFunction0(startEditing), state = state, stopEditing = js.Any.fromFunction0(stopEditing))
  
    __obj.asInstanceOf[IGeometryEditor]
  }
}

