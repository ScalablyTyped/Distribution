package typings.three.srcConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MOUSE extends js.Object

@JSImport("three/src/constants", "MOUSE")
@js.native
object MOUSE extends js.Object {
  @js.native
  sealed trait LEFT extends MOUSE
  
  @js.native
  sealed trait MIDDLE extends MOUSE
  
  @js.native
  sealed trait RIGHT extends MOUSE
  
  /* 0 */ val LEFT: typings.three.srcConstantsMod.MOUSE.LEFT with Double = js.native
  /* 1 */ val MIDDLE: typings.three.srcConstantsMod.MOUSE.MIDDLE with Double = js.native
  /* 2 */ val RIGHT: typings.three.srcConstantsMod.MOUSE.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MOUSE with Double] = js.native
}

