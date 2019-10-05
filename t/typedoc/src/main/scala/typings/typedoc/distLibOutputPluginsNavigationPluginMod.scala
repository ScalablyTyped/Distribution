package typings.typedoc

import typings.typedoc.distLibOutputComponentsMod.RendererComponent
import typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/NavigationPlugin", JSImport.Namespace)
@js.native
object distLibOutputPluginsNavigationPluginMod extends js.Object {
  @js.native
  class NavigationPlugin () extends RendererComponent {
    var navigation: NavigationItem = js.native
    var onBeginPage: js.Any = js.native
    var onBeginRenderer: js.Any = js.native
  }
  
}

