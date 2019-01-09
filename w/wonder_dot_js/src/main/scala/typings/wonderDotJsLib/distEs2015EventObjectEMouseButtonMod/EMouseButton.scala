package typings
package wonderDotJsLib.distEs2015EventObjectEMouseButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EMouseButton extends js.Object

@JSImport("wonder.js/dist/es2015/event/object/EMouseButton", "EMouseButton")
@js.native
object EMouseButton extends js.Object {
  @js.native
  sealed trait CENTER
    extends wonderDotJsLib.distEs2015EventObjectEMouseButtonMod.EMouseButton
  
  @js.native
  sealed trait LEFT
    extends wonderDotJsLib.distEs2015EventObjectEMouseButtonMod.EMouseButton
  
  @js.native
  sealed trait RIGHT
    extends wonderDotJsLib.distEs2015EventObjectEMouseButtonMod.EMouseButton
  
  /* 2 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 1 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    wonderDotJsLib.distEs2015EventObjectEMouseButtonMod.EMouseButton with scala.Double
  ] = js.native
}

