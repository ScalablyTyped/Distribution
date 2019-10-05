package typings.typedoc

import typings.typedoc.distLibUtilsOptionsOptionsMod.DiscoverEvent
import typings.typedoc.distLibUtilsOptionsOptionsMod.OptionsComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/readers/typedoc", JSImport.Namespace)
@js.native
object distLibUtilsOptionsReadersTypedocMod extends js.Object {
  @js.native
  class TypedocReader () extends OptionsComponent {
    var options: String = js.native
    def findTypedocFile(path: String): js.UndefOr[String] = js.native
    def load(event: DiscoverEvent, optionFile: String): Unit = js.native
    def onDiscover(event: DiscoverEvent): Unit = js.native
  }
  
  /* static members */
  @js.native
  object TypedocReader extends js.Object {
    var OPTIONS_KEY: js.Any = js.native
  }
  
}

