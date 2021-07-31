package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 消息分享对象
  * @deprecated
  */
trait SharedAppMessage
  extends StObject
     with ShareTimelineConfig {
  
  /**
    * 如果 type 是 music 或 video，则要提供数据链接，默认为空
    */
  var dataUrl: js.UndefOr[String] = js.undefined
  
  /**
    * 分享描述
    */
  var desc: String
  
  /**
    * 分享类型, music、video 或 link，不填默认为 link
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SharedAppMessage {
  
  @scala.inline
  def apply(desc: String, link: String, title: String): SharedAppMessage = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAppMessage]
  }
  
  @scala.inline
  implicit class SharedAppMessageMutableBuilder[Self <: SharedAppMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUrlUndefined: Self = StObject.set(x, "dataUrl", js.undefined)
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
