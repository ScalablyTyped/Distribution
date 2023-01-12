package typings.wegameApi.anon

import typings.wegameApi.KVData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KVDataList extends StObject {
  
  var KVDataList: js.Array[KVData]
}
object KVDataList {
  
  inline def apply(KVDataList: js.Array[KVData]): KVDataList = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any])
    __obj.asInstanceOf[KVDataList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KVDataList] (val x: Self) extends AnyVal {
    
    inline def setKVDataList(value: js.Array[KVData]): Self = StObject.set(x, "KVDataList", value.asInstanceOf[js.Any])
    
    inline def setKVDataListVarargs(value: KVData*): Self = StObject.set(x, "KVDataList", js.Array(value*))
  }
}
