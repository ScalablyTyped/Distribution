package typings
package vscodeDashLanguageclientLib.libSelectionRangeDotProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/selectionRange.proposed", "SelectionRangeFeature")
@js.native
class SelectionRangeFeature protected ()
  extends vscodeDashLanguageclientLib.libClientMod.TextDocumentFeature[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions
    ] {
  def this(client: vscodeDashLanguageclientLib.libClientMod.BaseLanguageClient) = this()
  var asSelectionRangeKind: js.Any = js.native
  var asSelectionRanges: js.Any = js.native
}

