package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolTag extends StObject
@JSImport("vscode", "SymbolTag")
@js.native
object SymbolTag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolTag with Double] = js.native
  
  /**
    * Render a symbol as obsolete, usually using a strike-out.
    */
  @js.native
  sealed trait Deprecated extends SymbolTag
  /* 1 */ val Deprecated: typings.vscode.mod.SymbolTag.Deprecated with Double = js.native
}
