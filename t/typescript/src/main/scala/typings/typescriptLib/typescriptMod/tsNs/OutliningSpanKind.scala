package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutliningSpanKind extends js.Object

@JSImport("typescript/ts", "OutliningSpanKind")
@js.native
object OutliningSpanKind extends js.Object {
  /** Declarations and expressions */
  @js.native
  sealed trait Code
    extends typescriptLib.typescriptMod.tsNs.OutliningSpanKind
  
  /** Single or multi-line comments */
  @js.native
  sealed trait Comment
    extends typescriptLib.typescriptMod.tsNs.OutliningSpanKind
  
  /** Contiguous blocks of import declarations */
  @js.native
  sealed trait Imports
    extends typescriptLib.typescriptMod.tsNs.OutliningSpanKind
  
  /** Sections marked by '// #region' and '// #endregion' comments */
  @js.native
  sealed trait Region
    extends typescriptLib.typescriptMod.tsNs.OutliningSpanKind
  
}

