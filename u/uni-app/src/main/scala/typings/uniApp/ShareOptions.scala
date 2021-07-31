package typings.uniApp

import typings.uniApp.uniAppStrings.`0`
import typings.uniApp.uniAppStrings.`1`
import typings.uniApp.uniAppStrings.`2`
import typings.uniApp.uniAppStrings.`3`
import typings.uniApp.uniAppStrings.`4`
import typings.uniApp.uniAppStrings.`5`
import typings.uniApp.uniAppStrings.qq
import typings.uniApp.uniAppStrings.sinaweibo
import typings.uniApp.uniAppStrings.weixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 跳转链接
    */
  var href: js.UndefOr[String] = js.undefined
  
  /**
    * 图片地址
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * 音视频地址
    */
  var mediaUrl: js.UndefOr[String] = js.undefined
  
  /**
    * 分享小程序
    */
  var miniProgram: js.UndefOr[MiniProgramShareOptions] = js.undefined
  
  /**
    * 分享服务提供商，通过uni.getProvider获取，如果不设置则弹出分享列表选择界面
    * - sinaweibo: 新浪微博分享
    * - qq: 分享到QQ好友
    * - weixin: 分享微信消息、朋友圈及微信小程序
    */
  var provider: js.UndefOr[sinaweibo | qq | weixin] = js.undefined
  
  /**
    * 场景。可取值“WXSceneSession”分享到聊天界面，“WXSenceTimeline”分享到朋友圈，“WXSceneFavorite”分享到微信收藏
    */
  var scene: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 摘要
    */
  var summary: js.UndefOr[String] = js.undefined
  
  /**
    * 标题
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * 分享类型。默认图文0，纯文字1，纯图片2，音乐3，视频4，小程序5。
    * - 0: 图文
    * - 1: 纯文字
    * - 2: 纯图片
    * - 3: 音乐
    * - 4: 视频
    * - 5: 小程序
    */
  var `type`: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5`] = js.undefined
}
object ShareOptions {
  
  @scala.inline
  def apply(): ShareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareOptions]
  }
  
  @scala.inline
  implicit class ShareOptionsMutableBuilder[Self <: ShareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setMediaUrl(value: String): Self = StObject.set(x, "mediaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUrlUndefined: Self = StObject.set(x, "mediaUrl", js.undefined)
    
    @scala.inline
    def setMiniProgram(value: MiniProgramShareOptions): Self = StObject.set(x, "miniProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniProgramUndefined: Self = StObject.set(x, "miniProgram", js.undefined)
    
    @scala.inline
    def setProvider(value: sinaweibo | qq | weixin): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setScene(value: String): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: `0` | `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
