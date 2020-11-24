package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FoldingRangeKind extends js.Object
@JSImport("vscode-languageserver-types", "FoldingRangeKind")
@js.native
object FoldingRangeKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FoldingRangeKind with String] = js.native
  
  /**
    * Folding range for a comment
    */
  @js.native
  sealed trait Comment extends FoldingRangeKind
  /* "comment" */ @js.native
  object Comment extends TopLevel[Comment with String]
  
  /**
    * Folding range for a imports or includes
    */
  @js.native
  sealed trait Imports extends FoldingRangeKind
  /* "imports" */ @js.native
  object Imports extends TopLevel[Imports with String]
  
  /**
    * Folding range for a region (e.g. `#region`)
    */
  @js.native
  sealed trait Region extends FoldingRangeKind
  /* "region" */ @js.native
  object Region extends TopLevel[Region with String]
}
