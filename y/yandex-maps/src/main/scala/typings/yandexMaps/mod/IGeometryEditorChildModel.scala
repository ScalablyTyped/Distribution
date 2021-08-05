package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeometryEditorChildModel
  extends StObject
     with IGeometryEditorModel {
  
  var editor: IGeometryEditor
  
  var geometry: IBaseGeometry
  
  def getParent(): IGeometryEditorModel
  
  def setPixels(pixels: js.Array[Double]): Unit
}
object IGeometryEditorChildModel {
  
  inline def apply(
    destroy: () => Unit,
    editor: IGeometryEditor,
    events: IEventManager[js.Object],
    geometry: IBaseGeometry,
    getParent: () => IGeometryEditorModel,
    getPixels: () => js.Array[Double],
    setPixels: js.Array[Double] => Unit
  ): IGeometryEditorChildModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), editor = editor.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], getParent = js.Any.fromFunction0(getParent), getPixels = js.Any.fromFunction0(getPixels), setPixels = js.Any.fromFunction1(setPixels))
    __obj.asInstanceOf[IGeometryEditorChildModel]
  }
  
  extension [Self <: IGeometryEditorChildModel](x: Self) {
    
    inline def setEditor(value: IGeometryEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: IBaseGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGetParent(value: () => IGeometryEditorModel): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
    
    inline def setSetPixels(value: js.Array[Double] => Unit): Self = StObject.set(x, "setPixels", js.Any.fromFunction1(value))
  }
}
