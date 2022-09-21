package typings.testingLibraryUserEvent

import typings.std.EventModifierInit
import typings.testingLibraryUserEvent.systemKeyboardMod.KeyboardHost
import typings.testingLibraryUserEvent.systemPointerMod.PointerHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemMod {
  
  @JSImport("@testing-library/user-event/dist/types/system", "System")
  @js.native
  open class System () extends StObject {
    
    def getUIEventModifiers(): EventModifierInit = js.native
    
    val keyboard: KeyboardHost = js.native
    
    val pointer: PointerHost = js.native
  }
}
