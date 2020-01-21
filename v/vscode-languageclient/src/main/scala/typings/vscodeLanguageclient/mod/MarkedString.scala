package typings.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "MarkedString")
@js.native
object MarkedString extends js.Object {
  /**
    * Creates a marked string from plain text.
    *
    * @param plainText The plain text.
    */
  def fromPlainText(plainText: String): String = js.native
  /**
    * Checks whether the given value conforms to the [MarkedString](#MarkedString) type.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkedString */ Boolean = js.native
}

