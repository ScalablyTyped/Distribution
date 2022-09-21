package typings.themeUiCore

import typings.react.anon.Children
import typings.react.mod.ElementType
import typings.react.mod.ExoticComponent
import typings.themeUiCore.jsxNamespaceMod.ThemeUIJSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxRuntimeMod {
  
  @JSImport("@theme-ui/core/dist/declarations/src/jsx-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/core/dist/declarations/src/jsx-runtime", "Fragment")
  @js.native
  val Fragment: ExoticComponent[Children] = js.native
  
  inline def jsx[P](`type`: ElementType[P], props: P): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def jsx[P](`type`: ElementType[P], props: P, key: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def jsxs[P](`type`: ElementType[P], props: P): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def jsxs[P](`type`: ElementType[P], props: P, key: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Element]
}
