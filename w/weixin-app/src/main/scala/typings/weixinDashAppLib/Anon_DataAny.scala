package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataAny extends js.Object {
  var data: js.UndefOr[(stdLib.Record[java.lang.String, _]) | java.lang.String] = js.undefined
}

object Anon_DataAny {
  @scala.inline
  def apply(data: (stdLib.Record[java.lang.String, _]) | java.lang.String = null): Anon_DataAny = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataAny]
  }
}

