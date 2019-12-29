package typings.winrt.Windows.System

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VirtualKeyModifiers extends js.Object

@JSGlobal("Windows.System.VirtualKeyModifiers")
@js.native
object VirtualKeyModifiers extends js.Object {
  @js.native
  sealed trait control extends VirtualKeyModifiers
  
  @js.native
  sealed trait menu extends VirtualKeyModifiers
  
  @js.native
  sealed trait none extends VirtualKeyModifiers
  
  @js.native
  sealed trait shift extends VirtualKeyModifiers
  
  @js.native
  sealed trait windows extends VirtualKeyModifiers
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VirtualKeyModifiers with Double] = js.native
  /* 1 */ @js.native
  object control extends TopLevel[control with Double]
  
  /* 2 */ @js.native
  object menu extends TopLevel[menu with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object shift extends TopLevel[shift with Double]
  
  /* 4 */ @js.native
  object windows extends TopLevel[windows with Double]
  
}

