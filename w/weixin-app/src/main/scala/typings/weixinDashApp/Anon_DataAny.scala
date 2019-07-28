package typings.weixinDashApp

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataAny extends js.Object {
  var data: js.UndefOr[(Record[String, _]) | String] = js.undefined
}

object Anon_DataAny {
  @scala.inline
  def apply(data: (Record[String, _]) | String = null): Anon_DataAny = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataAny]
  }
}

