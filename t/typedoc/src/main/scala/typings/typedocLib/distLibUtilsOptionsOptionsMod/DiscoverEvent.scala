package typings
package typedocLib.distLibUtilsOptionsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/options", "DiscoverEvent")
@js.native
class DiscoverEvent protected ()
  extends typedocLib.distLibUtilsEventsMod.Event {
  def this(name: java.lang.String, mode: OptionsReadMode) = this()
  var data: js.Any = js.native
  var errors: js.Array[java.lang.String] = js.native
  var inputFiles: js.Array[java.lang.String] = js.native
  val mode: OptionsReadMode = js.native
  def addError(message: java.lang.String, args: java.lang.String*): scala.Unit = js.native
  def addInputFile(fileName: java.lang.String): scala.Unit = js.native
}

@JSImport("typedoc/dist/lib/utils/options/options", "DiscoverEvent")
@js.native
object DiscoverEvent extends js.Object {
  var DISCOVER: java.lang.String = js.native
}

