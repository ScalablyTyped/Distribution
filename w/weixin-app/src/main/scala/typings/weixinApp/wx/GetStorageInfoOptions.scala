package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetStorageInfoOptions(res: StorageInfo): Unit = js.native
}
object GetStorageInfoOptions {
  
  @scala.inline
  def apply(success: StorageInfo => Unit): GetStorageInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetStorageInfoOptions]
  }
  
  @scala.inline
  implicit class GetStorageInfoOptionsMutableBuilder[Self <: GetStorageInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: StorageInfo => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
