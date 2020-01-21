package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIKind extends js.Object

@JSImport("vscode", "UIKind")
@js.native
object UIKind extends js.Object {
  /**
  		 * Extensions are accessed from a desktop application.
  		 */
  @js.native
  sealed trait Desktop extends UIKind
  
  /**
  		 * Extensions are accessed from a web browser.
  		 */
  @js.native
  sealed trait Web extends UIKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIKind with Double] = js.native
  /* 1 */ @js.native
  object Desktop extends TopLevel[Desktop with Double]
  
  /* 2 */ @js.native
  object Web extends TopLevel[Web with Double]
  
}

