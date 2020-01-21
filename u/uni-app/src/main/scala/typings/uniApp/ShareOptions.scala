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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOptions extends js.Object {
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
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    href: String = null,
    imageUrl: String = null,
    mediaUrl: String = null,
    miniProgram: MiniProgramShareOptions = null,
    provider: sinaweibo | qq | weixin = null,
    scene: String = null,
    success: () => Unit = null,
    summary: String = null,
    title: String = null,
    `type`: `0` | `1` | `2` | `3` | `4` | `5` = null
  ): ShareOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (mediaUrl != null) __obj.updateDynamic("mediaUrl")(mediaUrl.asInstanceOf[js.Any])
    if (miniProgram != null) __obj.updateDynamic("miniProgram")(miniProgram.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOptions]
  }
}

