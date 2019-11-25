package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 数据缓存
trait StorageInfo extends js.Object {
  //  当前占用的空间大小, 单位 KB
  var currentSize: Double
  //  当前 storage 中所有的 key
  var keys: js.Array[String]
  //  限制的空间大小，单位 KB
  var limitSize: Double
}

object StorageInfo {
  @scala.inline
  def apply(currentSize: Double, keys: js.Array[String], limitSize: Double): StorageInfo = {
    val __obj = js.Dynamic.literal(currentSize = currentSize.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], limitSize = limitSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageInfo]
  }
}

