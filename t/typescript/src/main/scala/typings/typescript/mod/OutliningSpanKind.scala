package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutliningSpanKind extends js.Object
@JSImport("typescript", "OutliningSpanKind")
@js.native
object OutliningSpanKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[OutliningSpanKind with java.lang.String] = js.native
  
  /** Declarations and expressions */
  @js.native
  sealed trait Code extends OutliningSpanKind
  /* "code" */ @js.native
  object Code
    extends TopLevel[Code with java.lang.String]
  
  /** Single or multi-line comments */
  @js.native
  sealed trait Comment extends OutliningSpanKind
  /* "comment" */ @js.native
  object Comment
    extends TopLevel[Comment with java.lang.String]
  
  /** Contiguous blocks of import declarations */
  @js.native
  sealed trait Imports extends OutliningSpanKind
  /* "imports" */ @js.native
  object Imports
    extends TopLevel[Imports with java.lang.String]
  
  /** Sections marked by '// #region' and '// #endregion' comments */
  @js.native
  sealed trait Region extends OutliningSpanKind
  /* "region" */ @js.native
  object Region
    extends TopLevel[Region with java.lang.String]
}
