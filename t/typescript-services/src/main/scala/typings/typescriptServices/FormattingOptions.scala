package typings.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FormattingOptions")
@js.native
class FormattingOptions protected () extends js.Object {
  def this(useTabs: Boolean, spacesPerTab: Double, indentSpaces: Double, newLineCharacter: String) = this()
  var indentSpaces: Double = js.native
  var newLineCharacter: String = js.native
  var spacesPerTab: Double = js.native
  var useTabs: Boolean = js.native
}

/* static members */
@JSGlobal("FormattingOptions")
@js.native
object FormattingOptions extends js.Object {
  var defaultOptions: FormattingOptions = js.native
}

