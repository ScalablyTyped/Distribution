package typings
package vscodeDashLanguageclientLib.libColorProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/colorProvider", "ColorProviderFeature")
@js.native
class ColorProviderFeature protected ()
  extends vscodeDashLanguageclientLib.libClientMod.TextDocumentFeature[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions
    ] {
  def this(client: vscodeDashLanguageclientLib.libClientMod.BaseLanguageClient) = this()
  var asColor: js.Any = js.native
  var asColorInformations: js.Any = js.native
  var asColorPresentations: js.Any = js.native
}

