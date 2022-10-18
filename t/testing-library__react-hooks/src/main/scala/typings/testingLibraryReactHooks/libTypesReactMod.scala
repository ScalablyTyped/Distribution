package typings.testingLibraryReactHooks

import typings.react.mod.ComponentType
import typings.testingLibraryReactHooks.libTypesMod.Act
import typings.testingLibraryReactHooks.libTypesMod.CleanupCallback
import typings.testingLibraryReactHooks.libTypesMod.RenderHookResult
import typings.testingLibraryReactHooks.libTypesMod.Renderer
import typings.testingLibraryReactHooks.libTypesMod.ServerRenderHookResult
import typings.testingLibraryReactHooks.libTypesMod.ServerRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReactMod {
  
  @js.native
  trait ReactHooksRenderer extends StObject {
    
    var act: Act = js.native
    
    def addCleanup(callback: CleanupCallback): js.Function0[Unit] = js.native
    
    def cleanup(): js.Promise[Unit] = js.native
    
    def removeCleanup(callback: CleanupCallback): Unit = js.native
    
    def renderHook[TProps, TResult](callback: js.Function1[/* props */ TProps, TResult]): RenderHookResult[TProps, TResult, Renderer[TProps]] = js.native
    def renderHook[TProps, TResult](callback: js.Function1[/* props */ TProps, TResult], options: RenderHookOptions[TProps]): RenderHookResult[TProps, TResult, Renderer[TProps]] = js.native
    
    def suppressErrorOutput(): js.Function0[Unit] = js.native
  }
  
  /* Inlined std.Omit<@testing-library/react-hooks.@testing-library/react-hooks/lib/types/react.ReactHooksRenderer, 'renderHook'> & {renderHook <TProps, TResult>(callback : (props : TProps): TResult, options : @testing-library/react-hooks.@testing-library/react-hooks/lib/types/react.RenderHookOptions<TProps> | undefined): @testing-library/react-hooks.@testing-library/react-hooks/lib/types.ServerRenderHookResult<TProps, TResult, @testing-library/react-hooks.@testing-library/react-hooks/lib/types.ServerRenderer<TProps>>} */
  @js.native
  trait ReactHooksServerRenderer extends StObject {
    
    var act: Act = js.native
    
    var addCleanup: js.Function1[/* callback */ CleanupCallback, js.Function0[Unit]] = js.native
    
    var cleanup: js.Function0[js.Promise[Unit]] = js.native
    
    var removeCleanup: js.Function1[/* callback */ CleanupCallback, Unit] = js.native
    
    def renderHook[TProps, TResult](callback: js.Function1[/* props */ TProps, TResult]): ServerRenderHookResult[TProps, TResult, ServerRenderer[TProps]] = js.native
    def renderHook[TProps, TResult](callback: js.Function1[/* props */ TProps, TResult], options: RenderHookOptions[TProps]): ServerRenderHookResult[TProps, TResult, ServerRenderer[TProps]] = js.native
    
    var suppressErrorOutput: js.Function0[js.Function0[Unit]] = js.native
  }
  
  trait RenderHookOptions[TProps]
    extends StObject
       with typings.testingLibraryReactHooks.libTypesMod.RenderHookOptions[TProps] {
    
    var wrapper: js.UndefOr[WrapperComponent[TProps]] = js.undefined
  }
  object RenderHookOptions {
    
    inline def apply[TProps](): RenderHookOptions[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderHookOptions[TProps]]
    }
    
    extension [Self <: RenderHookOptions[?], TProps](x: Self & RenderHookOptions[TProps]) {
      
      inline def setWrapper(value: WrapperComponent[TProps]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  trait RendererOptions[TProps] extends StObject {
    
    var wrapper: js.UndefOr[WrapperComponent[TProps]] = js.undefined
  }
  object RendererOptions {
    
    inline def apply[TProps](): RendererOptions[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RendererOptions[TProps]]
    }
    
    extension [Self <: RendererOptions[?], TProps](x: Self & RendererOptions[TProps]) {
      
      inline def setWrapper(value: WrapperComponent[TProps]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type WrapperComponent[TProps] = ComponentType[TProps]
}
