package typings.three.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MOUSE extends StObject
@JSImport("three/src/constants", "MOUSE")
@js.native
object MOUSE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MOUSE & Double] = js.native
  
  @js.native
  sealed trait DOLLY
    extends StObject
       with MOUSE
  /* 4 */ val DOLLY: typings.three.constantsMod.MOUSE.DOLLY & Double = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with MOUSE
  /* 0 */ val LEFT: typings.three.constantsMod.MOUSE.LEFT & Double = js.native
  
  @js.native
  sealed trait MIDDLE
    extends StObject
       with MOUSE
  /* 1 */ val MIDDLE: typings.three.constantsMod.MOUSE.MIDDLE & Double = js.native
  
  @js.native
  sealed trait PAN
    extends StObject
       with MOUSE
  /* 5 */ val PAN: typings.three.constantsMod.MOUSE.PAN & Double = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with MOUSE
  /* 2 */ val RIGHT: typings.three.constantsMod.MOUSE.RIGHT & Double = js.native
  
  @js.native
  sealed trait ROTATE
    extends StObject
       with MOUSE
  /* 3 */ val ROTATE: typings.three.constantsMod.MOUSE.ROTATE & Double = js.native
}
