package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardExe
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 仅自定义 code 模式的卡券须填写，非自定义 code 模式卡券不可填写，详情
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * 卡券在第三方系统的实际领取时间，为东八区时间戳（UTC+8,精确到秒）。
    * 当卡券的有效期类为 DATE_TYPE_FIX_TERM 时专用，标识卡券的实际生效时间，
    * 用于解决商户系统内起始时间和领取微信卡券时间不同步的问题。
    */
  var fixed_begintimestamp: js.UndefOr[Double] = js.undefined
  
  /**
    * 随机字符串，由开发者设置传入，加强安全性（若不填写可能被重放请求）。随机字符串，不长于 32 位。
    * 推荐使用大小写字母和数字，不同添加请求的 nonce_str 须动态生成，若重复将会导致领取失败。
    */
  var nonce_str: js.UndefOr[String] = js.undefined
  
  // 指定领取者的openid，只有该用户能领取。 bind_openid 字段为 true 的卡券必须填写，bind_openid 字段为 false 不可填写。
  var openid: js.UndefOr[String] = js.undefined
  
  // 领取渠道参数，用于标识本次领取的渠道值。
  var outer_str: js.UndefOr[String] = js.undefined
  
  // 签名，商户将接口列表中的参数按照指定方式进行签名,签名方式使用 SHA1，具体签名方案参见：卡券签名
  var signature: String
  
  // 时间戳，东八区时间,UTC+8，单位为秒
  var timestamp: Double
}
object CardExe {
  
  inline def apply(signature: String, timestamp: Double): CardExe = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardExe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardExe] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setFixed_begintimestamp(value: Double): Self = StObject.set(x, "fixed_begintimestamp", value.asInstanceOf[js.Any])
    
    inline def setFixed_begintimestampUndefined: Self = StObject.set(x, "fixed_begintimestamp", js.undefined)
    
    inline def setNonce_str(value: String): Self = StObject.set(x, "nonce_str", value.asInstanceOf[js.Any])
    
    inline def setNonce_strUndefined: Self = StObject.set(x, "nonce_str", js.undefined)
    
    inline def setOpenid(value: String): Self = StObject.set(x, "openid", value.asInstanceOf[js.Any])
    
    inline def setOpenidUndefined: Self = StObject.set(x, "openid", js.undefined)
    
    inline def setOuter_str(value: String): Self = StObject.set(x, "outer_str", value.asInstanceOf[js.Any])
    
    inline def setOuter_strUndefined: Self = StObject.set(x, "outer_str", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
