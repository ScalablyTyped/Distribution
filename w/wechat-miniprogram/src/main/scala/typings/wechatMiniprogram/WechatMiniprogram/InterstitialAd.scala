package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterstitialAd extends StObject {
  
  /** [InterstitialAd.destroy()](https://developers.weixin.qq.com/miniprogram/dev/api/ad/InterstitialAd.destroy.html)
    *
    * 销毁插屏广告实例。
    *
    * 最低基础库： `2.8.0` */
  def destroy(): Unit = js.native
  
  /** [Promise InterstitialAd.load()](https://developers.weixin.qq.com/miniprogram/dev/api/ad/InterstitialAd.load.html)
    *
    * 加载插屏广告。
    *
    * 最低基础库： `2.8.0` */
  def load(): js.Promise[Any] = js.native
  
  /** [InterstitialAd.offClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/InterstitialAd.offClose.html)
    *
    * 取消监听插屏广告关闭事件 */
  def offClose(): Unit = js.native
  def offClose(/** 插屏广告关闭事件的回调函数 */
  callback: UDPSocketOffCloseCallback): Unit = js.native
  
  /** [InterstitialAd.offError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/InterstitialAd.offError.html)
    *
    * 取消监听插屏错误事件 */
  def offError(): Unit = js.native
  def offError(/** 插屏错误事件的回调函数 */
  callback: InterstitialAdOffErrorCallback): Unit = js.native
  
  /** [InterstitialAd.offLoad(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/InterstitialAd.offLoad.html)
    *
    * 取消监听插屏广告加载事件 */
  def offLoad(): Unit = js.native
  def offLoad(/** 插屏广告加载事件的回调函数 */
  callback: OffLoadCallback): Unit = js.native
  
  /** [InterstitialAd.onClose(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/InterstitialAd.onClose.html)
    *
    * 监听插屏广告关闭事件。 */
  def onClose(/** 插屏广告关闭事件的回调函数 */
  callback: UDPSocketOnCloseCallback): Unit = js.native
  
  /** [InterstitialAd.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/InterstitialAd.onError.html)
    *
    * 监听插屏错误事件。
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
  def onError(/** 插屏错误事件的回调函数 */
  callback: InterstitialAdOnErrorCallback): Unit = js.native
  
  /** [InterstitialAd.onLoad(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/ad/InterstitialAd.onLoad.html)
    *
    * 监听插屏广告加载事件。 */
  def onLoad(/** 插屏广告加载事件的回调函数 */
  callback: OnLoadCallback): Unit = js.native
  
  /** [Promise InterstitialAd.show()](https://developers.weixin.qq.com/miniprogram/dev/api/ad/InterstitialAd.show.html)
    *
    * 显示插屏广告。
    *
    * **错误码信息表**
    *
    *
    *  如果插屏广告显示失败，InterstitialAd.show() 方法会返回一个rejected Promise，开发者可以获取到错误码及对应的错误信息。
    *
    * | 代码 | 异常情况 | 理由 |
    * | ------ | -------------- | -------------------------- |
    * | 2001  | 触发频率限制  | 小程序启动一定时间内不允许展示插屏广告 |
    * | 2002  | 触发频率限制  | 距离小程序插屏广告或者激励视频广告上次播放时间间隔不足，不允许展示插屏广告 |
    * | 2003  | 触发频率限制  | 当前正在播放激励视频广告或者插屏广告，不允许再次展示插屏广告 |
    * | 2004  | 广告渲染失败  | 该项错误不是开发者的异常情况，或因小程序页面切换导致广告渲染失败 |
    * | 2005  | 广告调用异常  | 插屏广告实例不允许跨页面调用 | */
  def show(): js.Promise[Any] = js.native
}
