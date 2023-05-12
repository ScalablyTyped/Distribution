package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusBarAlignment extends StObject
@JSImport("vscode", "StatusBarAlignment")
@js.native
object StatusBarAlignment extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusBarAlignment & Double] = js.native
  
  /**
  		 * Aligned to the left side.
  		 */
  @js.native
  sealed trait Left
    extends StObject
       with StatusBarAlignment
  /* 1 */ val Left: typings.vscode.mod.StatusBarAlignment.Left & Double = js.native
  
  /**
  		 * Aligned to the right side.
  		 */
  @js.native
  sealed trait Right
    extends StObject
       with StatusBarAlignment
  /* 2 */ val Right: typings.vscode.mod.StatusBarAlignment.Right & Double = js.native
}
