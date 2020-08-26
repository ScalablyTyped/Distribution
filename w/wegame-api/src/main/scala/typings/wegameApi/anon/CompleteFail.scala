package typings.wegameApi.anon

import typings.wegameApi.KVData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteFail extends js.Object {
  /**
    * 要修改的 KV 数据列表
    */
  var KVDataList: js.Array[KVData] = js.native
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object CompleteFail {
  @scala.inline
  def apply(KVDataList: js.Array[KVData]): CompleteFail = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteFail]
  }
  @scala.inline
  implicit class CompleteFailOps[Self <: CompleteFail] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

