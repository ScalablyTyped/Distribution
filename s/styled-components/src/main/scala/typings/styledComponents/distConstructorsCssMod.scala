package typings.styledComponents

import typings.std.TemplateStringsArray
import typings.styledComponents.anon.IsCss
import typings.styledComponents.primitivesDistTypesMod.Interpolation
import typings.styledComponents.primitivesDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConstructorsCssMod {
  
  @JSImport("styled-components/primitives/dist/constructors/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): TemplateStringsArray | (Interpolation[Props] & IsCss) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateStringsArray | (Interpolation[Props] & IsCss)]
}
