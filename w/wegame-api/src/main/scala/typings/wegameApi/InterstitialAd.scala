package typings.wegameApi

import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.IsEnded
import typings.wegameApi.anon.Width
import typings.wegameApi.wx.types.AdStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterstitialAd extends BannerAd {
  
  /**
    * 加载视频广告
    */
  def load(): js.Promise[Unit] = js.native
  
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def offClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit = js.native
  
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def onClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit = js.native
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
  
  @scala.inline
  implicit class InterstitialAdOps[Self <: InterstitialAd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoad(value: () => js.Promise[Unit]): Self = this.set("load", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOffClose(value: js.Function1[/* res */ IsEnded, Unit] => Unit): Self = this.set("offClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClose(value: js.Function1[/* res */ IsEnded, Unit] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
  }
}
