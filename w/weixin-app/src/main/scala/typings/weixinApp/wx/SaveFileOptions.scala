package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveFileOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 返回文件的保存路径，res = {savedFilePath: '文件的保存路径'} */
  @JSName("success")
  var success_SaveFileOptions: js.UndefOr[js.Function1[/* res */ SavedFileData, Unit]] = js.native
  
  /** 需要保存的文件的临时路径 */
  var tempFilePath: String = js.native
}
object SaveFileOptions {
  
  @scala.inline
  def apply(tempFilePath: String): SaveFileOptions = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileOptions]
  }
  
  @scala.inline
  implicit class SaveFileOptionsMutableBuilder[Self <: SaveFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ SavedFileData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
