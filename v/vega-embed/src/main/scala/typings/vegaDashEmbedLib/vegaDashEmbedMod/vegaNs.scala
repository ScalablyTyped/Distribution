package typings
package vegaDashEmbedLib.vegaDashEmbedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-embed", "vega")
@js.native
object vegaNs extends js.Object {
  @js.native
  class Bounds ()
    extends vegaLib.vegaMod.Bounds
  
  @js.native
  class CanvasHandler ()
    extends vegaLib.vegaMod.CanvasHandler
  
  @js.native
  class Handler ()
    extends vegaLib.vegaMod.Handler
  
  @js.native
  class Renderer protected ()
    extends vegaLib.vegaMod.Renderer {
    def this(loader: vegaDashTypingsLib.typesRuntimeMod.Loader) = this()
  }
  
  @js.native
  class View protected ()
    extends vegaLib.vegaMod.View {
    def this(runtime: vegaDashTypingsLib.typesRuntimeMod.Runtime) = this()
  }
  
}

