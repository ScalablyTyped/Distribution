package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTmplIds extends js.Object {
  /**
    * 需要订阅的消息模板的id的集合（注意：iOS客户端7.0.6版本、Android客户端7.0.7版本之后的一次订阅才支持多个模板消息，iOS客户端7.0.5版本、Android客户端7.0.6版本之前的一次订阅
    * 只支持一个模板消息）消息模板id在[微信公众平台(mp.weixin.qq.com)-功能-订阅消息]中配置
    */
  var tmplIds: js.Array[String]
}

object AnonTmplIds {
  @scala.inline
  def apply(tmplIds: js.Array[String]): AnonTmplIds = {
    val __obj = js.Dynamic.literal(tmplIds = tmplIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTmplIds]
  }
}

