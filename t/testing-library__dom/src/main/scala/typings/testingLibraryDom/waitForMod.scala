package typings.testingLibraryDom

import typings.std.Error
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitForMod {
  
  @JSImport("@testing-library/dom/types/wait-for", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def waitFor[T](callback: js.Function0[T | js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def waitFor[T](callback: js.Function0[T | js.Promise[T]], options: waitForOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait waitForOptions extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var mutationObserverOptions: js.UndefOr[MutationObserverInit] = js.undefined
    
    var onTimeout: js.UndefOr[js.Function1[/* error */ Error, Error]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object waitForOptions {
    
    inline def apply(): waitForOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[waitForOptions]
    }
    
    extension [Self <: waitForOptions](x: Self) {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMutationObserverOptions(value: MutationObserverInit): Self = StObject.set(x, "mutationObserverOptions", value.asInstanceOf[js.Any])
      
      inline def setMutationObserverOptionsUndefined: Self = StObject.set(x, "mutationObserverOptions", js.undefined)
      
      inline def setOnTimeout(value: /* error */ Error => Error): Self = StObject.set(x, "onTimeout", js.Any.fromFunction1(value))
      
      inline def setOnTimeoutUndefined: Self = StObject.set(x, "onTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
