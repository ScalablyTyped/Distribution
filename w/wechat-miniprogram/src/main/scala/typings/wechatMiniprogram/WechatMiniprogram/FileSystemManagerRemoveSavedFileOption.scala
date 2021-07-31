package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemManagerRemoveSavedFileOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RemoveSavedFileCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[FileSystemManagerRemoveSavedFileFailCallback] = js.undefined
  
  /** 需要删除的文件路径 (本地路径) */
  var filePath: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RemoveSavedFileSuccessCallback] = js.undefined
}
object FileSystemManagerRemoveSavedFileOption {
  
  @scala.inline
  def apply(filePath: String): FileSystemManagerRemoveSavedFileOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerRemoveSavedFileOption]
  }
  
  @scala.inline
  implicit class FileSystemManagerRemoveSavedFileOptionMutableBuilder[Self <: FileSystemManagerRemoveSavedFileOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ RemoveSavedFileFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
