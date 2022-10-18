package typings.testingLibraryReactHooks

import typings.testingLibraryReactHooks.libTypesMod.RenderHookResult
import typings.testingLibraryReactHooks.libTypesMod.Renderer
import typings.testingLibraryReactHooks.libTypesReactMod.RenderHookOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPureMod {
  
  @JSImport("@testing-library/react-hooks/lib/pure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(act, cleanup, addCleanup, removeCleanup, suppressErrorOutput) */ inline def renderHook[TProps, TResult](callback: js.Function1[/* props */ TProps, TResult]): RenderHookResult[TProps, TResult, Renderer[TProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderHook")(callback.asInstanceOf[js.Any]).asInstanceOf[RenderHookResult[TProps, TResult, Renderer[TProps]]]
  inline def renderHook[TProps, TResult](callback: js.Function1[/* props */ TProps, TResult], options: RenderHookOptions[TProps]): RenderHookResult[TProps, TResult, Renderer[TProps]] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHook")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenderHookResult[TProps, TResult, Renderer[TProps]]]
}
