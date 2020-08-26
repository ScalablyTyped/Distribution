package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends js.Object {
  var removed: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1` = js.native
}

object `1` {
  @scala.inline
  def apply(removed: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1`): `1` = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
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
    def setRemoved(value: typings.wxServerSdk.wxServerSdkNumbers.`0` | typings.wxServerSdk.wxServerSdkNumbers.`1`): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
  
}

