package typings.wegameApi

import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.IsEnded
import typings.wegameApi.wx.types.CustomAdStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 原生模板广告组件。原生模板广告组件是一个原生组件，层级比普通组件高。原生模板广告组件默认是隐藏的，需要调用 CustomAd.show() 将其显示。如果宽度可配置，原生模板广告会根据开发者设置的宽度进行等比缩放。
  */
trait CustomAd
  extends StObject
     with AdObject {
  
  /**
    * 隐藏原生模板广告。（某些模板广告无法隐藏）
    */
  def hide(): Unit
  
  /**
    * 查询原生模板广告展示状态。
    */
  def isShow(): Boolean
  
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def offClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit
  
  /**
    * 取消监听原生模板广告隐藏事件
    */
  def offHide(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def onClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit
  
  /**
    * 监听原生模板广告隐藏事件, 某些模板如矩阵格子模板用户点击关闭时也会触发该事件。
    */
  def onHide(callback: js.Function0[Unit]): Unit
  
  /**
    * 原生模板广告组件的样式
    */
  var style: CustomAdStyle
}
object CustomAd {
  
  inline def apply(
    adUnitId: String,
    destroy: () => Unit,
    hide: () => Unit,
    isShow: () => Boolean,
    offClose: js.Function1[/* res */ IsEnded, Unit] => Unit,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    offHide: js.Function0[Unit] => Unit,
    offLoad: js.Function0[Unit] => Unit,
    onClose: js.Function1[/* res */ IsEnded, Unit] => Unit,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    onHide: js.Function0[Unit] => Unit,
    onLoad: js.Function0[Unit] => Unit,
    show: () => js.Promise[Unit],
    style: CustomAdStyle
  ): CustomAd = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), isShow = js.Any.fromFunction0(isShow), offClose = js.Any.fromFunction1(offClose), offError = js.Any.fromFunction1(offError), offHide = js.Any.fromFunction1(offHide), offLoad = js.Any.fromFunction1(offLoad), onClose = js.Any.fromFunction1(onClose), onError = js.Any.fromFunction1(onError), onHide = js.Any.fromFunction1(onHide), onLoad = js.Any.fromFunction1(onLoad), show = js.Any.fromFunction0(show), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomAd] (val x: Self) extends AnyVal {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setIsShow(value: () => Boolean): Self = StObject.set(x, "isShow", js.Any.fromFunction0(value))
    
    inline def setOffClose(value: js.Function1[/* res */ IsEnded, Unit] => Unit): Self = StObject.set(x, "offClose", js.Any.fromFunction1(value))
    
    inline def setOffHide(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "offHide", js.Any.fromFunction1(value))
    
    inline def setOnClose(value: js.Function1[/* res */ IsEnded, Unit] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnHide(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
    
    inline def setStyle(value: CustomAdStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
