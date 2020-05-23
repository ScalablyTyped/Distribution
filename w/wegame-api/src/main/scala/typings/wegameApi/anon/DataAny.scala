package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataAny extends js.Object {
  var data: js.Any
}

object DataAny {
  @scala.inline
  def apply(data: js.Any): DataAny = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAny]
  }
}

