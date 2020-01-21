package typings.vegaTypings.rendererMod

import org.scalablytyped.runtime.Instantiable1
import typings.vegaTypings.runtimeMod.Loader_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderModule_ extends js.Object {
  var handler: Handler
  var headless: js.UndefOr[Renderer] = js.undefined
  var renderer: Instantiable1[/* loader */ Loader_, Renderer]
}

object RenderModule_ {
  @scala.inline
  def apply(
    handler: Handler,
    renderer: Instantiable1[/* loader */ Loader_, Renderer],
    headless: Renderer = null
  ): RenderModule_ = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    if (headless != null) __obj.updateDynamic("headless")(headless.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderModule_]
  }
}

