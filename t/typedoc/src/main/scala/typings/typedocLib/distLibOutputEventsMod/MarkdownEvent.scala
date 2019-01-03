package typings
package typedocLib.distLibOutputEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/events", "MarkdownEvent")
@js.native
class MarkdownEvent protected ()
  extends typedocLib.distLibUtilsEventsMod.Event {
  def this(name: java.lang.String, originalText: java.lang.String, parsedText: java.lang.String) = this()
  val originalText: java.lang.String = js.native
  var parsedText: java.lang.String = js.native
}

@JSImport("typedoc/dist/lib/output/events", "MarkdownEvent")
@js.native
object MarkdownEvent extends js.Object {
  var PARSE: java.lang.String = js.native
}

