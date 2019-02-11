package typings
package vscodeDashLanguageclientLib.libSelectionRangeDotProposedMod.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/selectionRange.proposed/vscode", "SelectionRangeKind")
@js.native
class SelectionRangeKind protected () extends js.Object {
  val value: java.lang.String = js.native
  def append(value: java.lang.String): SelectionRangeKind = js.native
}

/* static members */
@JSImport("vscode-languageclient/lib/selectionRange.proposed/vscode", "SelectionRangeKind")
@js.native
object SelectionRangeKind extends js.Object {
  /**
    * The declaration kind, its value is `declaration`, possible extensions can be
    * `declaration.function`, `declaration.class` etc.
    */
  val Declaration: vscodeDashLanguageclientLib.libSelectionRangeDotProposedMod.vscodeMod.SelectionRangeKind = js.native
  /**
    * Empty Kind.
    */
  val Empty: vscodeDashLanguageclientLib.libSelectionRangeDotProposedMod.vscodeMod.SelectionRangeKind = js.native
  /**
    * The statment kind, its value is `statement`, possible extensions can be
    * `statement.if` etc
    */
  val Statement: vscodeDashLanguageclientLib.libSelectionRangeDotProposedMod.vscodeMod.SelectionRangeKind = js.native
}

