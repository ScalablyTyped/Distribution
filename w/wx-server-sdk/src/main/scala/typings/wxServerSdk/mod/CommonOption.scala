package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOption[T] extends js.Object {
  var data: T
}

object CommonOption {
  @scala.inline
  def apply[T](data: T): CommonOption[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommonOption[T]]
  }
}

