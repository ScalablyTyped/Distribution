package typings.wegameApi.anon

import typings.wegameApi.UserGameData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2` extends js.Object {
  var data: js.Array[UserGameData] = js.native
}

object `2` {
  @scala.inline
  def apply(data: js.Array[UserGameData]): `2` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: UserGameData*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[UserGameData]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

