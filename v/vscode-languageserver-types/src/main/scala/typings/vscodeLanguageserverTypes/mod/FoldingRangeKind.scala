package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FoldingRangeKind extends StObject
@JSImport("vscode-languageserver-types", "FoldingRangeKind")
@js.native
object FoldingRangeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FoldingRangeKind with String] = js.native
  
  /**
    * Folding range for a comment
    */
  @js.native
  sealed trait Comment extends FoldingRangeKind
  /* "comment" */ val Comment: typings.vscodeLanguageserverTypes.mod.FoldingRangeKind.Comment with String = js.native
  
  /**
    * Folding range for a imports or includes
    */
  @js.native
  sealed trait Imports extends FoldingRangeKind
  /* "imports" */ val Imports: typings.vscodeLanguageserverTypes.mod.FoldingRangeKind.Imports with String = js.native
  
  /**
    * Folding range for a region (e.g. `#region`)
    */
  @js.native
  sealed trait Region extends FoldingRangeKind
  /* "region" */ val Region: typings.vscodeLanguageserverTypes.mod.FoldingRangeKind.Region with String = js.native
}
