package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeLens extends js.Object {
  /**
    * The command this code lens represents.
    */
  var command: js.UndefOr[Command] = js.native
  /**
    * An data entry field that is preserved on a code lens item between
    * a [CodeLensRequest](#CodeLensRequest) and a [CodeLensResolveRequest]
    * (#CodeLensResolveRequest)
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The range in which this code lens is valid. Should only span a single line.
    */
  var range: Range = js.native
}

@JSImport("vscode-languageserver-types", "CodeLens")
@js.native
object CodeLens extends js.Object {
  /**
    * Creates a new CodeLens literal.
    */
  def create(range: Range): CodeLens = js.native
  def create(range: Range, data: js.Any): CodeLens = js.native
  /**
    * Checks whether the given literal conforms to the [CodeLens](#CodeLens) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeLens */ Boolean = js.native
}

