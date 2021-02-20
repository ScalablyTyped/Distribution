package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutliningSpanKind extends StObject
@JSImport("typescript", "OutliningSpanKind")
@js.native
object OutliningSpanKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[OutliningSpanKind with java.lang.String] = js.native
  
  /** Declarations and expressions */
  @js.native
  sealed trait Code extends OutliningSpanKind
  /* "code" */ val Code: typings.typescript.mod.OutliningSpanKind.Code with java.lang.String = js.native
  
  /** Single or multi-line comments */
  @js.native
  sealed trait Comment extends OutliningSpanKind
  /* "comment" */ val Comment: typings.typescript.mod.OutliningSpanKind.Comment with java.lang.String = js.native
  
  /** Contiguous blocks of import declarations */
  @js.native
  sealed trait Imports extends OutliningSpanKind
  /* "imports" */ val Imports: typings.typescript.mod.OutliningSpanKind.Imports with java.lang.String = js.native
  
  /** Sections marked by '// #region' and '// #endregion' comments */
  @js.native
  sealed trait Region extends OutliningSpanKind
  /* "region" */ val Region: typings.typescript.mod.OutliningSpanKind.Region with java.lang.String = js.native
}
