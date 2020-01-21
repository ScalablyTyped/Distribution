package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryEditor extends ICustomizable {
  var geometry: IGeometry
  var state: IDataManager
  def startEditing(): Unit
  def stopEditing(): Unit
}

object IGeometryEditor {
  @scala.inline
  def apply(
    events: IEventManager,
    geometry: IGeometry,
    options: IOptionManager,
    startEditing: () => Unit,
    state: IDataManager,
    stopEditing: () => Unit
  ): IGeometryEditor = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], startEditing = js.Any.fromFunction0(startEditing), state = state.asInstanceOf[js.Any], stopEditing = js.Any.fromFunction0(stopEditing))
  
    __obj.asInstanceOf[IGeometryEditor]
  }
}

