package typings
package typedocLib.distLibUtilsOptionsReadersTypedocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/readers/typedoc", "TypedocReader")
@js.native
class TypedocReader ()
  extends typedocLib.distLibUtilsOptionsOptionsMod.OptionsComponent {
  var options: java.lang.String = js.native
  def findTypedocFile(): js.UndefOr[java.lang.String] = js.native
  def findTypedocFile(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def load(event: typedocLib.distLibUtilsOptionsOptionsMod.DiscoverEvent, optionFile: java.lang.String): scala.Unit = js.native
  def onDiscover(event: typedocLib.distLibUtilsOptionsOptionsMod.DiscoverEvent): scala.Unit = js.native
}

@JSImport("typedoc/dist/lib/utils/options/readers/typedoc", "TypedocReader")
@js.native
object TypedocReader extends js.Object {
  var OPTIONS_KEY: js.Any = js.native
}

