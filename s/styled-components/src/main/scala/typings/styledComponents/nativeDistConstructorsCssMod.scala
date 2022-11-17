package typings.styledComponents

import typings.std.TemplateStringsArray
import typings.styledComponents.anon.IsCss
import typings.styledComponents.nativeDistTypesMod.IStyledComponent
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.Keyframes
import typings.styledComponents.nativeDistTypesMod.StyleFunction
import typings.styledComponents.nativeDistTypesMod.StyledObject
import typings.styledComponents.nativeDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistConstructorsCssMod {
  
  @JSImport("styled-components/native/dist/constructors/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): js.UndefOr[
    String | Double | false | Keyframes | (IStyledComponent["web", Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.UndefOr[
    String | Double | false | Keyframes | (IStyledComponent["web", Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ]]
}
