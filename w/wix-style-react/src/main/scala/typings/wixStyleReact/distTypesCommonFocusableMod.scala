package typings.wixStyleReact

import typings.react.mod.ComponentType
import typings.wixStyleReact.distTypesCommonFocusableFocusableMod.FocusableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonFocusableMod {
  
  @JSImport("wix-style-react/dist/types/common/Focusable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withFocusable[T](Component: ComponentType[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withFocusable")(Component.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def withFocusable[T](Component: ComponentType[T], options: FocusableOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withFocusable")(Component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}
