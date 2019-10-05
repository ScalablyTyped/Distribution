package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFile extends ResourceOperation {
  /**
    * A delete
    */
  @JSName("kind")
  var kind_DeleteFile: delete
  /**
    * Delete options.
    */
  var options: js.UndefOr[DeleteFileOptions] = js.undefined
  /**
    * The file to delete.
    */
  var uri: String
}

@JSImport("vscode-languageserver-types", "DeleteFile")
@js.native
object DeleteFile extends js.Object {
  def create(uri: String): DeleteFile = js.native
  def create(uri: String, options: DeleteFileOptions): DeleteFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean = js.native
}

