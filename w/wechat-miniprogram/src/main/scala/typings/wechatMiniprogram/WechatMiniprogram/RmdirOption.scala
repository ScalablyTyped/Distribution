package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RmdirOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RmdirCompleteCallback] = js.undefined
  
  /** 要删除的目录路径 (本地路径) */
  var dirPath: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RmdirFailCallback] = js.undefined
  
  /** 是否递归删除目录。如果为 true，则删除该目录和该目录下的所有子目录以及文件。
    *
    * 最低基础库： `2.3.0` */
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RmdirSuccessCallback] = js.undefined
}
object RmdirOption {
  
  @scala.inline
  def apply(dirPath: String): RmdirOption = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmdirOption]
  }
  
  @scala.inline
  implicit class RmdirOptionMutableBuilder[Self <: RmdirOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDirPath(value: String): Self = StObject.set(x, "dirPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* result */ RmdirFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
