package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlayHintKind extends StObject
@JSImport("vscode", "InlayHintKind")
@js.native
object InlayHintKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InlayHintKind & Double] = js.native
  
  /**
  		 * An inlay hint that is for a parameter.
  		 */
  @js.native
  sealed trait Parameter
    extends StObject
       with InlayHintKind
  /* 2 */ val Parameter: typings.vscode.mod.InlayHintKind.Parameter & Double = js.native
  
  /**
  		 * An inlay hint that for a type annotation.
  		 */
  @js.native
  sealed trait Type
    extends StObject
       with InlayHintKind
  /* 1 */ val Type: typings.vscode.mod.InlayHintKind.Type & Double = js.native
}
