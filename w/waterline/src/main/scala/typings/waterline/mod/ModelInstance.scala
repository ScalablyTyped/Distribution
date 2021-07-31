package typings.waterline.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelInstance extends StObject {
  
  var createdAt: js.UndefOr[Date] = js.undefined
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  def save(): WaterlinePromise[this.type]
  
  def toJSON(): js.Any
  
  var updatedAt: js.UndefOr[Date] = js.undefined
}
object ModelInstance {
  
  @scala.inline
  def apply(save: () => WaterlinePromise[ModelInstance], toJSON: () => js.Any): ModelInstance = {
    val __obj = js.Dynamic.literal(save = js.Any.fromFunction0(save), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ModelInstance]
  }
  
  @scala.inline
  implicit class ModelInstanceMutableBuilder[Self <: ModelInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSave(value: () => WaterlinePromise[ModelInstance]): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdatedAt(value: Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
