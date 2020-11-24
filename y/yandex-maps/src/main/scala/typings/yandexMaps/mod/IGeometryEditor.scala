package typings.yandexMaps.mod

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
  implicit class IGeometryEditorOps[Self <: IGeometryEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGeometry(value: IGeometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartEditing(value: () => Unit): Self = this.set("startEditing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: IDataManager): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopEditing(value: () => Unit): Self = this.set("stopEditing", js.Any.fromFunction0(value))
  }
}
