package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.CNY
import typings.wegameApi.wegameApiStrings.android
import typings.wegameApi.wegameApiStrings.game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuyQuantity extends js.Object {
  /**
    * 购买数量。mode=game 时必填。购买数量。详见 buyQuantity 限制说明。
    * mode为game（购买游戏币）时，buyQuantity不可任意填写。需满足 buyQuantity * 游戏币单价 = 限定的价格等级。如：游戏币单价为 0.1 元，一次购买最少数量是 10。
    * 有效价格等级如下：
    *       价格等级（单位：人民币）
    *       1
    *       3
    *       6
    *       8
    *       12
    *       18
    *       25
    *       30
    *       40
    *       45
    *       50
    *       60
    *       68
    *       73
    *       78
    *       88
    *       98
    *       108
    *       118
    *       128
    *       148
    *       168
    *       188
    *       198
    *       328
    *       648
    */
  var buyQuantity: js.UndefOr[Double] = js.native
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 币种
    */
  var currencyType: CNY = js.native
  /**
    * 环境配置，默认值0
    *   0 - 米大师正式环境
    *   1 - 米大师沙箱环境
    */
  var env: js.UndefOr[typings.wegameApi.wegameApiNumbers.`0` | typings.wegameApi.wegameApiNumbers.`1`] = js.native
  /**
    * @param res.errCode 有如下值：
    *      -1    系统失败
    *      -2    支付取消
    *      -15001    虚拟支付接口错误码，缺少参数
    *      -15002    虚拟支付接口错误码，参数不合法
    *      -15003    虚拟支付接口错误码，订单重复
    *      -15004    虚拟支付接口错误码，后台错误
    *      -15006    虚拟支付接口错误码，appId 权限被封禁
    *      -15006    虚拟支付接口错误码，货币类型不支持
    *      -15007    虚拟支付接口错误码，订单已支付
    *       1    虚拟支付接口错误码，用户取消支付
    *       2    虚拟支付接口错误码，客户端错误, 判断到小程序在用户处于支付中时,又发起了一笔支付请求
    *       3    虚拟支付接口错误码，Android 独有错误：用户使用 Google Play 支付，而手机未安装 Google Play
    *       4    虚拟支付接口错误码，用户操作系统支付状态异常
    *       5    虚拟支付接口错误码，操作系统错误
    *       6    虚拟支付接口错误码，其他错误
    *       1000    参数错误
    *       1003    米大师 Portal 错误
    */
  var fail: js.UndefOr[js.Function1[/* res */ ErrCode, Unit]] = js.native
  /**
    * 支付的类型，不同的支付类型有各自额外要传的附加参数。
    *   game - 购买游戏币
    */
  var mode: game = js.native
  /**
    * 在米大师侧申请的应用 id
    */
  var offerId: String = js.native
  /**
    * 申请接入时的平台，platform 与应用id有关。
    */
  var platform: js.UndefOr[android] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 分区 ID
    */
  var zoneId: js.UndefOr[String] = js.native
}

object BuyQuantity {
  @scala.inline
  def apply(currencyType: CNY, mode: game, offerId: String): BuyQuantity = {
    val __obj = js.Dynamic.literal(currencyType = currencyType.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyQuantity]
  }
  @scala.inline
  implicit class BuyQuantityOps[Self <: BuyQuantity] (val x: Self) extends AnyVal {
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
    def setCurrencyType(value: CNY): Self = this.set("currencyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: game): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfferId(value: String): Self = this.set("offerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuyQuantity(value: Double): Self = this.set("buyQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyQuantity: Self = this.set("buyQuantity", js.undefined)
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setEnv(value: typings.wegameApi.wegameApiNumbers.`0` | typings.wegameApi.wegameApiNumbers.`1`): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setFail(value: /* res */ ErrCode => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setPlatform(value: android): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setZoneId(value: String): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
  
}

