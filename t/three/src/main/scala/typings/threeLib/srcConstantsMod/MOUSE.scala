package typings
package threeLib.srcConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MOUSE extends js.Object

@JSImport("three/src/constants", "MOUSE")
@js.native
object MOUSE extends js.Object {
  @js.native
  sealed trait LEFT
    extends threeLib.srcConstantsMod.MOUSE
  
  @js.native
  sealed trait MIDDLE
    extends threeLib.srcConstantsMod.MOUSE
  
  @js.native
  sealed trait RIGHT
    extends threeLib.srcConstantsMod.MOUSE
  
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 1 */ val MIDDLE: MIDDLE with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[threeLib.srcConstantsMod.MOUSE with scala.Double] = js.native
}

