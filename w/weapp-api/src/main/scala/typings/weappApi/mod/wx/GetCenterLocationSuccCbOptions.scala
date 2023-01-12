package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCenterLocationSuccCbOptions
  extends StObject
     with CommonCallbackOptions {
  
  @JSName("success")
  def success_MGetCenterLocationSuccCbOptions(res: LocationBaseOptions): Unit
}
object GetCenterLocationSuccCbOptions {
  
  inline def apply(success: LocationBaseOptions => Unit): GetCenterLocationSuccCbOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetCenterLocationSuccCbOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCenterLocationSuccCbOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: LocationBaseOptions => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
