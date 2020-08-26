package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.rename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameFile extends ResourceOperation {
  /**
    * A rename
    */
  @JSName("kind")
  var kind_RenameFile: rename = js.native
  /**
    * The new location.
    */
  var newUri: DocumentUri = js.native
  /**
    * The old (existing) location.
    */
  var oldUri: DocumentUri = js.native
  /**
    * Rename options.
    */
  var options: js.UndefOr[RenameFileOptions] = js.native
}

@JSImport("vscode-languageserver-types", "RenameFile")
@js.native
object RenameFile extends js.Object {
  def create(oldUri: DocumentUri, newUri: DocumentUri): RenameFile = js.native
  def create(oldUri: DocumentUri, newUri: DocumentUri, options: RenameFileOptions): RenameFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = js.native
}

