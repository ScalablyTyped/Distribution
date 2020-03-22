package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsSuccess extends js.Object {
  /**
    * 卡券的扩展参数，值为一个 JSON 字符串
    */
  var cardExt: String
  /**
    * 用户领取到卡券的 ID
    */
  var cardId: String
  /**
    * 加密 code，为用户领取到卡券的code加密后的字符串，解密请参照：code 解码接口
    */
  var code: String
  /**
    * 是否成功
    */
  var isSuccess: Boolean
}

object AnonIsSuccess {
  @scala.inline
  def apply(cardExt: String, cardId: String, code: String, isSuccess: Boolean): AnonIsSuccess = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsSuccess]
  }
}

