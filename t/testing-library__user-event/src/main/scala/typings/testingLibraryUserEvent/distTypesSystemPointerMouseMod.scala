package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.anon.Enter
import typings.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
import typings.testingLibraryUserEvent.distTypesSystemPointerPointerMod.Pointer
import typings.testingLibraryUserEvent.distTypesSystemPointerSharedMod.PointerPosition
import typings.testingLibraryUserEvent.distTypesSystemPointerSharedMod.pointerKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemPointerMouseMod {
  
  @JSImport("@testing-library/user-event/dist/types/system/pointer/mouse", "Mouse")
  @js.native
  open class Mouse () extends StObject {
    
    /* private */ var buttonDownTarget: Any = js.native
    
    /* private */ val buttons: Any = js.native
    
    /* private */ val clickCount: Any = js.native
    
    def down(instance: Instance, keyDef: pointerKey, pointer: Pointer): Unit = js.native
    
    /* private */ var endSelecting: Any = js.native
    
    /* private */ var getEventInit: Any = js.native
    
    /* private */ var getTarget: Any = js.native
    
    /* private */ var modifySelecting: Any = js.native
    
    def move(instance: Instance, position: PointerPosition): js.UndefOr[Enter] = js.native
    
    var position: PointerPosition = js.native
    
    def resetClickCount(): Unit = js.native
    
    /* private */ var selecting: Any = js.native
    
    /* private */ var startSelecting: Any = js.native
    
    def up(instance: Instance, keyDef: pointerKey, pointer: Pointer): Unit = js.native
  }
}
