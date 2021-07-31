package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.CNY
import typings.wegameApi.wegameApiStrings.android
import typings.wegameApi.wegameApiStrings.game
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyQuantity extends StObject {
  
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
  var buyQuantity: js.UndefOr[Double] = js.undefined
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 币种
    */
  var currencyType: CNY
  
  /**
    * 环境配置，默认值0
    *   0 - 米大师正式环境
    *   1 - 米大师沙箱环境
    */
  var env: js.UndefOr[typings.wegameApi.wegameApiNumbers.`0` | typings.wegameApi.wegameApiNumbers.`1`] = js.undefined
  
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
  var fail: js.UndefOr[js.Function1[/* res */ ErrCode, Unit]] = js.undefined
  
  /**
    * 支付的类型，不同的支付类型有各自额外要传的附加参数。
    *   game - 购买游戏币
    */
  var mode: game
  
  /**
    * 在米大师侧申请的应用 id
    */
  var offerId: String
  
  /**
    * 申请接入时的平台，platform 与应用id有关。
    */
  var platform: js.UndefOr[android] = js.undefined
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 分区 ID
    */
  var zoneId: js.UndefOr[String] = js.undefined
}
object BuyQuantity {
  
  @scala.inline
  def apply(offerId: String): BuyQuantity = {
    val __obj = js.Dynamic.literal(currencyType = "CNY", mode = "game", offerId = offerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyQuantity]
  }
  
  @scala.inline
  implicit class BuyQuantityMutableBuilder[Self <: BuyQuantity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyQuantity(value: Double): Self = StObject.set(x, "buyQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyQuantityUndefined: Self = StObject.set(x, "buyQuantity", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCurrencyType(value: CNY): Self = StObject.set(x, "currencyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: typings.wegameApi.wegameApiNumbers.`0` | typings.wegameApi.wegameApiNumbers.`1`): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ ErrCode => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMode(value: game): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: android): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
  }
}
