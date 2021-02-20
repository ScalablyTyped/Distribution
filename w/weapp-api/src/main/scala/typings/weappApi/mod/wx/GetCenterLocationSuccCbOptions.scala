package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCenterLocationSuccCbOptions extends CommonCallbackOptions {
  
  @JSName("success")
  def success_MGetCenterLocationSuccCbOptions(res: LocationBaseOptions): Unit = js.native
}
object GetCenterLocationSuccCbOptions {
  
  @scala.inline
  def apply(success: LocationBaseOptions => Unit): GetCenterLocationSuccCbOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetCenterLocationSuccCbOptions]
  }
  
  @scala.inline
  implicit class GetCenterLocationSuccCbOptionsMutableBuilder[Self <: GetCenterLocationSuccCbOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: LocationBaseOptions => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
