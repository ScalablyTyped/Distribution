package typings.testingLibraryReactHooks

import typings.react.mod.global.JSX.Element
import typings.testingLibraryReactHooks.reactMod.WrapperComponent
import typings.testingLibraryReactHooks.typesMod.RendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTestHarnessMod {
  
  @JSImport("@testing-library/react-hooks/lib/helpers/createTestHarness", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTestHarness[TProps, TResult](hasCallbackSetValueSetError: RendererProps[TProps, TResult]): js.Function1[/* props */ js.UndefOr[TProps], Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestHarness")(hasCallbackSetValueSetError.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.UndefOr[TProps], Element]]
  inline def createTestHarness[TProps, TResult](hasCallbackSetValueSetError: RendererProps[TProps, TResult], Wrapper: Unit, suspense: Boolean): js.Function1[/* props */ js.UndefOr[TProps], Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestHarness")(hasCallbackSetValueSetError.asInstanceOf[js.Any], Wrapper.asInstanceOf[js.Any], suspense.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ js.UndefOr[TProps], Element]]
  inline def createTestHarness[TProps, TResult](hasCallbackSetValueSetError: RendererProps[TProps, TResult], Wrapper: WrapperComponent[TProps]): js.Function1[/* props */ js.UndefOr[TProps], Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestHarness")(hasCallbackSetValueSetError.asInstanceOf[js.Any], Wrapper.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ js.UndefOr[TProps], Element]]
  inline def createTestHarness[TProps, TResult](
    hasCallbackSetValueSetError: RendererProps[TProps, TResult],
    Wrapper: WrapperComponent[TProps],
    suspense: Boolean
  ): js.Function1[/* props */ js.UndefOr[TProps], Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestHarness")(hasCallbackSetValueSetError.asInstanceOf[js.Any], Wrapper.asInstanceOf[js.Any], suspense.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ js.UndefOr[TProps], Element]]
}
