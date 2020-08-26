package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnNetworkStatusChangeSuccess extends js.Object {
  /**
    * 当前是否有网络连接
    */
  var isConnected: js.UndefOr[Double] = js.native
  /**
    * 网络类型
    */
  var networkType: js.UndefOr[String] = js.native
}

object OnNetworkStatusChangeSuccess {
  @scala.inline
  def apply(): OnNetworkStatusChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnNetworkStatusChangeSuccess]
  }
  @scala.inline
  implicit class OnNetworkStatusChangeSuccessOps[Self <: OnNetworkStatusChangeSuccess] (val x: Self) extends AnyVal {
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
    def setIsConnected(value: Double): Self = this.set("isConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConnected: Self = this.set("isConnected", js.undefined)
    @scala.inline
    def setNetworkType(value: String): Self = this.set("networkType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkType: Self = this.set("networkType", js.undefined)
  }
  
}

