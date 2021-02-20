package typings.typedoc

import typings.typedoc.defaultThemeMod.DefaultTheme
import typings.typedoc.navigationItemMod.NavigationItem
import typings.typedoc.reflectionsMod.DeclarationReflection
import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minimalThemeMod {
  
  @JSImport("typedoc/dist/lib/output/themes/MinimalTheme", "MinimalTheme")
  @js.native
  class MinimalTheme protected () extends DefaultTheme {
    def this(renderer: Renderer, basePath: String) = this()
    
    var onRendererBeginPage: js.Any = js.native
  }
  /* static members */
  object MinimalTheme {
    
    @JSImport("typedoc/dist/lib/output/themes/MinimalTheme", "MinimalTheme.buildToc")
    @js.native
    def buildToc(model: DeclarationReflection, parent: NavigationItem): Unit = js.native
  }
}
