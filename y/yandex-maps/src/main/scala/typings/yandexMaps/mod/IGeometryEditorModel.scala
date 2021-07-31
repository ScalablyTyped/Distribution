package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeometryEditorModel
  extends StObject
     with IEventEmitter {
  
  def destroy(): Unit
  
  def getPixels(): js.Array[Double]
}
object IGeometryEditorModel {
  
  @scala.inline
  def apply(destroy: () => Unit, events: IEventManager[js.Object], getPixels: () => js.Array[Double]): IGeometryEditorModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getPixels = js.Any.fromFunction0(getPixels))
    __obj.asInstanceOf[IGeometryEditorModel]
  }
  
  @scala.inline
  implicit class IGeometryEditorModelMutableBuilder[Self <: IGeometryEditorModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPixels(value: () => js.Array[Double]): Self = StObject.set(x, "getPixels", js.Any.fromFunction0(value))
  }
}
