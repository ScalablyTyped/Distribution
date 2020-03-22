package typings.typedoc.optionsOptionsMod

import typings.typedoc.loggersMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsReader extends js.Object {
  var name: String
  var priority: Double
  def read(container: Options, logger: Logger): Unit
}

object OptionsReader {
  @scala.inline
  def apply(name: String, priority: Double, read: (Options, Logger) => Unit): OptionsReader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], read = js.Any.fromFunction2(read))
  
    __obj.asInstanceOf[OptionsReader]
  }
}

