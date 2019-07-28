package typings.typescript.typescriptMod

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
  sealed trait Code extends OutliningSpanKind
  
  /** Single or multi-line comments */
  @js.native
  sealed trait Comment extends OutliningSpanKind
  
  /** Contiguous blocks of import declarations */
  @js.native
  sealed trait Imports extends OutliningSpanKind
  
  /** Sections marked by '// #region' and '// #endregion' comments */
  @js.native
  sealed trait Region extends OutliningSpanKind
  
  /* "code" */ val Code: typings.typescript.typescriptMod.OutliningSpanKind.Code with String = js.native
  /* "comment" */ val Comment: typings.typescript.typescriptMod.OutliningSpanKind.Comment with String = js.native
  /* "imports" */ val Imports: typings.typescript.typescriptMod.OutliningSpanKind.Imports with String = js.native
  /* "region" */ val Region: typings.typescript.typescriptMod.OutliningSpanKind.Region with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OutliningSpanKind with String] = js.native
}

