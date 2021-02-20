package typings.testingLibraryReactHooks

import typings.react.mod.ComponentType
import typings.reactTestRenderer.mod.DebugPromiseLike
import typings.std.Error
import typings.testingLibraryReactHooks.anon.PickWaitOptionstimeout
import typings.testingLibraryReactHooks.anon.PickWaitOptionstimeoutsup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@testing-library/react-hooks", "act")
  @js.native
  def act(callback: js.Function0[js.UndefOr[Unit]]): DebugPromiseLike = js.native
  @JSImport("@testing-library/react-hooks", "act")
  @js.native
  def act_Promise(callback: js.Function0[js.Promise[js.UndefOr[Unit]]]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  
  @JSImport("@testing-library/react-hooks", "cleanup")
  @js.native
  def cleanup(): js.Promise[Unit] = js.native
  
  @JSImport("@testing-library/react-hooks", "renderHook")
  @js.native
  def renderHook[P, R](callback: js.Function1[/* props */ P, R]): RenderHookResult[P, R] = js.native
  @JSImport("@testing-library/react-hooks", "renderHook")
  @js.native
  def renderHook[P, R](callback: js.Function1[/* props */ P, R], options: RenderHookOptions[P]): RenderHookResult[P, R] = js.native
  
  @js.native
  trait HookResult[R] extends StObject {
    
    val current: R = js.native
    
    val error: Error = js.native
  }
  object HookResult {
    
    @scala.inline
    def apply[R](current: R, error: Error): HookResult[R] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookResult[R]]
    }
    
    @scala.inline
    implicit class HookResultMutableBuilder[Self <: HookResult[_], R] (val x: Self with HookResult[R]) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: R): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenderHookOptions[P] extends StObject {
    
    var initialProps: js.UndefOr[P] = js.native
    
    var wrapper: js.UndefOr[ComponentType[P]] = js.native
  }
  object RenderHookOptions {
    
    @scala.inline
    def apply[P](): RenderHookOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderHookOptions[P]]
    }
    
    @scala.inline
    implicit class RenderHookOptionsMutableBuilder[Self <: RenderHookOptions[_], P] (val x: Self with RenderHookOptions[P]) extends AnyVal {
      
      @scala.inline
      def setInitialProps(value: P): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPropsUndefined: Self = StObject.set(x, "initialProps", js.undefined)
      
      @scala.inline
      def setWrapper(value: ComponentType[P]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
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
    
    def waitForValueToChange(selector: js.Function0[_]): js.Promise[Unit] = js.native
    def waitForValueToChange(selector: js.Function0[_], options: WaitOptions): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait WaitOptions extends StObject {
    
    var interval: js.UndefOr[Double] = js.native
    
    var suppressErrors: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object WaitOptions {
    
    @scala.inline
    def apply(): WaitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitOptions]
    }
    
    @scala.inline
    implicit class WaitOptionsMutableBuilder[Self <: WaitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
