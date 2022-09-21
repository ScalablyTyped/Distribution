package typings.wegameApi

import typings.wegameApi.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdObject extends StObject {
  
  /**
    * 广告单元 id
    */
  var adUnitId: String
  
  /**
    * 销毁广告
    */
  def destroy(): Unit
  
  /**
    * 取消监听广告错误事件
    */
  def offError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit
  
  /**
    * 取消监听广告加载事件
    */
  def offLoad(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听广告错误事件
    */
  def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit
  
  /**
    * 监听广告加载事件
    */
  def onLoad(callback: js.Function0[Unit]): Unit
  
  /**
    * 显示广告。
    */
  def show(): js.Promise[Unit]
}
object AdObject {
  
  inline def apply(
    adUnitId: String,
    destroy: () => Unit,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    offLoad: js.Function0[Unit] => Unit,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    onLoad: js.Function0[Unit] => Unit,
    show: () => js.Promise[Unit]
  ): AdObject = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), offError = js.Any.fromFunction1(offError), offLoad = js.Any.fromFunction1(offLoad), onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[AdObject]
  }
  
  extension [Self <: AdObject](x: Self) {
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setOffError(value: js.Function1[/* res */ ErrMsg, Unit] => Unit): Self = StObject.set(x, "offError", js.Any.fromFunction1(value))
    
    inline def setOffLoad(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "offLoad", js.Any.fromFunction1(value))
    
    inline def setOnError(value: js.Function1[/* res */ ErrMsg, Unit] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnLoad(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => js.Promise[Unit]): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
