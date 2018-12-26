package typings
package vscodeDashLanguageclientLib.libFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/foldingRange", "FoldingRangeFeature")
@js.native
class FoldingRangeFeature protected ()
  extends vscodeDashLanguageclientLib.libClientMod.TextDocumentFeature[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions
    ] {
  def this(client: vscodeDashLanguageclientLib.libClientMod.BaseLanguageClient) = this()
  var asFoldingRangeKind: js.Any = js.native
  var asFoldingRanges: js.Any = js.native
}

