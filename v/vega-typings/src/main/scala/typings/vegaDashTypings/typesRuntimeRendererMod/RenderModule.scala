package typings.vegaDashTypings.typesRuntimeRendererMod

import org.scalablytyped.runtime.Instantiable1
import typings.vegaDashTypings.typesRuntimeMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderModule extends js.Object {
  var handler: Handler
  var headless: js.UndefOr[Renderer] = js.undefined
  var renderer: Instantiable1[/* loader */ Loader, Renderer]
}

object RenderModule {
  @scala.inline
  def apply(
    handler: Handler,
    renderer: Instantiable1[/* loader */ Loader, Renderer],
    headless: Renderer = null
  ): RenderModule = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    if (headless != null) __obj.updateDynamic("headless")(headless.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderModule]
  }
}

@JSImport("vega-typings/types/runtime/renderer", "renderModule")
@js.native
object renderModule extends js.Object {
  def apply(moduleName: String, renderModule: RenderModule): RenderModule = js.native
}

