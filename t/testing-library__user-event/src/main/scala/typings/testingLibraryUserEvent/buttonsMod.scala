package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.sharedMod.pointerKey
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`0`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`1`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`2`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`3`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonsMod {
  
  @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", "Buttons")
  @js.native
  open class Buttons () extends StObject {
    
    def down(keyDef: pointerKey): js.UndefOr[Double] = js.native
    
    def getButtons(): Double = js.native
    
    /* private */ val pressed: Any = js.native
    
    def up(keyDef: pointerKey): js.UndefOr[Double] = js.native
  }
  
  object MouseButton {
    
    @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", "MouseButton.X1")
    @js.native
    val X1: `3` = js.native
    
    @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", "MouseButton.X2")
    @js.native
    val X2: `4` = js.native
    
    @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", "MouseButton.auxiliary")
    @js.native
    val auxiliary: `2` = js.native
    
    @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", "MouseButton.back")
    @js.native
    val back: `3` = js.native
    
    @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", "MouseButton.forward")
    @js.native
    val forward: `4` = js.native
    
    @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", "MouseButton.primary")
    @js.native
    val primary: `0` = js.native
    
    @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", "MouseButton.secondary")
    @js.native
    val secondary: `1` = js.native
  }
  /* Rewritten from type alias, can be one of: 
    - typings.testingLibraryUserEvent.testingLibraryUserEventStrings.primary
    - typings.testingLibraryUserEvent.testingLibraryUserEventStrings.secondary
    - typings.testingLibraryUserEvent.testingLibraryUserEventStrings.auxiliary
    - typings.testingLibraryUserEvent.testingLibraryUserEventStrings.back
    - typings.testingLibraryUserEvent.testingLibraryUserEventStrings.X1
    - typings.testingLibraryUserEvent.testingLibraryUserEventStrings.forward
    - typings.testingLibraryUserEvent.testingLibraryUserEventStrings.X2
    - scala.Double
  */
  type MouseButton = _MouseButton | Double
  
  object MouseButtonFlip {
    
    @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", "MouseButtonFlip.1")
    @js.native
    val `1`: typings.testingLibraryUserEvent.testingLibraryUserEventInts.`2` = js.native
    
    @JSImport("@testing-library/user-event/dist/types/system/pointer/buttons", "MouseButtonFlip.2")
    @js.native
    val `2`: typings.testingLibraryUserEvent.testingLibraryUserEventInts.`1` = js.native
  }
  
  inline def getMouseButtonId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMouseButtonId")().asInstanceOf[Double]
  inline def getMouseButtonId(button: MouseButton): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMouseButtonId")(button.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMouseEventButton(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMouseEventButton")().asInstanceOf[Double]
  inline def getMouseEventButton(button: MouseButton): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMouseEventButton")(button.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait _MouseButton extends StObject
}
