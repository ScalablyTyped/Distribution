package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HighlightSpanKind extends StObject
@JSImport("typescript", "HighlightSpanKind")
@js.native
object HighlightSpanKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[HighlightSpanKind with java.lang.String] = js.native
  
  @js.native
  sealed trait definition extends HighlightSpanKind
  /* "definition" */ val definition: typings.typescript.mod.HighlightSpanKind.definition with java.lang.String = js.native
  
  @js.native
  sealed trait none extends HighlightSpanKind
  /* "none" */ val none: typings.typescript.mod.HighlightSpanKind.none with java.lang.String = js.native
  
  @js.native
  sealed trait reference extends HighlightSpanKind
  /* "reference" */ val reference: typings.typescript.mod.HighlightSpanKind.reference with java.lang.String = js.native
  
  @js.native
  sealed trait writtenReference extends HighlightSpanKind
  /* "writtenReference" */ val writtenReference: typings.typescript.mod.HighlightSpanKind.writtenReference with java.lang.String = js.native
}
