package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFile extends ResourceOperation {
  /**
    * A create
    */
  @JSName("kind")
  var kind_CreateFile: create = js.native
  /**
    * Additional options
    */
  var options: js.UndefOr[CreateFileOptions] = js.native
  /**
    * The resource to create.
    */
  var uri: DocumentUri = js.native
}

@JSImport("vscode-languageserver-types", "CreateFile")
@js.native
object CreateFile extends js.Object {
  def create(uri: DocumentUri): CreateFile = js.native
  def create(uri: DocumentUri, options: CreateFileOptions): CreateFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean = js.native
}

