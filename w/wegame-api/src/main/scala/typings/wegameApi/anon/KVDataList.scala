package typings.wegameApi.anon

import typings.wegameApi.KVData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KVDataList extends js.Object {
  
  var KVDataList: js.Array[KVData] = js.native
}
object KVDataList {
  
  @scala.inline
  def apply(KVDataList: js.Array[KVData]): KVDataList = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any])
    __obj.asInstanceOf[KVDataList]
  }
  
  @scala.inline
  implicit class KVDataListOps[Self <: KVDataList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKVDataListVarargs(value: KVData*): Self = this.set("KVDataList", js.Array(value :_*))
    
    @scala.inline
    def setKVDataList(value: js.Array[KVData]): Self = this.set("KVDataList", value.asInstanceOf[js.Any])
  }
}
