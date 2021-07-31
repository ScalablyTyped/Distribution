package typings.three.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TOUCH extends StObject
@JSImport("three/src/constants", "TOUCH")
@js.native
object TOUCH extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TOUCH & Double] = js.native
  
  @js.native
  sealed trait DOLLY_PAN
    extends StObject
       with TOUCH
  /* 2 */ val DOLLY_PAN: typings.three.constantsMod.TOUCH.DOLLY_PAN & Double = js.native
  
  @js.native
  sealed trait DOLLY_ROTATE
    extends StObject
       with TOUCH
  /* 3 */ val DOLLY_ROTATE: typings.three.constantsMod.TOUCH.DOLLY_ROTATE & Double = js.native
  
  @js.native
  sealed trait PAN
    extends StObject
       with TOUCH
  /* 1 */ val PAN: typings.three.constantsMod.TOUCH.PAN & Double = js.native
  
  @js.native
  sealed trait ROTATE
    extends StObject
       with TOUCH
  /* 0 */ val ROTATE: typings.three.constantsMod.TOUCH.ROTATE & Double = js.native
}
