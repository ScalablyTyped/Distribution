package typings.typedoc

import typings.typedoc.distLibOutputRendererMod.Renderer
import typings.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/AssetsPlugin", JSImport.Namespace)
@js.native
object distLibOutputPluginsAssetsPluginMod extends js.Object {
  @js.native
  class AssetsPlugin () extends AbstractComponent[Renderer] {
    var copyDefaultAssets: Boolean = js.native
    var onRendererBegin: js.Any = js.native
  }
  
}

