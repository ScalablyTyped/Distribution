package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeometryEditor extends ICustomizable {
  
  var geometry: IGeometry = js.native
  
  def startEditing(): Unit = js.native
  
  var state: IDataManager = js.native
  
  def stopEditing(): Unit = js.native
}
object IGeometryEditor {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IGeometryEditorMutableBuilder[Self <: IGeometryEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: IGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartEditing(value: () => Unit): Self = StObject.set(x, "startEditing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: IDataManager): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopEditing(value: () => Unit): Self = StObject.set(x, "stopEditing", js.Any.fromFunction0(value))
  }
}
