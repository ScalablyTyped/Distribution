package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkType extends js.Object {
  var networkType: String = js.native
}

object NetworkType {
  @scala.inline
  def apply(networkType: String): NetworkType = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkType]
  }
  @scala.inline
  implicit class NetworkTypeOps[Self <: NetworkType] (val x: Self) extends AnyVal {
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
    def setNetworkType(value: String): Self = this.set("networkType", value.asInstanceOf[js.Any])
  }
  
}

