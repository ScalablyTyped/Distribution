package typings.urqlCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataAny extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
}

object DataAny {
  @scala.inline
  def apply(data: js.Any = null): DataAny = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAny]
  }
}

