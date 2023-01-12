package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncComponentOptions[T] extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var errorComponent: js.UndefOr[Component[Any, Any, Any, ComputedOptions, MethodOptions]] = js.undefined
  
  def loader(): js.Promise[AsyncComponentResolveResult[T]]
  @JSName("loader")
  var loader_Original: AsyncComponentLoader[T]
  
  var loadingComponent: js.UndefOr[Component[Any, Any, Any, ComputedOptions, MethodOptions]] = js.undefined
  
  var onError: js.UndefOr[
    js.Function4[
      /* error */ js.Error, 
      /* retry */ js.Function0[Unit], 
      /* fail */ js.Function0[Unit], 
      /* attempts */ Double, 
      Any
    ]
  ] = js.undefined
  
  var suspensible: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object AsyncComponentOptions {
  
  inline def apply[T](loader: () => js.Promise[AsyncComponentResolveResult[T]]): AsyncComponentOptions[T] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader))
    __obj.asInstanceOf[AsyncComponentOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncComponentOptions[?], T] (val x: Self & AsyncComponentOptions[T]) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setErrorComponent(value: Component[Any, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "errorComponent", value.asInstanceOf[js.Any])
    
    inline def setErrorComponentUndefined: Self = StObject.set(x, "errorComponent", js.undefined)
    
    inline def setLoader(value: () => js.Promise[AsyncComponentResolveResult[T]]): Self = StObject.set(x, "loader", js.Any.fromFunction0(value))
    
    inline def setLoadingComponent(value: Component[Any, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "loadingComponent", value.asInstanceOf[js.Any])
    
    inline def setLoadingComponentUndefined: Self = StObject.set(x, "loadingComponent", js.undefined)
    
    inline def setOnError(
      value: (/* error */ js.Error, /* retry */ js.Function0[Unit], /* fail */ js.Function0[Unit], /* attempts */ Double) => Any
    ): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setSuspensible(value: Boolean): Self = StObject.set(x, "suspensible", value.asInstanceOf[js.Any])
    
    inline def setSuspensibleUndefined: Self = StObject.set(x, "suspensible", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
