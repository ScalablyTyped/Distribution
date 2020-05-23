package typings.wegameApi.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var data: String | ArrayBuffer
}

object `0` {
  @scala.inline
  def apply(data: String | ArrayBuffer): `0` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

