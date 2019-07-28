package typings.vegaDashEmbed.vegaDashEmbedMod

import typings.vegaDashTypings.typesRuntimeMod.Loader
import typings.vegaDashTypings.typesRuntimeMod.Runtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-embed", "vega")
@js.native
object vegaNs extends js.Object {
  @js.native
  class Bounds ()
    extends typings.vega.vegaMod.Bounds
  
  @js.native
  class CanvasHandler ()
    extends typings.vega.vegaMod.CanvasHandler
  
  @js.native
  class Handler ()
    extends typings.vega.vegaMod.Handler
  
  @js.native
  class Renderer protected ()
    extends typings.vega.vegaMod.Renderer {
    def this(loader: Loader) = this()
  }
  
  @js.native
  class View protected ()
    extends typings.vega.vegaMod.View {
    def this(runtime: Runtime) = this()
  }
  
}

