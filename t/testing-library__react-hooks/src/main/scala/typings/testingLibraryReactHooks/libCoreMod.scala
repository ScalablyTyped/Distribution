package typings.testingLibraryReactHooks

import typings.std.Omit
import typings.testingLibraryReactHooks.anon.Rerender
import typings.testingLibraryReactHooks.libTypesMod.CleanupCallback
import typings.testingLibraryReactHooks.libTypesMod.CreateRenderer
import typings.testingLibraryReactHooks.libTypesMod.RenderHookOptions
import typings.testingLibraryReactHooks.libTypesMod.Renderer
import typings.testingLibraryReactHooks.testingLibraryReactHooksStrings.act
import typings.testingLibraryReactHooks.testingLibraryReactHooksStrings.render
import typings.testingLibraryReactHooks.testingLibraryReactHooksStrings.rerender
import typings.testingLibraryReactHooks.testingLibraryReactHooksStrings.unmount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMod {
  
  @JSImport("@testing-library/react-hooks/lib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCleanup(callback: CleanupCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addCleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def cleanup(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[js.Promise[Unit]]
  
  inline def createRenderHook[TProps, TResult, TRendererOptions /* <: js.Object */, TRenderer /* <: Renderer[TProps] */](createRenderer: CreateRenderer[TProps, TResult, TRendererOptions, TRenderer]): js.Function2[
    /* callback */ js.Function1[/* props */ TProps, TResult], 
    /* options */ js.UndefOr[RenderHookOptions[TProps] & TRendererOptions], 
    (Rerender[TResult, TProps]) & (Omit[TRenderer, render | act | rerender | unmount])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderHook")(createRenderer.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* callback */ js.Function1[/* props */ TProps, TResult], 
    /* options */ js.UndefOr[RenderHookOptions[TProps] & TRendererOptions], 
    (Rerender[TResult, TProps]) & (Omit[TRenderer, render | act | rerender | unmount])
  ]]
  
  inline def removeCleanup(callback: CleanupCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def suppressErrorOutput(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrorOutput")().asInstanceOf[js.Function0[Unit]]
}
