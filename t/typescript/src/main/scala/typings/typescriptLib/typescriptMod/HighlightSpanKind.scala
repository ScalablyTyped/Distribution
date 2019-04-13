package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HighlightSpanKind extends js.Object

@JSImport("typescript", "HighlightSpanKind")
@js.native
object HighlightSpanKind extends js.Object {
  @js.native
  sealed trait definition
    extends typescriptLib.typescriptMod.HighlightSpanKind
  
  @js.native
  sealed trait none
    extends typescriptLib.typescriptMod.HighlightSpanKind
  
  @js.native
  sealed trait reference
    extends typescriptLib.typescriptMod.HighlightSpanKind
  
  @js.native
  sealed trait writtenReference
    extends typescriptLib.typescriptMod.HighlightSpanKind
  
  /* "definition" */ val definition: definition with java.lang.String = js.native
  /* "none" */ val none: none with java.lang.String = js.native
  /* "reference" */ val reference: reference with java.lang.String = js.native
  /* "writtenReference" */ val writtenReference: writtenReference with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[typescriptLib.typescriptMod.HighlightSpanKind with java.lang.String] = js.native
}

