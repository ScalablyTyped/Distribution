package typings.wechatMiniprogram.WechatMiniprogram.Component

import typings.wechatMiniprogram.WechatMiniprogram.Page.IResizeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageLifetimes extends StObject {
  
  /** 页面生命周期回调—监听页面隐藏
    *
    * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，小程序切入后台等。
    */
  def hide(): Unit
  
  /** 页面生命周期回调—监听页面尺寸变化
    *
    * 所在页面尺寸变化时执行
    */
  def resize(size: IResizeOption): Unit
  
  /** 页面生命周期回调—监听页面显示
    *
    * 页面显示/切入前台时触发。
    */
  def show(): Unit
}
object PageLifetimes {
  
  inline def apply(hide: () => Unit, resize: IResizeOption => Unit, show: () => Unit): PageLifetimes = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), resize = js.Any.fromFunction1(resize), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PageLifetimes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageLifetimes] (val x: Self) extends AnyVal {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setResize(value: IResizeOption => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
