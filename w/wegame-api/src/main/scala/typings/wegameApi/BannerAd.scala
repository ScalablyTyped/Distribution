package typings.wegameApi

import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.Width
import typings.wegameApi.wx.types.AdStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * banner 广告组件。banner 广告组件是一个原生组件，层级比上屏 Canvas 高，会覆盖在上屏 Canvas 上。banner 广告组件默认是隐藏的，需要调用 BannerAd.show() 将其显示。banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的尺寸将通过 BannerAd.onResize() 事件中提供。
  */
trait BannerAd extends js.Object {
  /**
    * 广告单元 id
    */
  var adUnitId: String
  /**
    * banner 广告组件的样式。style 上的属性的值仅为开发者设置的值，banner 广告会根据开发者设置的宽度进行等比缩放，缩放后的真实尺寸需要通过 BannerAd.onResize() 事件获得。
    */
  var style: AdStyle
  /**
    * 销毁 banner 广告
    */
  def destroy(): Unit
  /**
    * 隐藏 banner 广告
    */
  def hide(): Unit
  /**
    * 取消监听banner 广告错误事件
    */
  def offError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit
  /**
    * 取消监听banner 广告加载事件
    */
  def offLoad(callback: js.Function0[Unit]): Unit
  /**
    * 取消监听隐藏 banner 广告缩放
    */
  def offResize(callback: js.Function1[/* res */ Width, Unit]): Unit
  /**
    * 监听banner 广告错误事件
    */
  def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit
  /**
    * 监听banner 广告加载事件
    */
  def onLoad(callback: js.Function0[Unit]): Unit
  /**
    * 监听 banner 广告缩放
    */
  def onResize(callback: js.Function1[/* res */ Width, Unit]): Unit
  /**
    * 显示 banner 广告。
    */
  def show(): js.Promise[Unit]
}

object BannerAd {
  @scala.inline
  def apply(
    adUnitId: String,
    destroy: () => Unit,
    hide: () => Unit,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    offLoad: js.Function0[Unit] => Unit,
    offResize: js.Function1[/* res */ Width, Unit] => Unit,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    onLoad: js.Function0[Unit] => Unit,
    onResize: js.Function1[/* res */ Width, Unit] => Unit,
    show: () => js.Promise[Unit],
    style: AdStyle
  ): BannerAd = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), offError = js.Any.fromFunction1(offError), offLoad = js.Any.fromFunction1(offLoad), offResize = js.Any.fromFunction1(offResize), onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad), onResize = js.Any.fromFunction1(onResize), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerAd]
  }
}

