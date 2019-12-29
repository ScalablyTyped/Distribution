package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HighlightSpanKind extends js.Object

@JSImport("typescript", "HighlightSpanKind")
@js.native
object HighlightSpanKind extends js.Object {
  @js.native
  sealed trait definition extends HighlightSpanKind
  
  @js.native
  sealed trait none extends HighlightSpanKind
  
  @js.native
  sealed trait reference extends HighlightSpanKind
  
  @js.native
  sealed trait writtenReference extends HighlightSpanKind
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HighlightSpanKind with String] = js.native
  /* "definition" */ @js.native
  object definition extends TopLevel[definition with String]
  
  /* "none" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "reference" */ @js.native
  object reference extends TopLevel[reference with String]
  
  /* "writtenReference" */ @js.native
  object writtenReference extends TopLevel[writtenReference with String]
  
}

