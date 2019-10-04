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
  sealed trait DOLLY extends MOUSE
  
  @js.native
  sealed trait LEFT extends MOUSE
  
  @js.native
  sealed trait MIDDLE extends MOUSE
  
  @js.native
  sealed trait PAN extends MOUSE
  
  @js.native
  sealed trait RIGHT extends MOUSE
  
  @js.native
  sealed trait ROTATE extends MOUSE
  
  /* 4 */ val DOLLY: typings.three.srcConstantsMod.MOUSE.DOLLY with Double = js.native
  /* 0 */ val LEFT: typings.three.srcConstantsMod.MOUSE.LEFT with Double = js.native
  /* 1 */ val MIDDLE: typings.three.srcConstantsMod.MOUSE.MIDDLE with Double = js.native
  /* 5 */ val PAN: typings.three.srcConstantsMod.MOUSE.PAN with Double = js.native
  /* 2 */ val RIGHT: typings.three.srcConstantsMod.MOUSE.RIGHT with Double = js.native
  /* 3 */ val ROTATE: typings.three.srcConstantsMod.MOUSE.ROTATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MOUSE with Double] = js.native
}

