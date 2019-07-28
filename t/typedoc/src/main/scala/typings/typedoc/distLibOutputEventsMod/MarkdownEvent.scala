package typings.typedoc.distLibOutputEventsMod

import typings.typedoc.distLibUtilsEventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/events", "MarkdownEvent")
@js.native
class MarkdownEvent protected () extends Event {
  def this(name: String, originalText: String, parsedText: String) = this()
  val originalText: String = js.native
  var parsedText: String = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/output/events", "MarkdownEvent")
@js.native
object MarkdownEvent extends js.Object {
  var PARSE: String = js.native
}

