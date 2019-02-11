package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotSelectionRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionRangeKind extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol.selectionRange", "SelectionRangeKind")
@js.native
object SelectionRangeKind extends js.Object {
  /**
    * The declaration kind, its value is `declaration`, possible extensions can be
    * `declaration.function`, `declaration.class` etc.
    */
  @js.native
  sealed trait Declaration
    extends vscodeDashLanguageserverDashProtocolLib.libProtocolDotSelectionRangeMod.SelectionRangeKind
  
  /**
    * Empty Kind.
    */
  @js.native
  sealed trait Empty
    extends vscodeDashLanguageserverDashProtocolLib.libProtocolDotSelectionRangeMod.SelectionRangeKind
  
  /**
    * The statment kind, its value is `statement`, possible extensions can be
    * `statement.if` etc
    */
  @js.native
  sealed trait Statement
    extends vscodeDashLanguageserverDashProtocolLib.libProtocolDotSelectionRangeMod.SelectionRangeKind
  
  /* "declaration" */ val Declaration: Declaration with java.lang.String = js.native
  /* "" */ val Empty: Empty with java.lang.String = js.native
  /* "statement" */ val Statement: Statement with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.libProtocolDotSelectionRangeMod.SelectionRangeKind with java.lang.String
  ] = js.native
}

