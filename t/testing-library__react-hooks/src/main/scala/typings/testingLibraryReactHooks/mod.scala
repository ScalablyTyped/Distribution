package typings.testingLibraryReactHooks

import typings.react.mod.ComponentType
import typings.reactTestRenderer.mod.DebugPromiseLike
import typings.std.Error
import typings.testingLibraryReactHooks.anon.PickWaitOptionstimeout
import typings.testingLibraryReactHooks.anon.PickWaitOptionstimeoutsup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@testing-library/react-hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def act(callback: js.Function0[js.UndefOr[Unit]]): DebugPromiseLike = ^.asInstanceOf[js.Dynamic].applyDynamic("act")(callback.asInstanceOf[js.Any]).asInstanceOf[DebugPromiseLike]
  
  inline def act_Promise(callback: js.Function0[js.Promise[js.UndefOr[Unit]]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("act")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def cleanup(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[js.Promise[Unit]]
  
  inline def renderHook[P, R](callback: js.Function1[/* props */ P, R]): RenderHookResult[P, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderHook")(callback.asInstanceOf[js.Any]).asInstanceOf[RenderHookResult[P, R]]
  inline def renderHook[P, R](callback: js.Function1[/* props */ P, R], options: RenderHookOptions[P]): RenderHookResult[P, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHook")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenderHookResult[P, R]]
  
  trait HookResult[R] extends StObject {
    
    val current: R
    
    val error: Error
  }
  object HookResult {
    
    inline def apply[R](current: R, error: Error): HookResult[R] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookResult[R]]
    }
    
    extension [Self <: HookResult[?], R](x: Self & HookResult[R]) {
      
      inline def setCurrent(value: R): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderHookOptions[P] extends StObject {
    
    var initialProps: js.UndefOr[P] = js.undefined
    
    var wrapper: js.UndefOr[ComponentType[P]] = js.undefined
  }
  object RenderHookOptions {
    
    inline def apply[P](): RenderHookOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderHookOptions[P]]
    }
    
    extension [Self <: RenderHookOptions[?], P](x: Self & RenderHookOptions[P]) {
      
      inline def setInitialProps(value: P): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
      
      inline def setInitialPropsUndefined: Self = StObject.set(x, "initialProps", js.undefined)
      
      inline def setWrapper(value: ComponentType[P]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait RenderHookResult[P, R] extends StObject {
    
    def rerender(): Unit = js.native
    def rerender(newProps: P): Unit = js.native
    
    val result: HookResult[R] = js.native
    
    def unmount(): Boolean = js.native
    
    /** @deprecated use waitFor instead */
    def wait(callback: js.Function0[Boolean | Unit]): js.Promise[Unit] = js.native
    def wait(callback: js.Function0[Boolean | Unit], options: PickWaitOptionstimeoutsup): js.Promise[Unit] = js.native
    
    def waitFor(callback: js.Function0[Boolean | Unit]): js.Promise[Unit] = js.native
    def waitFor(callback: js.Function0[Boolean | Unit], options: WaitOptions): js.Promise[Unit] = js.native
    
    def waitForNextUpdate(): js.Promise[Unit] = js.native
    def waitForNextUpdate(options: PickWaitOptionstimeout): js.Promise[Unit] = js.native
    
    def waitForValueToChange(selector: js.Function0[js.Any]): js.Promise[Unit] = js.native
    def waitForValueToChange(selector: js.Function0[js.Any], options: WaitOptions): js.Promise[Unit] = js.native
  }
  
  trait WaitOptions extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var suppressErrors: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object WaitOptions {
    
    inline def apply(): WaitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitOptions]
    }
    
    extension [Self <: WaitOptions](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
