package typings.three.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TOUCH extends js.Object
@JSImport("three/src/constants", "TOUCH")
@js.native
object TOUCH extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TOUCH with Double] = js.native
  
  @js.native
  sealed trait DOLLY_PAN extends TOUCH
  /* 2 */ @js.native
  object DOLLY_PAN extends TopLevel[DOLLY_PAN with Double]
  
  @js.native
  sealed trait DOLLY_ROTATE extends TOUCH
  /* 3 */ @js.native
  object DOLLY_ROTATE extends TopLevel[DOLLY_ROTATE with Double]
  
  @js.native
  sealed trait PAN extends TOUCH
  /* 1 */ @js.native
  object PAN extends TopLevel[PAN with Double]
  
  @js.native
  sealed trait ROTATE extends TOUCH
  /* 0 */ @js.native
  object ROTATE extends TopLevel[ROTATE with Double]
}
