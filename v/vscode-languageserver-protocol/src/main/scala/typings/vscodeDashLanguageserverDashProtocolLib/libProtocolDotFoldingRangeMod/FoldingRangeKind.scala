package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FoldingRangeKind extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol.foldingRange", "FoldingRangeKind")
@js.native
object FoldingRangeKind extends js.Object {
  /**
    * Folding range for a comment
    */
  @js.native
  sealed trait Comment
    extends vscodeDashLanguageserverDashProtocolLib.libProtocolDotFoldingRangeMod.FoldingRangeKind
  
  /**
    * Folding range for a imports or includes
    */
  @js.native
  sealed trait Imports
    extends vscodeDashLanguageserverDashProtocolLib.libProtocolDotFoldingRangeMod.FoldingRangeKind
  
  /**
    * Folding range for a region (e.g. `#region`)
    */
  @js.native
  sealed trait Region
    extends vscodeDashLanguageserverDashProtocolLib.libProtocolDotFoldingRangeMod.FoldingRangeKind
  
  /* "comment" */ val Comment: Comment with java.lang.String = js.native
  /* "imports" */ val Imports: Imports with java.lang.String = js.native
  /* "region" */ val Region: Region with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.libProtocolDotFoldingRangeMod.FoldingRangeKind with java.lang.String
  ] = js.native
}

