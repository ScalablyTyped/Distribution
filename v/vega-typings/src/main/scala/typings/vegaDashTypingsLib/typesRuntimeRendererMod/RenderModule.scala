package typings
package vegaDashTypingsLib.typesRuntimeRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderModule extends js.Object {
  var handler: Handler
  var headless: js.UndefOr[Renderer] = js.undefined
  var renderer: org.scalablytyped.runtime.Instantiable1[/* loader */ vegaDashTypingsLib.typesRuntimeMod.Loader, Renderer]
}

object RenderModule {
  @scala.inline
  def apply(
    handler: Handler,
    renderer: org.scalablytyped.runtime.Instantiable1[/* loader */ vegaDashTypingsLib.typesRuntimeMod.Loader, Renderer],
    headless: Renderer = null
  ): RenderModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handler")(handler)
    __obj.updateDynamic("renderer")(renderer)
    if (headless != null) __obj.updateDynamic("headless")(headless)
    __obj.asInstanceOf[RenderModule]
  }
}

