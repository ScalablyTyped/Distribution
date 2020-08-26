package typings.typedoc.legendPluginMod

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/LegendPlugin", "LegendPlugin")
@js.native
class LegendPlugin () extends AbstractComponent[Renderer] {
  var _project: js.Any = js.native
  var buildLegend: js.Any = js.native
  var onRenderBegin: js.Any = js.native
  var onRendererBeginPage: js.Any = js.native
}

