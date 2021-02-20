package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessageImg extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 会话内消息卡片图片路径
    */
  var sendMessageImg: js.UndefOr[String] = js.native
  
  /**
    * 会话内消息卡片路径
    */
  var sendMessagePath: js.UndefOr[String] = js.native
  
  /**
    * 会话内消息卡片标题
    */
  var sendMessageTitle: js.UndefOr[String] = js.native
  
  /**
    * 会话来源
    */
  var sessionFrom: js.UndefOr[String] = js.native
  
  /**
    * 是否显示会话内消息卡片，设置此参数为 true，用户进入客服会话之后会收到一个消息卡片，通过以下三个参数设置卡片的内容
    */
  var showMessageCard: js.UndefOr[Boolean] = js.native
  
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}
object SendMessageImg {
  
  @scala.inline
  def apply(): SendMessageImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageImg]
  }
  
  @scala.inline
  implicit class SendMessageImgMutableBuilder[Self <: SendMessageImg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSendMessageImg(value: String): Self = StObject.set(x, "sendMessageImg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMessageImgUndefined: Self = StObject.set(x, "sendMessageImg", js.undefined)
    
    @scala.inline
    def setSendMessagePath(value: String): Self = StObject.set(x, "sendMessagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMessagePathUndefined: Self = StObject.set(x, "sendMessagePath", js.undefined)
    
    @scala.inline
    def setSendMessageTitle(value: String): Self = StObject.set(x, "sendMessageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMessageTitleUndefined: Self = StObject.set(x, "sendMessageTitle", js.undefined)
    
    @scala.inline
    def setSessionFrom(value: String): Self = StObject.set(x, "sessionFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionFromUndefined: Self = StObject.set(x, "sessionFrom", js.undefined)
    
    @scala.inline
    def setShowMessageCard(value: Boolean): Self = StObject.set(x, "showMessageCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMessageCardUndefined: Self = StObject.set(x, "showMessageCard", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
