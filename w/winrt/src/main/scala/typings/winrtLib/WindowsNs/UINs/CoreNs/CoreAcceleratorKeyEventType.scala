package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreAcceleratorKeyEventType extends js.Object

@JSGlobal("Windows.UI.Core.CoreAcceleratorKeyEventType")
@js.native
object CoreAcceleratorKeyEventType extends js.Object {
  @js.native
  sealed trait character
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait deadCharacter
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait keyDown
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait keyUp
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemCharacter
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemDeadCharacter
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemKeyDown
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait systemKeyUp
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType
  
  @js.native
  sealed trait unicodeCharacter
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType
  
  /* 0 */ val character: character with scala.Double = js.native
  /* 1 */ val deadCharacter: deadCharacter with scala.Double = js.native
  /* 2 */ val keyDown: keyDown with scala.Double = js.native
  /* 3 */ val keyUp: keyUp with scala.Double = js.native
  /* 4 */ val systemCharacter: systemCharacter with scala.Double = js.native
  /* 5 */ val systemDeadCharacter: systemDeadCharacter with scala.Double = js.native
  /* 6 */ val systemKeyDown: systemKeyDown with scala.Double = js.native
  /* 7 */ val systemKeyUp: systemKeyUp with scala.Double = js.native
  /* 8 */ val unicodeCharacter: unicodeCharacter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType with scala.Double] = js.native
}

