package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.optionsOptionsMod.DiscoverEvent
import typings.typedoc.optionsOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/readers/tsconfig", JSImport.Namespace)
@js.native
object tsconfigMod extends js.Object {
  @js.native
  class TSConfigReader () extends AbstractComponent[Options] {
    var options: String = js.native
    def load(event: DiscoverEvent, fileName: String): Unit = js.native
    def onDiscover(event: DiscoverEvent): Unit = js.native
  }
  
  /* static members */
  @js.native
  object TSConfigReader extends js.Object {
    var OPTIONS_KEY: js.Any = js.native
    var PROJECT_KEY: js.Any = js.native
  }
  
}

