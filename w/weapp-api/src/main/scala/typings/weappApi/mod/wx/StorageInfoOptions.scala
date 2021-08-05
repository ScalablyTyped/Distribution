package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageInfoOptions
  extends StObject
     with CommonCallbackOptions {
  
  @JSName("success")
  var success_StorageInfoOptions: js.UndefOr[StorageInfoCallback] = js.undefined
}
object StorageInfoOptions {
  
  inline def apply(): StorageInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageInfoOptions]
  }
  
  extension [Self <: StorageInfoOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ StorageInfoOptions => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
