package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreAcceleratorKeyEventType extends js.Object
@JSGlobal("Windows.UI.Core.CoreAcceleratorKeyEventType")
@js.native
object CoreAcceleratorKeyEventType extends js.Object {
  
  @js.native
  sealed trait character extends CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait deadCharacter extends CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait keyDown extends CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait keyUp extends CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemCharacter extends CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemDeadCharacter extends CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemKeyDown extends CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemKeyUp extends CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait unicodeCharacter extends CoreAcceleratorKeyEventType
}
