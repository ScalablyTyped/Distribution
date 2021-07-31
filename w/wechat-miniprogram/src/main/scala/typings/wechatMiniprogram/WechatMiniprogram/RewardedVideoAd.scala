package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RewardedVideoAd extends StObject {
  
  /** [RewardedVideoAd.destroy()](https://developers.weixin.qq.com/miniprogram/dev/api/ad/RewardedVideoAd.destroy.html)
    *
    * 销毁激励视频广告实例。
    *
    * 最低基础库： `2.8.0` */
  def destroy(): Unit = js.native
  
  /** [Promise RewardedVideoAd.load()](https://developers.weixin.qq.com/miniprogram/dev/api/ad/RewardedVideoAd.load.html)
    *
    * 加载激励视频广告。 */
  def load(): js.Promise[js.Any] = js.native
  
  /** [RewardedVideoAd.offClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/RewardedVideoAd.offClose.html)
    *
    * 取消监听用户点击 `关闭广告` 按钮的事件 */
  def offClose(): Unit = js.native
  def offClose(/** 用户点击 `关闭广告` 按钮的事件的回调函数 */
  callback: RewardedVideoAdOffCloseCallback): Unit = js.native
  
  /** [RewardedVideoAd.offError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/RewardedVideoAd.offError.html)
    *
    * 取消监听激励视频错误事件 */
  def offError(): Unit = js.native
  def offError(/** 激励视频错误事件的回调函数 */
  callback: RewardedVideoAdOffErrorCallback): Unit = js.native
  
  /** [RewardedVideoAd.offLoad(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/RewardedVideoAd.offLoad.html)
    *
    * 取消监听激励视频广告加载事件 */
  def offLoad(): Unit = js.native
  def offLoad(/** 激励视频广告加载事件的回调函数 */
  callback: OffLoadCallback): Unit = js.native
  
  /** [RewardedVideoAd.onClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/RewardedVideoAd.onClose.html)
    *
    * 监听用户点击 `关闭广告` 按钮的事件。 */
  def onClose(/** 用户点击 `关闭广告` 按钮的事件的回调函数 */
  callback: RewardedVideoAdOnCloseCallback): Unit = js.native
  
  /** [RewardedVideoAd.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/RewardedVideoAd.onError.html)
    *
    * 监听激励视频错误事件。
    *
    * **错误码信息与解决方案表**
    *
    *
    *  错误码是通过onError获取到的错误信息。调试期间，可以通过异常返回来捕获信息。
    *  在小程序发布上线之后，如果遇到异常问题，可以在[“运维中心“](https://mp.weixin.qq.com/)里面搜寻错误日志，还可以针对异常返回加上适当的监控信息。
    *
    * | 代码 | 异常情况 | 理由 | 解决方案 |
    * | ------ | -------------- | --------------- | -------------------------- |
    * | 1000  | 后端错误调用失败  | 该项错误不是开发者的异常情况 | 一般情况下忽略一段时间即可恢复。 |
    * | 1001  | 参数错误    | 使用方法错误 | 可以前往developers.weixin.qq.com确认具体教程（小程序和小游戏分别有各自的教程，可以在顶部选项中，“设计”一栏的右侧进行切换。|
    * | 1002  | 广告单元无效    | 可能是拼写错误、或者误用了其他APP的广告ID | 请重新前往mp.weixin.qq.com确认广告位ID。 |
    * | 1003  | 内部错误    | 该项错误不是开发者的异常情况 | 一般情况下忽略一段时间即可恢复。|
    * | 1004  | 无适合的广告   | 广告不是每一次都会出现，这次没有出现可能是由于该用户不适合浏览广告 | 属于正常情况，且开发者需要针对这种情况做形态上的兼容。 |
    * | 1005  | 广告组件审核中  | 你的广告正在被审核，无法展现广告 | 请前往mp.weixin.qq.com确认审核状态，且开发者需要针对这种情况做形态上的兼容。|
    * | 1006  | 广告组件被驳回  | 你的广告审核失败，无法展现广告 | 请前往mp.weixin.qq.com确认审核状态，且开发者需要针对这种情况做形态上的兼容。|
    * | 1007  | 广告组件被驳回  | 你的广告能力已经被封禁，封禁期间无法展现广告 | 请前往mp.weixin.qq.com确认小程序广告封禁状态。 |
    * | 1008  | 广告单元已关闭  | 该广告位的广告能力已经被关闭 | 请前往mp.weixin.qq.com重新打开对应广告位的展现。| */
  def onError(/** 激励视频错误事件的回调函数 */
  callback: RewardedVideoAdOnErrorCallback): Unit = js.native
  
  /** [RewardedVideoAd.onLoad(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/RewardedVideoAd.onLoad.html)
    *
    * 监听激励视频广告加载事件。 */
  def onLoad(/** 激励视频广告加载事件的回调函数 */
  callback: OnLoadCallback): Unit = js.native
  
  /** [Promise RewardedVideoAd.show()](https://developers.weixin.qq.com/miniprogram/dev/api/ad/RewardedVideoAd.show.html)
    *
    * 显示激励视频广告。激励视频广告将从屏幕下方推入。 */
  def show(): js.Promise[js.Any] = js.native
}
