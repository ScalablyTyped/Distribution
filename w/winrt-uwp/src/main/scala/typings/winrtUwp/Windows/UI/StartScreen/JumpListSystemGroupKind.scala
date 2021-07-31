package typings.winrtUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JumpListSystemGroupKind extends StObject
/** Indicates the kind of system group used by an app's jump list. */
@JSGlobal("Windows.UI.StartScreen.JumpListSystemGroupKind")
@js.native
object JumpListSystemGroupKind extends StObject {
  
  /** Specifies that the system managed frequent group be used in the jump list. */
  @js.native
  sealed trait frequent
    extends StObject
       with JumpListSystemGroupKind
  
  /** Specifies that no system managed group be used in the jump list. */
  @js.native
  sealed trait none
    extends StObject
       with JumpListSystemGroupKind
  
  /** Specifies that the system managed recent group be used in the jump list. */
  @js.native
  sealed trait recent
    extends StObject
       with JumpListSystemGroupKind
}
