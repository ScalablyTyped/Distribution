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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("geometry")(geometry)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("startEditing")(startEditing)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("stopEditing")(stopEditing)
    __obj.asInstanceOf[IGeometryEditor]
  }
}

