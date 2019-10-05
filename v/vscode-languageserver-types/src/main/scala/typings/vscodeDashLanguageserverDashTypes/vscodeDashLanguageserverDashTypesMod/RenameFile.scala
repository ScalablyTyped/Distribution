package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesStrings.rename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameFile extends ResourceOperation {
  /**
    * A rename
    */
  @JSName("kind")
  var kind_RenameFile: rename
  /**
    * The new location.
    */
  var newUri: String
  /**
    * The old (existing) location.
    */
  var oldUri: String
  /**
    * Rename options.
    */
  var options: js.UndefOr[RenameFileOptions] = js.undefined
}

@JSImport("vscode-languageserver-types", "RenameFile")
@js.native
object RenameFile extends js.Object {
  def create(oldUri: String, newUri: String): RenameFile = js.native
  def create(oldUri: String, newUri: String, options: RenameFileOptions): RenameFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.RenameFile */ Boolean = js.native
}

