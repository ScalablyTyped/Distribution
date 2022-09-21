package typings.styledComponents

import typings.react.mod.NamedExoticComponent
import typings.styledComponents.nativeDistTypesMod.ExtensibleObject
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createGlobalStyleMod {
  
  @JSImport("styled-components/native/dist/constructors/createGlobalStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): NamedExoticComponent[ExtensibleObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NamedExoticComponent[ExtensibleObject]]
}
