package typings.three.srcConstantsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TOUCH with Double] = js.native
  /* 2 */ @js.native
  object DOLLY_PAN extends TopLevel[DOLLY_PAN with Double]
  
  /* 3 */ @js.native
  object DOLLY_ROTATE extends TopLevel[DOLLY_ROTATE with Double]
  
  /* 1 */ @js.native
  object PAN extends TopLevel[PAN with Double]
  
  /* 0 */ @js.native
  object ROTATE extends TopLevel[ROTATE with Double]
  
}

