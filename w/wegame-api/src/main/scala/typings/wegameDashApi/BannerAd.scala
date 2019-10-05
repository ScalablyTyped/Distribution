package typings.wegameDashApi

import typings.wegameDashApi.wx.types.AdStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * banner 广告组件。banner 广告组件是一个原生组件，层级比上屏 Canvas 高，会覆盖在上屏 Canvas 上。banner 广告组件默认是隐藏的，需要调用 BannerAd.show() 将其显示。banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的尺寸将通过 BannerAd.onResize() 事件中提供。
  */
@JSGlobal("BannerAd")
@js.native
class BannerAd () extends js.Object {
  /**
    * 广告单元 id
    */
  var adUnitId: String = js.native
  /**
    * banner 广告组件的样式。style 上的属性的值仅为开发者设置的值，banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的真实尺寸需要通过 BannerAd.onResize() 事件获得。
    */
  var style: AdStyle = js.native
  /**
    * 销毁 banner 广告
    */
  def destroy(): Unit = js.native
  /**
    * 隐藏 banner 广告
    */
  def hide(): Unit = js.native
  /**
    * 取消监听banner 广告错误事件
    */
  def offError(callback: js.Function1[/* res */ Anon_ErrMsg, Unit]): Unit = js.native
  /**
    * 取消监听banner 广告加载事件
    */
  def offLoad(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听隐藏 banner 广告缩放
    */
  def offResize(callback: js.Function1[/* res */ Anon_Height, Unit]): Unit = js.native
  /**
    * 监听banner 广告错误事件
    */
  def onError(callback: js.Function1[/* res */ Anon_ErrMsg, Unit]): Unit = js.native
  /**
    * 监听banner 广告加载事件
    */
  def onLoad(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听 banner 广告缩放
    */
  def onResize(callback: js.Function1[/* res */ Anon_Height, Unit]): Unit = js.native
  /**
    * 显示 banner 广告。
    */
  def show(): js.Promise[Unit] = js.native
}

