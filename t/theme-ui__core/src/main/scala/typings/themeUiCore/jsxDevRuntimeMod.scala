package typings.themeUiCore

import typings.react.anon.Children
import typings.react.mod.ElementType
import typings.react.mod.ExoticComponent
import typings.themeUiCore.anon.ColumnNumber
import typings.themeUiCore.jsxNamespaceMod.ThemeUIJSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxDevRuntimeMod {
  
  @JSImport("@theme-ui/core/dist/declarations/src/jsx-dev-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/core/dist/declarations/src/jsx-dev-runtime", "Fragment")
  @js.native
  val Fragment: ExoticComponent[Children] = js.native
  
  inline def jsxDEV[P](
    `type`: ElementType[P],
    props: P,
    key: String,
    isStaticChildren: Boolean,
    source: ColumnNumber,
    self: Any
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any], isStaticChildren.asInstanceOf[js.Any], source.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def jsxDEV[P](
    `type`: ElementType[P],
    props: P,
    key: Unit,
    isStaticChildren: Boolean,
    source: ColumnNumber,
    self: Any
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any], isStaticChildren.asInstanceOf[js.Any], source.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Element]
}
