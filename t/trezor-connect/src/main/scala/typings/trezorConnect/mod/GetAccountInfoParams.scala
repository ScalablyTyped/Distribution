package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountInfoParams extends CommonParams {
      // if both these fields are missing, the user will select an account
  var coin: String = js.native
  var path: js.UndefOr[js.Array[Double]] = js.native
    // NOTE:
  var xpub: js.UndefOr[String] = js.native
}

object GetAccountInfoParams {
  @scala.inline
  def apply(coin: String): GetAccountInfoParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountInfoParams]
  }
  @scala.inline
  implicit class GetAccountInfoParamsOps[Self <: GetAccountInfoParams] (val x: Self) extends AnyVal {
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
    def setCoin(value: String): Self = this.set("coin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: Double*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setXpub(value: String): Self = this.set("xpub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXpub: Self = this.set("xpub", js.undefined)
  }
  
}

