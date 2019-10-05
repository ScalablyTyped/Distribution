package typings.typedoc

import typings.typedoc.distLibApplicationMod.Application
import typings.typedoc.distLibUtilsComponentMod.AbstractComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/plugins", JSImport.Namespace)
@js.native
object distLibUtilsPluginsMod extends js.Object {
  @js.native
  class PluginHost () extends AbstractComponent[Application] {
    var discoverNpmPlugins: js.Any = js.native
    var plugins: js.Array[String] = js.native
    def load(): Boolean = js.native
  }
  
}

