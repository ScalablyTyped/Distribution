package typings.testingLibraryReactHooks

import typings.reactDom.testUtilsMod.VoidOrUndefinedOnly
import typings.reactTestRenderer.mod.DebugPromiseLike
import typings.testingLibraryReactHooks.typesMod.RenderResult
import typings.testingLibraryReactHooks.typesMod.WaitFor
import typings.testingLibraryReactHooks.typesMod.WaitForNextUpdate
import typings.testingLibraryReactHooks.typesMod.WaitForValueToChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Act[TProps] extends StObject {
    
    var act: FnCall = js.native
    
    def render(): Unit = js.native
    def render(props: TProps): Unit = js.native
    
    def rerender(): Unit = js.native
    def rerender(props: TProps): Unit = js.native
    
    def unmount(): Unit = js.native
  }
  
  trait Cancel extends StObject {
    
    def cancel(): Unit
    
    def onTimeout(callback: js.Function0[Unit]): Unit
    
    var timedOut: Boolean
    
    def wrap(promise: js.Promise[Unit]): js.Promise[Unit]
  }
  object Cancel {
    
    inline def apply(
      cancel: () => Unit,
      onTimeout: js.Function0[Unit] => Unit,
      timedOut: Boolean,
      wrap: js.Promise[Unit] => js.Promise[Unit]
    ): Cancel = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), onTimeout = js.Any.fromFunction1(onTimeout), timedOut = timedOut.asInstanceOf[js.Any], wrap = js.Any.fromFunction1(wrap))
      __obj.asInstanceOf[Cancel]
    }
    
    extension [Self <: Cancel](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setOnTimeout(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onTimeout", js.Any.fromFunction1(value))
      
      inline def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
      
      inline def setWrap(value: js.Promise[Unit] => js.Promise[Unit]): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(callback: js.Function0[VoidOrUndefinedOnly]): Unit = js.native
  }
  
  @js.native
  trait FnCallCallback extends StObject {
    
    def apply(callback: js.Function0[typings.reactTestRenderer.mod.VoidOrUndefinedOnly]): DebugPromiseLike = js.native
  }
  
  @js.native
  trait Hydrate[TProps] extends StObject {
    
    var act: FnCall = js.native
    
    def hydrate(): Unit = js.native
    
    def render(): Unit = js.native
    def render(props: TProps): Unit = js.native
    
    def rerender(): Unit = js.native
    def rerender(props: TProps): Unit = js.native
    
    def unmount(): Unit = js.native
  }
  
  @js.native
  trait Render[TProps] extends StObject {
    
    var act: FnCallCallback = js.native
    
    def render(): Unit = js.native
    def render(props: TProps): Unit = js.native
    
    def rerender(): Unit = js.native
    def rerender(props: TProps): Unit = js.native
    
    def unmount(): Unit = js.native
  }
  
  @js.native
  trait Rerender[TResult, TProps] extends StObject {
    
    def rerender(): Unit = js.native
    def rerender(newProps: TProps): Unit = js.native
    
    var result: RenderResult[TResult] = js.native
    
    def unmount(): Unit = js.native
    
    var waitFor: WaitFor = js.native
    
    var waitForNextUpdate: WaitForNextUpdate = js.native
    
    var waitForValueToChange: WaitForValueToChange = js.native
  }
}
