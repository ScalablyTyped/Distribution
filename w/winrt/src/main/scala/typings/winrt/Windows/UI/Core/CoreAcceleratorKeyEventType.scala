package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreAcceleratorKeyEventType extends StObject
@JSGlobal("Windows.UI.Core.CoreAcceleratorKeyEventType")
@js.native
object CoreAcceleratorKeyEventType extends StObject {
  
  @js.native
  sealed trait character
    extends StObject
       with CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait deadCharacter
    extends StObject
       with CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait keyDown
    extends StObject
       with CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait keyUp
    extends StObject
       with CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemCharacter
    extends StObject
       with CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemDeadCharacter
    extends StObject
       with CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemKeyDown
    extends StObject
       with CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemKeyUp
    extends StObject
       with CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait unicodeCharacter
    extends StObject
       with CoreAcceleratorKeyEventType
}
