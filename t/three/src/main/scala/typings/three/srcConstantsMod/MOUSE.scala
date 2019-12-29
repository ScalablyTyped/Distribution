package typings.three.srcConstantsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MOUSE with Double] = js.native
  /* 4 */ @js.native
  object DOLLY extends TopLevel[DOLLY with Double]
  
  /* 0 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  /* 1 */ @js.native
  object MIDDLE extends TopLevel[MIDDLE with Double]
  
  /* 5 */ @js.native
  object PAN extends TopLevel[PAN with Double]
  
  /* 2 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
  /* 3 */ @js.native
  object ROTATE extends TopLevel[ROTATE with Double]
  
}

