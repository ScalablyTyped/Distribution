package typings.wegameApi.anon

import typings.wegameApi.KVData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteFail extends StObject {
  
  /**
    * 要修改的 KV 数据列表
    */
  var KVDataList: js.Array[KVData]
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object CompleteFail {
  
  inline def apply(KVDataList: js.Array[KVData]): CompleteFail = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteFail]
  }
  
  extension [Self <: CompleteFail](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setKVDataList(value: js.Array[KVData]): Self = StObject.set(x, "KVDataList", value.asInstanceOf[js.Any])
    
    inline def setKVDataListVarargs(value: KVData*): Self = StObject.set(x, "KVDataList", js.Array(value :_*))
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
