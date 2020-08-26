package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `3` extends js.Object {
  /**
    * 取值为0或1，取值为0时会把 App、Page 的生命周期函数和 wx 命名空间下的函数调用写入日志，取值为1则不会。
    * 默认值是 0
    */
  var level: js.UndefOr[typings.wegameApi.wegameApiNumbers.`0` | typings.wegameApi.wegameApiNumbers.`1`] = js.native
}

object `3` {
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  @scala.inline
  implicit class `3Ops`[Self <: `3`] (val x: Self) extends AnyVal {
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
    def setLevel(value: typings.wegameApi.wegameApiNumbers.`0` | typings.wegameApi.wegameApiNumbers.`1`): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

