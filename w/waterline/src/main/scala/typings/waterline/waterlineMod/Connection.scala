package typings.waterline.waterlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var adapter: String
}

object Connection {
  @scala.inline
  def apply(adapter: String): Connection = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Connection]
  }
}

