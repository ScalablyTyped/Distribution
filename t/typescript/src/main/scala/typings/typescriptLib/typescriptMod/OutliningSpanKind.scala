package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutliningSpanKind extends js.Object

@JSImport("typescript", "OutliningSpanKind")
@js.native
object OutliningSpanKind extends js.Object {
  /** Declarations and expressions */
  @js.native
  sealed trait Code
    extends typescriptLib.typescriptMod.OutliningSpanKind
  
  /** Single or multi-line comments */
  @js.native
  sealed trait Comment
    extends typescriptLib.typescriptMod.OutliningSpanKind
  
  /** Contiguous blocks of import declarations */
  @js.native
  sealed trait Imports
    extends typescriptLib.typescriptMod.OutliningSpanKind
  
  /** Sections marked by '// #region' and '// #endregion' comments */
  @js.native
  sealed trait Region
    extends typescriptLib.typescriptMod.OutliningSpanKind
  
  /* "code" */ val Code: Code with java.lang.String = js.native
  /* "comment" */ val Comment: Comment with java.lang.String = js.native
  /* "imports" */ val Imports: Imports with java.lang.String = js.native
  /* "region" */ val Region: Region with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[typescriptLib.typescriptMod.OutliningSpanKind with java.lang.String] = js.native
}

