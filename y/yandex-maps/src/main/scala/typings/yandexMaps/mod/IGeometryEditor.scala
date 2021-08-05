package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeometryEditor
  extends StObject
     with ICustomizable {
  
  var geometry: IGeometry
  
  def startEditing(): Unit
  
  var state: IDataManager
  
  def stopEditing(): Unit
}
object IGeometryEditor {
  
  inline def apply(
    events: IEventManager[js.Object],
    geometry: IGeometry,
    options: IOptionManager,
    startEditing: () => Unit,
    state: IDataManager,
    stopEditing: () => Unit
  ): IGeometryEditor = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], startEditing = js.Any.fromFunction0(startEditing), state = state.asInstanceOf[js.Any], stopEditing = js.Any.fromFunction0(stopEditing))
    __obj.asInstanceOf[IGeometryEditor]
  }
  
  extension [Self <: IGeometryEditor](x: Self) {
    
    inline def setGeometry(value: IGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setStartEditing(value: () => Unit): Self = StObject.set(x, "startEditing", js.Any.fromFunction0(value))
    
    inline def setState(value: IDataManager): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStopEditing(value: () => Unit): Self = StObject.set(x, "stopEditing", js.Any.fromFunction0(value))
  }
}
