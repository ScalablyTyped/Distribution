package typings.typedoc

import typings.typedoc.distLibUtilsOptionsOptionsMod.DiscoverEvent
import typings.typedoc.distLibUtilsOptionsOptionsMod.OptionsComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/readers/arguments", JSImport.Namespace)
@js.native
object distLibUtilsOptionsReadersArgumentsMod extends js.Object {
  @js.native
  class ArgumentsReader () extends OptionsComponent {
    var parseArguments: js.Any = js.native
    var parseResponseFile: js.Any = js.native
    def onDiscover(event: DiscoverEvent): Unit = js.native
  }
  
}

