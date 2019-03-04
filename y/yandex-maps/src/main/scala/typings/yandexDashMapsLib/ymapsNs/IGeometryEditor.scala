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
    startEditing: js.Function0[scala.Unit],
    state: IDataManager,
    stopEditing: js.Function0[scala.Unit]
  ): IGeometryEditor = {
    val __obj = js.Dynamic.literal(events = events, geometry = geometry, options = options, startEditing = startEditing, state = state, stopEditing = stopEditing)
  
    __obj.asInstanceOf[IGeometryEditor]
  }
}

