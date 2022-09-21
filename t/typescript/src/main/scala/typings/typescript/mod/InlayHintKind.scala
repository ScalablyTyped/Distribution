package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlayHintKind extends StObject
@JSImport("typescript", "InlayHintKind")
@js.native
object InlayHintKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[InlayHintKind & java.lang.String] = js.native
  
  @js.native
  sealed trait Enum
    extends StObject
       with InlayHintKind
  /* "Enum" */ val Enum: typings.typescript.mod.InlayHintKind.Enum & java.lang.String = js.native
  
  @js.native
  sealed trait Parameter
    extends StObject
       with InlayHintKind
  /* "Parameter" */ val Parameter: typings.typescript.mod.InlayHintKind.Parameter & java.lang.String = js.native
  
  @js.native
  sealed trait Type
    extends StObject
       with InlayHintKind
  /* "Type" */ val Type: typings.typescript.mod.InlayHintKind.Type & java.lang.String = js.native
}
