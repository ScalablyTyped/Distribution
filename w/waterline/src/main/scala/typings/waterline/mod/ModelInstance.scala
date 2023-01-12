package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelInstance extends StObject {
  
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  def save(): WaterlinePromise[this.type]
  
  def toJSON(): Any
  
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object ModelInstance {
  
  inline def apply(save: () => WaterlinePromise[ModelInstance], toJSON: () => Any): ModelInstance = {
    val __obj = js.Dynamic.literal(save = js.Any.fromFunction0(save), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ModelInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelInstance] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSave(value: () => WaterlinePromise[ModelInstance]): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
