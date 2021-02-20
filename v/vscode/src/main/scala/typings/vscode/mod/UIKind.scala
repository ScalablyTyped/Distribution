package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UIKind extends StObject
@JSImport("vscode", "UIKind")
@js.native
object UIKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIKind with Double] = js.native
  
  /**
    * Extensions are accessed from a desktop application.
    */
  @js.native
  sealed trait Desktop extends UIKind
  /* 1 */ val Desktop: typings.vscode.mod.UIKind.Desktop with Double = js.native
  
  /**
    * Extensions are accessed from a web browser.
    */
  @js.native
  sealed trait Web extends UIKind
  /* 2 */ val Web: typings.vscode.mod.UIKind.Web with Double = js.native
}
