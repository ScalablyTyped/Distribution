package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKVDataList extends js.Object {
  var KVDataList: js.Array[KVData]
}

object AnonKVDataList {
  @scala.inline
  def apply(KVDataList: js.Array[KVData]): AnonKVDataList = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKVDataList]
  }
}

