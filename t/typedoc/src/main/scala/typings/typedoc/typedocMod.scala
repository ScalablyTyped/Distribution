package typings.typedoc

import typings.typedoc.loggersMod.Logger
import typings.typedoc.optionsOptionsMod.Options
import typings.typedoc.optionsOptionsMod.OptionsReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/readers/typedoc", JSImport.Namespace)
@js.native
object typedocMod extends js.Object {
  @js.native
  class TypeDocReader () extends OptionsReader {
    var findTypedocFile: js.Any = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var priority: Double = js.native
    var readFile: js.Any = js.native
    /* CompleteClass */
    override def read(container: Options, logger: Logger): Unit = js.native
  }
  
}

