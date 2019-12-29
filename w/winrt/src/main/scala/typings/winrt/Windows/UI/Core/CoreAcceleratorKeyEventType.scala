package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreAcceleratorKeyEventType with Double] = js.native
  /* 0 */ @js.native
  object character extends TopLevel[character with Double]
  
  /* 1 */ @js.native
  object deadCharacter extends TopLevel[deadCharacter with Double]
  
  /* 2 */ @js.native
  object keyDown extends TopLevel[keyDown with Double]
  
  /* 3 */ @js.native
  object keyUp extends TopLevel[keyUp with Double]
  
  /* 4 */ @js.native
  object systemCharacter extends TopLevel[systemCharacter with Double]
  
  /* 5 */ @js.native
  object systemDeadCharacter extends TopLevel[systemDeadCharacter with Double]
  
  /* 6 */ @js.native
  object systemKeyDown extends TopLevel[systemKeyDown with Double]
  
  /* 7 */ @js.native
  object systemKeyUp extends TopLevel[systemKeyUp with Double]
  
  /* 8 */ @js.native
  object unicodeCharacter extends TopLevel[unicodeCharacter with Double]
  
}

