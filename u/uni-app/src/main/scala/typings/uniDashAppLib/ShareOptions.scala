package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 跳转链接
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 图片地址
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 音视频地址
    */
  var mediaUrl: js.UndefOr[java.lang.String] = js.undefined
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
  var provider: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.sinaweibo | uniDashAppLib.uniDashAppLibStrings.qq | uniDashAppLib.uniDashAppLibStrings.weixin
  ] = js.undefined
  /**
    * 场景。可取值“WXSceneSession”分享到聊天界面，“WXSenceTimeline”分享到朋友圈，“WXSceneFavorite”分享到微信收藏
    */
  var scene: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 摘要
    */
  var summary: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 标题
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享类型。默认图文0，纯文字1，纯图片2，音乐3，视频4，小程序5。
    * - 0: 图文
    * - 1: 纯文字
    * - 2: 纯图片
    * - 3: 音乐
    * - 4: 视频
    * - 5: 小程序
    */
  var `type`: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.`0` | uniDashAppLib.uniDashAppLibStrings.`1` | uniDashAppLib.uniDashAppLibStrings.`2` | uniDashAppLib.uniDashAppLibStrings.`3` | uniDashAppLib.uniDashAppLibStrings.`4` | uniDashAppLib.uniDashAppLibStrings.`5`
  ] = js.undefined
}

object ShareOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    href: java.lang.String = null,
    imageUrl: java.lang.String = null,
    mediaUrl: java.lang.String = null,
    miniProgram: MiniProgramShareOptions = null,
    provider: uniDashAppLib.uniDashAppLibStrings.sinaweibo | uniDashAppLib.uniDashAppLibStrings.qq | uniDashAppLib.uniDashAppLibStrings.weixin = null,
    scene: java.lang.String = null,
    success: () => scala.Unit = null,
    summary: java.lang.String = null,
    title: java.lang.String = null,
    `type`: uniDashAppLib.uniDashAppLibStrings.`0` | uniDashAppLib.uniDashAppLibStrings.`1` | uniDashAppLib.uniDashAppLibStrings.`2` | uniDashAppLib.uniDashAppLibStrings.`3` | uniDashAppLib.uniDashAppLibStrings.`4` | uniDashAppLib.uniDashAppLibStrings.`5` = null
  ): ShareOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (href != null) __obj.updateDynamic("href")(href)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (mediaUrl != null) __obj.updateDynamic("mediaUrl")(mediaUrl)
    if (miniProgram != null) __obj.updateDynamic("miniProgram")(miniProgram)
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOptions]
  }
}

