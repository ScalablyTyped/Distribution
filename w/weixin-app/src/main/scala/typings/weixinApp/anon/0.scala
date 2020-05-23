package typings.weixinApp.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var data: js.UndefOr[(Record[String, _]) | String] = js.undefined
}

object `0` {
  @scala.inline
  def apply(data: (Record[String, _]) | String = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

