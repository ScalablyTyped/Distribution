package typings.testingLibraryReactHooks

import typings.reactDom.testUtilsMod.VoidOrUndefinedOnly
import typings.std.Omit
import typings.testingLibraryReactHooks.anon.Hydrate
import typings.testingLibraryReactHooks.anon.Rerender
import typings.testingLibraryReactHooks.libTypesMod.CleanupCallback
import typings.testingLibraryReactHooks.libTypesMod.RenderHookOptions
import typings.testingLibraryReactHooks.libTypesReactMod.RendererOptions
import typings.testingLibraryReactHooks.testingLibraryReactHooksStrings.act
import typings.testingLibraryReactHooks.testingLibraryReactHooksStrings.render
import typings.testingLibraryReactHooks.testingLibraryReactHooksStrings.rerender
import typings.testingLibraryReactHooks.testingLibraryReactHooksStrings.unmount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServerPureMod {
  
  @JSImport("@testing-library/react-hooks/lib/server/pure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def act(callback: js.Function0[VoidOrUndefinedOnly]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("act")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def act_T_Promise[T](callback: js.Function0[T | js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("act")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def addCleanup(callback: CleanupCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addCleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def cleanup(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[js.Promise[Unit]]
  
  inline def removeCleanup(callback: CleanupCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderHook[TProps, TResult](callback: js.Function1[/* props */ TProps, TResult]): (Rerender[TResult, TProps]) & (Omit[Hydrate[TProps], render | act | rerender | unmount]) = ^.asInstanceOf[js.Dynamic].applyDynamic("renderHook")(callback.asInstanceOf[js.Any]).asInstanceOf[(Rerender[TResult, TProps]) & (Omit[Hydrate[TProps], render | act | rerender | unmount])]
  inline def renderHook[TProps, TResult](
    callback: js.Function1[/* props */ TProps, TResult],
    options: RenderHookOptions[TProps] & RendererOptions[TProps]
  ): (Rerender[TResult, TProps]) & (Omit[Hydrate[TProps], render | act | rerender | unmount]) = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHook")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(Rerender[TResult, TProps]) & (Omit[Hydrate[TProps], render | act | rerender | unmount])]
  
  inline def suppressErrorOutput(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrorOutput")().asInstanceOf[js.Function0[Unit]]
}
