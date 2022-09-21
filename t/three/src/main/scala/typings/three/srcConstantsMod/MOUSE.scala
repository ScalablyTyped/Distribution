package typings.three.srcConstantsMod

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
  /* 1 */ val DOLLY: typings.three.srcConstantsMod.MOUSE.DOLLY & Double = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with MOUSE
  /* 0 */ val LEFT: typings.three.srcConstantsMod.MOUSE.LEFT & Double = js.native
  
  @js.native
  sealed trait MIDDLE
    extends StObject
       with MOUSE
  /* 1 */ val MIDDLE: typings.three.srcConstantsMod.MOUSE.MIDDLE & Double = js.native
  
  @js.native
  sealed trait PAN
    extends StObject
       with MOUSE
  /* 2 */ val PAN: typings.three.srcConstantsMod.MOUSE.PAN & Double = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with MOUSE
  /* 2 */ val RIGHT: typings.three.srcConstantsMod.MOUSE.RIGHT & Double = js.native
  
  @js.native
  sealed trait ROTATE
    extends StObject
       with MOUSE
  /* 0 */ val ROTATE: typings.three.srcConstantsMod.MOUSE.ROTATE & Double = js.native
}
