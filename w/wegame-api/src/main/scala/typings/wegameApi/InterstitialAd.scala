package typings.wegameApi

import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.IsEnded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 插屏广告组件。插屏广告组件是一个原生组件，层级比普通组件高。插屏广告组件每次创建都会返回一个全新的实例（小程序端的插屏广告实例不允许跨页面使用），默认是隐藏的，需要调用 InterstitialAd.show() 将其显示。
  */
trait InterstitialAd
  extends StObject
     with AdObject {
  
  /**
    * 加载广告
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
  
  inline def apply(
    adUnitId: String,
    destroy: () => Unit,
    load: () => js.Promise[Unit],
    offClose: js.Function1[/* res */ IsEnded, Unit] => Unit,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    offLoad: js.Function0[Unit] => Unit,
    onClose: js.Function1[/* res */ IsEnded, Unit] => Unit,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    onLoad: js.Function0[Unit] => Unit,
    show: () => js.Promise[Unit]
  ): InterstitialAd = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), load = js.Any.fromFunction0(load), offClose = js.Any.fromFunction1(offClose), offError = js.Any.fromFunction1(offError), offLoad = js.Any.fromFunction1(offLoad), onClose = js.Any.fromFunction1(onClose), onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[InterstitialAd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterstitialAd] (val x: Self) extends AnyVal {
    
    inline def setLoad(value: () => js.Promise[Unit]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def setOffClose(value: js.Function1[/* res */ IsEnded, Unit] => Unit): Self = StObject.set(x, "offClose", js.Any.fromFunction1(value))
    
    inline def setOnClose(value: js.Function1[/* res */ IsEnded, Unit] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
  }
}
