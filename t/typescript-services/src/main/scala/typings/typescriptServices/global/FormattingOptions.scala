package typings.typescriptServices.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FormattingOptions")
@js.native
class FormattingOptions protected ()
  extends typings.typescriptServices.FormattingOptions {
  def this(useTabs: Boolean, spacesPerTab: Double, indentSpaces: Double, newLineCharacter: String) = this()
}

/* static members */
@JSGlobal("FormattingOptions")
@js.native
object FormattingOptions extends js.Object {
  var defaultOptions: typings.typescriptServices.FormattingOptions = js.native
}

