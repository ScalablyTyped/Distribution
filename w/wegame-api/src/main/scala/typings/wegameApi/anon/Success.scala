package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 要删除掉 key 列表
    */
  var keyList: js.Array[String]
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Success {
  
  @scala.inline
  def apply(keyList: js.Array[String]): Success = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit class SuccessMutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setKeyList(value: js.Array[String]): Self = StObject.set(x, "keyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyListVarargs(value: String*): Self = StObject.set(x, "keyList", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
