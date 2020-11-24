package typings.three.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MOUSE extends js.Object
@JSImport("three/src/constants", "MOUSE")
@js.native
object MOUSE extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MOUSE with Double] = js.native
  
  @js.native
  sealed trait DOLLY extends MOUSE
  /* 4 */ @js.native
  object DOLLY extends TopLevel[DOLLY with Double]
  
  @js.native
  sealed trait LEFT extends MOUSE
  /* 0 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  @js.native
  sealed trait MIDDLE extends MOUSE
  /* 1 */ @js.native
  object MIDDLE extends TopLevel[MIDDLE with Double]
  
  @js.native
  sealed trait PAN extends MOUSE
  /* 5 */ @js.native
  object PAN extends TopLevel[PAN with Double]
  
  @js.native
  sealed trait RIGHT extends MOUSE
  /* 2 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
  @js.native
  sealed trait ROTATE extends MOUSE
  /* 3 */ @js.native
  object ROTATE extends TopLevel[ROTATE with Double]
}
