package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyList extends js.Object {
  /**
    * 要获取的 key 列表
    */
  var keyList: js.Array[String]
}

object AnonKeyList {
  @scala.inline
  def apply(keyList: js.Array[String]): AnonKeyList = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyList]
  }
}

