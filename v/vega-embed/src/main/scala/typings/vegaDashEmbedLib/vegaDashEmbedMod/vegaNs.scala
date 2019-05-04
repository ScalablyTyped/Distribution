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
    extends vegaDashLibLib.vegaDashLibMod.Bounds
  
  @js.native
  class CanvasHandler ()
    extends vegaDashLibLib.vegaDashLibMod.CanvasHandler
  
  @js.native
  class Handler ()
    extends vegaDashLibLib.vegaDashLibMod.Handler
  
  @js.native
  class Renderer protected ()
    extends vegaDashLibLib.vegaDashLibMod.Renderer {
    def this(loader: vegaDashTypingsLib.typesRuntimeMod.Loader) = this()
  }
  
  @js.native
  class View protected ()
    extends vegaDashLibLib.vegaDashLibMod.View {
    def this(runtime: vegaDashTypingsLib.typesRuntimeMod.Runtime) = this()
  }
  
}

