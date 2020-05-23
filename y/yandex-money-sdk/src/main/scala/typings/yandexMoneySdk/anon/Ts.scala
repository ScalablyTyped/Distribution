package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ts extends js.Object {
  var ts: String
  var url: String
}

object Ts {
  @scala.inline
  def apply(ts: String, url: String): Ts = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ts]
  }
}

