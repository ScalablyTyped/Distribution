package typings.typedoc.optionsOptionsMod

import typings.typedoc.utilsEventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/options", "DiscoverEvent")
@js.native
class DiscoverEvent protected () extends Event {
  def this(name: String, mode: OptionsReadMode) = this()
  var data: js.Any = js.native
  var errors: js.Array[String] = js.native
  var inputFiles: js.Array[String] = js.native
  val mode: OptionsReadMode = js.native
  def addError(message: String, args: String*): Unit = js.native
  def addInputFile(fileName: String): Unit = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/utils/options/options", "DiscoverEvent")
@js.native
object DiscoverEvent extends js.Object {
  var DISCOVER: String = js.native
}

