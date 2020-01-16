package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesStrings.create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFile extends ResourceOperation {
  /**
    * A create
    */
  @JSName("kind")
  var kind_CreateFile: create
  /**
    * Additional options
    */
  var options: js.UndefOr[CreateFileOptions] = js.undefined
  /**
    * The resource to create.
    */
  var uri: DocumentUri
}

@JSImport("vscode-languageserver-types", "CreateFile")
@js.native
object CreateFile extends js.Object {
  def create(uri: DocumentUri): CreateFile = js.native
  def create(uri: DocumentUri, options: CreateFileOptions): CreateFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean = js.native
}

