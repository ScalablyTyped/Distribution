package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DocumentLink")
@js.native
class DocumentLink ()
  extends typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.DocumentLink

@JSImport("vscode-languageclient/lib/client", "DocumentLink")
@js.native
object DocumentLink extends js.Object {
  /**
    * Creates a new DocumentLink literal.
    */
  def create(range: Range): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentLink = js.native
  def create(range: Range, target: String): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentLink = js.native
  def create(range: Range, target: String, data: js.Any): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentLink = js.native
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = js.native
}

