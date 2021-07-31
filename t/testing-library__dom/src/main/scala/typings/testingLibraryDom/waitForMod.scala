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
  
  @scala.inline
  def waitFor[T](callback: js.Function0[T | js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def waitFor[T](callback: js.Function0[T | js.Promise[T]], options: waitForOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait waitForOptions extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var mutationObserverOptions: js.UndefOr[MutationObserverInit] = js.undefined
    
    var onTimeout: js.UndefOr[js.Function1[/* error */ Error, Error]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object waitForOptions {
    
    @scala.inline
    def apply(): waitForOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[waitForOptions]
    }
    
    @scala.inline
    implicit class waitForOptionsMutableBuilder[Self <: waitForOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMutationObserverOptions(value: MutationObserverInit): Self = StObject.set(x, "mutationObserverOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutationObserverOptionsUndefined: Self = StObject.set(x, "mutationObserverOptions", js.undefined)
      
      @scala.inline
      def setOnTimeout(value: /* error */ Error => Error): Self = StObject.set(x, "onTimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeoutUndefined: Self = StObject.set(x, "onTimeout", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
