package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Comment extends FoldingRangeKind
  
  /**
    * Folding range for a imports or includes
    */
  @js.native
  sealed trait Imports extends FoldingRangeKind
  
  /**
    * Folding range for a region (e.g. `#region`)
    */
  @js.native
  sealed trait Region extends FoldingRangeKind
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FoldingRangeKind with String] = js.native
  /* "comment" */ @js.native
  object Comment extends TopLevel[Comment with String]
  
  /* "imports" */ @js.native
  object Imports extends TopLevel[Imports with String]
  
  /* "region" */ @js.native
  object Region extends TopLevel[Region with String]
  
}

