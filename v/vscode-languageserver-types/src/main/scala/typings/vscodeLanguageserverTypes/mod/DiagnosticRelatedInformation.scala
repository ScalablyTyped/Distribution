package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticRelatedInformation extends js.Object {
  /**
    * The location of this related diagnostic information.
    */
  var location: Location = js.native
  /**
    * The message of this related diagnostic information.
    */
  var message: String = js.native
}

@JSImport("vscode-languageserver-types", "DiagnosticRelatedInformation")
@js.native
object DiagnosticRelatedInformation extends js.Object {
  /**
    * Creates a new DiagnosticRelatedInformation literal.
    */
  def create(location: Location, message: String): DiagnosticRelatedInformation = js.native
  /**
    * Checks whether the given literal conforms to the [DiagnosticRelatedInformation](#DiagnosticRelatedInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DiagnosticRelatedInformation */ Boolean = js.native
}

