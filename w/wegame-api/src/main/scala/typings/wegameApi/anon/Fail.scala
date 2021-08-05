package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fail extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 要拉取的 key 列表
    */
  var keyList: js.Array[String]
  
  var success: js.UndefOr[js.Function1[/* res */ `2`, Unit]] = js.undefined
}
object Fail {
  
  inline def apply(keyList: js.Array[String]): Fail = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  
  extension [Self <: Fail](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setKeyList(value: js.Array[String]): Self = StObject.set(x, "keyList", value.asInstanceOf[js.Any])
    
    inline def setKeyListVarargs(value: String*): Self = StObject.set(x, "keyList", js.Array(value :_*))
    
    inline def setSuccess(value: /* res */ `2` => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
