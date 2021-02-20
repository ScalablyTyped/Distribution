package typings.three.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MOUSE extends StObject
@JSImport("three/src/constants", "MOUSE")
@js.native
object MOUSE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MOUSE with Double] = js.native
  
  @js.native
  sealed trait DOLLY extends MOUSE
  /* 4 */ val DOLLY: typings.three.constantsMod.MOUSE.DOLLY with Double = js.native
  
  @js.native
  sealed trait LEFT extends MOUSE
  /* 0 */ val LEFT: typings.three.constantsMod.MOUSE.LEFT with Double = js.native
  
  @js.native
  sealed trait MIDDLE extends MOUSE
  /* 1 */ val MIDDLE: typings.three.constantsMod.MOUSE.MIDDLE with Double = js.native
  
  @js.native
  sealed trait PAN extends MOUSE
  /* 5 */ val PAN: typings.three.constantsMod.MOUSE.PAN with Double = js.native
  
  @js.native
  sealed trait RIGHT extends MOUSE
  /* 2 */ val RIGHT: typings.three.constantsMod.MOUSE.RIGHT with Double = js.native
  
  @js.native
  sealed trait ROTATE extends MOUSE
  /* 3 */ val ROTATE: typings.three.constantsMod.MOUSE.ROTATE with Double = js.native
}
