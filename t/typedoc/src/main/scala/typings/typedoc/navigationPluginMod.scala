package typings.typedoc

import typings.typedoc.navigationItemMod.NavigationItem
import typings.typedoc.outputComponentsMod.RendererComponent
import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/NavigationPlugin", "NavigationPlugin")
  @js.native
  class NavigationPlugin protected () extends RendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    var navigation: NavigationItem = js.native
    
    /* private */ var onBeginPage: js.Any = js.native
    
    /* private */ var onBeginRenderer: js.Any = js.native
  }
}
