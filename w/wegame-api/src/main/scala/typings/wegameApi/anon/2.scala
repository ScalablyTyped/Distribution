package typings.wegameApi.anon

import typings.wegameApi.UserGameData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var data: js.Array[UserGameData]
}

object `2` {
  @scala.inline
  def apply(data: js.Array[UserGameData]): `2` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

