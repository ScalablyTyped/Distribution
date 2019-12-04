package typings.typedoc

import typings.typedoc.distLibModelsReflectionsMod.DeclarationReflection
import typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import typings.typedoc.distLibOutputRendererMod.Renderer
import typings.typedoc.distLibOutputThemesDefaultThemeMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/themes/MinimalTheme", JSImport.Namespace)
@js.native
object distLibOutputThemesMinimalThemeMod extends js.Object {
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

