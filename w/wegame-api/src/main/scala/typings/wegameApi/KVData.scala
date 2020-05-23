package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KVData extends js.Object {
  var key: String
  var value: String
}

object KVData {
  @scala.inline
  def apply(key: String, value: String): KVData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KVData]
  }
}

