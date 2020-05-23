package typings.wegameApi

import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.IsEnded
import typings.wegameApi.anon.Width
import typings.wegameApi.wx.types.AdStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterstitialAd extends BannerAd {
  /**
    * 加载视频广告
    */
  def load(): js.Promise[Unit]
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def offClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def onClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit
}

object InterstitialAd {
  @scala.inline
  def apply(
    adUnitId: String,
    destroy: () => Unit,
    hide: () => Unit,
    load: () => js.Promise[Unit],
    offClose: js.Function1[/* res */ IsEnded, Unit] => Unit,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    offLoad: js.Function0[Unit] => Unit,
    offResize: js.Function1[/* res */ Width, Unit] => Unit,
    onClose: js.Function1[/* res */ IsEnded, Unit] => Unit,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    onLoad: js.Function0[Unit] => Unit,
    onResize: js.Function1[/* res */ Width, Unit] => Unit,
    show: () => js.Promise[Unit],
    style: AdStyle
  ): InterstitialAd = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), load = js.Any.fromFunction0(load), offClose = js.Any.fromFunction1(offClose), offError = js.Any.fromFunction1(offError), offLoad = js.Any.fromFunction1(offLoad), offResize = js.Any.fromFunction1(offResize), onClose = js.Any.fromFunction1(onClose), onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad), onResize = js.Any.fromFunction1(onResize), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterstitialAd]
  }
}

