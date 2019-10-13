package typings.typedoc

import typings.typedoc.distLibOutputRendererMod.Renderer
import typings.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/LayoutPlugin", JSImport.Namespace)
@js.native
object distLibOutputPluginsLayoutPluginMod extends js.Object {
  @js.native
  class LayoutPlugin () extends AbstractComponent[Renderer] {
    var onRendererEndPage: js.Any = js.native
  }
  
}

