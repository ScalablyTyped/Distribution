package typings.typedoc

import typings.typedoc.defaultThemeMod.DefaultTheme
import typings.typedoc.navigationItemMod.NavigationItem
import typings.typedoc.reflectionsMod.DeclarationReflection
import typings.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/themes/MinimalTheme", JSImport.Namespace)
@js.native
object minimalThemeMod extends js.Object {
  
  @js.native
  class MinimalTheme protected () extends DefaultTheme {
    def this(renderer: Renderer, basePath: String) = this()
    
    var onRendererBeginPage: js.Any = js.native
  }
  /* static members */
  @js.native
  object MinimalTheme extends js.Object {
    
    def buildToc(model: DeclarationReflection, parent: NavigationItem): Unit = js.native
  }
}
