package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/AssetsPlugin", JSImport.Namespace)
@js.native
object assetsPluginMod extends js.Object {
  @js.native
  class AssetsPlugin () extends AbstractComponent[Renderer] {
    var copyDefaultAssets: Boolean = js.native
    var onRendererBegin: js.Any = js.native
  }
  
}

