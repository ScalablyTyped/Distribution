package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "QuickInputButtons")
@js.native
/**
  * @hidden
  */
/* private */ open class QuickInputButtons () extends StObject
/* static members */
object QuickInputButtons {
  
  /**
    * A back button for {@link QuickPick} and {@link InputBox}.
    *
    * When a navigation 'back' button is needed this one should be used for consistency.
    * It comes with a predefined icon, tooltip and location.
    */
  @JSImport("vscode", "QuickInputButtons.Back")
  @js.native
  val Back: QuickInputButton = js.native
}
