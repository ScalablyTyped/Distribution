package typings.styledComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.styledComponents.primitivesDistTypesMod.AnyComponent
import typings.styledComponents.primitivesDistTypesMod.ExecutionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesDistHocWithThemeMod {
  
  @JSImport("styled-components/primitives/dist/hoc/withTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: AnyComponent[Any] */](Component: T): (ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & typings.styledComponents.styledComponentsStrings.default & TopLevel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & typings.styledComponents.styledComponentsStrings.default & TopLevel[T]]
}
