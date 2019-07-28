package typings.winrt.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val character: typings.winrt.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType.character with Double = js.native
  /* 1 */ val deadCharacter: typings.winrt.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType.deadCharacter with Double = js.native
  /* 2 */ val keyDown: typings.winrt.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType.keyDown with Double = js.native
  /* 3 */ val keyUp: typings.winrt.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType.keyUp with Double = js.native
  /* 4 */ val systemCharacter: typings.winrt.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType.systemCharacter with Double = js.native
  /* 5 */ val systemDeadCharacter: typings.winrt.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType.systemDeadCharacter with Double = js.native
  /* 6 */ val systemKeyDown: typings.winrt.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType.systemKeyDown with Double = js.native
  /* 7 */ val systemKeyUp: typings.winrt.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType.systemKeyUp with Double = js.native
  /* 8 */ val unicodeCharacter: typings.winrt.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType.unicodeCharacter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreAcceleratorKeyEventType with Double] = js.native
}

