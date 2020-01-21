package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/LayoutPlugin", JSImport.Namespace)
@js.native
object layoutPluginMod extends js.Object {
  @js.native
  class LayoutPlugin () extends AbstractComponent[Renderer] {
    var onRendererEndPage: js.Any = js.native
  }
  
}

