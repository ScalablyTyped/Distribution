package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataKey extends js.Object {
  var data: String | js.Object
  var key: String
}

object Anon_DataKey {
  @scala.inline
  def apply(data: String | js.Object, key: String): Anon_DataKey = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key)
  
    __obj.asInstanceOf[Anon_DataKey]
  }
}

