package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusBarAlignment extends js.Object
@JSImport("vscode", "StatusBarAlignment")
@js.native
object StatusBarAlignment extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusBarAlignment with Double] = js.native
  
  /**
    * Aligned to the left side.
    */
  @js.native
  sealed trait Left extends StatusBarAlignment
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /**
    * Aligned to the right side.
    */
  @js.native
  sealed trait Right extends StatusBarAlignment
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
}
