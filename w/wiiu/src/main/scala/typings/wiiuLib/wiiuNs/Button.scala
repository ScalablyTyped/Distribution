package typings
package wiiuLib.wiiuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

@JSGlobal("wiiu.Button")
@js.native
object Button extends js.Object {
  @js.native
  sealed trait A
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait B
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait DOWN
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait L
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait LEFT
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait L_STICK
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait L_STICK_DOWN
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait L_STICK_LEFT
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait L_STICK_RIGHT
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait L_STICK_UP
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait MINUS
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait PLUS
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait R
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait RIGHT
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait R_STICK
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait R_STICK_DOWN
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait R_STICK_LEFT
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait R_STICK_RIGHT
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait R_STICK_UP
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait SELECT
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait START
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait UP
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait X
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait Y
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait ZL
    extends wiiuLib.wiiuNs.Button
  
  @js.native
  sealed trait ZR
    extends wiiuLib.wiiuNs.Button
  
  /* 0x00008000 */ val A: A with scala.Double = js.native
  /* 0x00004000 */ val B: B with scala.Double = js.native
  /* 0x00000100 */ val DOWN: DOWN with scala.Double = js.native
  /* 0x00000020 */ val L: L with scala.Double = js.native
  /* 0x00000800 */ val LEFT: LEFT with scala.Double = js.native
  /* 0x00040000 */ val L_STICK: L_STICK with scala.Double = js.native
  /* 0x08000000 */ val L_STICK_DOWN: L_STICK_DOWN with scala.Double = js.native
  /* 0x40000000 */ val L_STICK_LEFT: L_STICK_LEFT with scala.Double = js.native
  /* 0x20000000 */ val L_STICK_RIGHT: L_STICK_RIGHT with scala.Double = js.native
  /* 0x10000000 */ val L_STICK_UP: L_STICK_UP with scala.Double = js.native
  /* 0x00000004 */ val MINUS: MINUS with scala.Double = js.native
  /* 0x00000008 */ val PLUS: PLUS with scala.Double = js.native
  /* 0x00000010 */ val R: R with scala.Double = js.native
  /* 0x00000400 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 0x00020000 */ val R_STICK: R_STICK with scala.Double = js.native
  /* 0x00800000 */ val R_STICK_DOWN: R_STICK_DOWN with scala.Double = js.native
  /* 0x04000000 */ val R_STICK_LEFT: R_STICK_LEFT with scala.Double = js.native
  /* 0x02000000 */ val R_STICK_RIGHT: R_STICK_RIGHT with scala.Double = js.native
  /* 0x01000000 */ val R_STICK_UP: R_STICK_UP with scala.Double = js.native
  /* MINUS */ val SELECT: SELECT with scala.Double = js.native
  /* PLUS */ val START: START with scala.Double = js.native
  /* 0x00000200 */ val UP: UP with scala.Double = js.native
  /* 0x00002000 */ val X: X with scala.Double = js.native
  /* 0x00001000 */ val Y: Y with scala.Double = js.native
  /* 0x00000080 */ val ZL: ZL with scala.Double = js.native
  /* 0x00000040 */ val ZR: ZR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wiiuLib.wiiuNs.Button with scala.Double] = js.native
}

