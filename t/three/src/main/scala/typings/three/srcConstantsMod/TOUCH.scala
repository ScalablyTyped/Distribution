package typings.three.srcConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TOUCH extends js.Object

@JSImport("three/src/constants", "TOUCH")
@js.native
object TOUCH extends js.Object {
  @js.native
  sealed trait DOLLY_PAN extends TOUCH
  
  @js.native
  sealed trait DOLLY_ROTATE extends TOUCH
  
  @js.native
  sealed trait PAN extends TOUCH
  
  @js.native
  sealed trait ROTATE extends TOUCH
  
  /* 2 */ val DOLLY_PAN: typings.three.srcConstantsMod.TOUCH.DOLLY_PAN with Double = js.native
  /* 3 */ val DOLLY_ROTATE: typings.three.srcConstantsMod.TOUCH.DOLLY_ROTATE with Double = js.native
  /* 1 */ val PAN: typings.three.srcConstantsMod.TOUCH.PAN with Double = js.native
  /* 0 */ val ROTATE: typings.three.srcConstantsMod.TOUCH.ROTATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TOUCH with Double] = js.native
}

