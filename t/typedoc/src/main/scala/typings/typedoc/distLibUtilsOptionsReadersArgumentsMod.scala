package typings.typedoc

import typings.typedoc.distLibUtilsComponentMod.AbstractComponent
import typings.typedoc.distLibUtilsOptionsOptionsMod.DiscoverEvent
import typings.typedoc.distLibUtilsOptionsOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/readers/arguments", JSImport.Namespace)
@js.native
object distLibUtilsOptionsReadersArgumentsMod extends js.Object {
  @js.native
  class ArgumentsReader () extends AbstractComponent[Options] {
    var parseArguments: js.Any = js.native
    var parseResponseFile: js.Any = js.native
    def onDiscover(event: DiscoverEvent): Unit = js.native
  }
  
}

