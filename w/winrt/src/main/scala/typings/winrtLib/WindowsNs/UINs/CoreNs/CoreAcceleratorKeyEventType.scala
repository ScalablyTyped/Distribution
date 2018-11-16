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
  
  val character: character with java.lang.String = js.native
  val deadCharacter: deadCharacter with java.lang.String = js.native
  val keyDown: keyDown with java.lang.String = js.native
  val keyUp: keyUp with java.lang.String = js.native
  val systemCharacter: systemCharacter with java.lang.String = js.native
  val systemDeadCharacter: systemDeadCharacter with java.lang.String = js.native
  val systemKeyDown: systemKeyDown with java.lang.String = js.native
  val systemKeyUp: systemKeyUp with java.lang.String = js.native
  val unicodeCharacter: unicodeCharacter with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreAcceleratorKeyEventType with java.lang.String] = js.native
}

