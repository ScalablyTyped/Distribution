package typings.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTs extends js.Object {
  var ts: String
  var url: String
}

object AnonTs {
  @scala.inline
  def apply(ts: String, url: String): AnonTs = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTs]
  }
}

