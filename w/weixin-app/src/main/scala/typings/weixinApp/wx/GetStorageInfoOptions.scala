package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MGetStorageInfoOptions(res: StorageInfo): Unit
}
object GetStorageInfoOptions {
  
  inline def apply(success: StorageInfo => Unit): GetStorageInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetStorageInfoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStorageInfoOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: StorageInfo => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
