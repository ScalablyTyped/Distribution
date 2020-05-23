package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  /**
    * 取值为0或1，取值为0时会把 App、Page 的生命周期函数和 wx 命名空间下的函数调用写入日志，取值为1则不会。
    * 默认值是 0
    */
  var level: js.UndefOr[typings.wegameApi.wegameApiNumbers.`0` | typings.wegameApi.wegameApiNumbers.`1`] = js.undefined
}

object `3` {
  @scala.inline
  def apply(level: typings.wegameApi.wegameApiNumbers.`0` | typings.wegameApi.wegameApiNumbers.`1` = null): `3` = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

