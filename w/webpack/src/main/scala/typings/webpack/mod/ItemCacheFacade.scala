package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemCacheFacade extends StObject {
  
  def get[T](callback: CallbackCache[T]): Unit
  
  def getPromise[T](): js.Promise[T]
  
  def provide[T](
    computer: js.Function1[/* arg0 */ CallbackNormalErrorCache[T], Unit],
    callback: CallbackNormalErrorCache[T]
  ): Unit
  
  def providePromise[T](computer: js.Function0[T | js.Promise[T]]): js.Promise[T]
  
  def store[T](data: T, callback: CallbackCache[Unit]): Unit
  
  def storePromise[T](data: T): js.Promise[Unit]
}
object ItemCacheFacade {
  
  inline def apply(
    get: CallbackCache[Any] => Unit,
    getPromise: () => js.Promise[Any],
    provide: (js.Function1[/* arg0 */ CallbackNormalErrorCache[Any], Unit], CallbackNormalErrorCache[Any]) => Unit,
    providePromise: js.Function0[Any | js.Promise[Any]] => js.Promise[Any],
    store: (Any, CallbackCache[Unit]) => Unit,
    storePromise: Any => js.Promise[Unit]
  ): ItemCacheFacade = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getPromise = js.Any.fromFunction0(getPromise), provide = js.Any.fromFunction2(provide), providePromise = js.Any.fromFunction1(providePromise), store = js.Any.fromFunction2(store), storePromise = js.Any.fromFunction1(storePromise))
    __obj.asInstanceOf[ItemCacheFacade]
  }
  
  extension [Self <: ItemCacheFacade](x: Self) {
    
    inline def setGet(value: CallbackCache[Any] => Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetPromise(value: () => js.Promise[Any]): Self = StObject.set(x, "getPromise", js.Any.fromFunction0(value))
    
    inline def setProvide(
      value: (js.Function1[/* arg0 */ CallbackNormalErrorCache[Any], Unit], CallbackNormalErrorCache[Any]) => Unit
    ): Self = StObject.set(x, "provide", js.Any.fromFunction2(value))
    
    inline def setProvidePromise(value: js.Function0[Any | js.Promise[Any]] => js.Promise[Any]): Self = StObject.set(x, "providePromise", js.Any.fromFunction1(value))
    
    inline def setStore(value: (Any, CallbackCache[Unit]) => Unit): Self = StObject.set(x, "store", js.Any.fromFunction2(value))
    
    inline def setStorePromise(value: Any => js.Promise[Unit]): Self = StObject.set(x, "storePromise", js.Any.fromFunction1(value))
  }
}
