package typings.typescript.mod

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
  def apply(value: java.lang.String): js.UndefOr[HighlightSpanKind with java.lang.String] = js.native
  /* "definition" */ @js.native
  object definition
    extends TopLevel[definition with java.lang.String]
  
  /* "none" */ @js.native
  object none
    extends TopLevel[none with java.lang.String]
  
  /* "reference" */ @js.native
  object reference
    extends TopLevel[reference with java.lang.String]
  
  /* "writtenReference" */ @js.native
  object writtenReference
    extends TopLevel[writtenReference with java.lang.String]
  
}

