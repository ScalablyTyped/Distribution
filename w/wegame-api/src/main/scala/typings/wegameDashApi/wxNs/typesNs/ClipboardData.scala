package typings.wegameDashApi.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --剪切板
trait ClipboardData extends js.Object {
  var data: String
}

object ClipboardData {
  @scala.inline
  def apply(data: String): ClipboardData = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[ClipboardData]
  }
}

