package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HighlightSpanKind extends js.Object

@JSImport("typescript/ts", "HighlightSpanKind")
@js.native
object HighlightSpanKind extends js.Object {
  @js.native
  sealed trait definition
    extends typescriptLib.typescriptMod.tsNs.HighlightSpanKind
  
  @js.native
  sealed trait none
    extends typescriptLib.typescriptMod.tsNs.HighlightSpanKind
  
  @js.native
  sealed trait reference
    extends typescriptLib.typescriptMod.tsNs.HighlightSpanKind
  
  @js.native
  sealed trait writtenReference
    extends typescriptLib.typescriptMod.tsNs.HighlightSpanKind
  
}

