package typings
package vscodeDashLanguageclientLib.libTypeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/typeDefinition", "TypeDefinitionFeature")
@js.native
class TypeDefinitionFeature protected ()
  extends vscodeDashLanguageclientLib.libClientMod.TextDocumentFeature[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions
    ] {
  def this(client: vscodeDashLanguageclientLib.libClientMod.BaseLanguageClient) = this()
}

