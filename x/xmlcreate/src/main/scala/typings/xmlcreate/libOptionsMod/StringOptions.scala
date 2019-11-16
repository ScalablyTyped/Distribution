package typings.xmlcreate.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/options", "StringOptions")
@js.native
class StringOptions () extends IStringOptions {
  def this(stringOptions: IStringOptions) = this()
  @JSName("doubleQuotes")
  var doubleQuotes_StringOptions: Boolean = js.native
  @JSName("indent")
  var indent_StringOptions: String = js.native
  @JSName("newline")
  var newline_StringOptions: String = js.native
  @JSName("pretty")
  var pretty_StringOptions: Boolean = js.native
}

