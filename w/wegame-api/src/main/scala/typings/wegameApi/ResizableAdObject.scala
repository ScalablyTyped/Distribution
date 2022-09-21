package typings.wegameApi

import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizableAdObject
  extends StObject
     with AdObject {
  
  /**
    * 隐藏广告
    */
  def hide(): Unit
  
  /**
    * 取消监听广告缩放事件
    */
  def offResize(callback: js.Function1[/* res */ Width, Unit]): Unit
  
  /**
    * 监听广告缩放
    */
  def onResize(callback: js.Function1[/* res */ Width, Unit]): Unit
}
object ResizableAdObject {
  
  inline def apply(
    adUnitId: String,
    destroy: () => Unit,
    hide: () => Unit,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    offLoad: js.Function0[Unit] => Unit,
    offResize: js.Function1[/* res */ Width, Unit] => Unit,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    onLoad: js.Function0[Unit] => Unit,
    onResize: js.Function1[/* res */ Width, Unit] => Unit,
    show: () => js.Promise[Unit]
  ): ResizableAdObject = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), offError = js.Any.fromFunction1(offError), offLoad = js.Any.fromFunction1(offLoad), offResize = js.Any.fromFunction1(offResize), onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad), onResize = js.Any.fromFunction1(onResize), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ResizableAdObject]
  }
  
  extension [Self <: ResizableAdObject](x: Self) {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setOffResize(value: js.Function1[/* res */ Width, Unit] => Unit): Self = StObject.set(x, "offResize", js.Any.fromFunction1(value))
    
    inline def setOnResize(value: js.Function1[/* res */ Width, Unit] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
  }
}
