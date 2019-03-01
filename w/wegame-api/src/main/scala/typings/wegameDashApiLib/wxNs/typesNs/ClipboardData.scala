package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --剪切板
trait ClipboardData extends js.Object {
  var data: java.lang.String
}

object ClipboardData {
  @scala.inline
  def apply(data: java.lang.String): ClipboardData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ClipboardData]
  }
}

