package typings.wegameApi.anon

import typings.wegameApi.KVData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KVDataList extends StObject {
  
  var KVDataList: js.Array[KVData] = js.native
}
object KVDataList {
  
  @scala.inline
  def apply(KVDataList: js.Array[KVData]): KVDataList = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any])
    __obj.asInstanceOf[KVDataList]
  }
  
  @scala.inline
  implicit class KVDataListMutableBuilder[Self <: KVDataList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKVDataList(value: js.Array[KVData]): Self = StObject.set(x, "KVDataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKVDataListVarargs(value: KVData*): Self = StObject.set(x, "KVDataList", js.Array(value :_*))
  }
}
