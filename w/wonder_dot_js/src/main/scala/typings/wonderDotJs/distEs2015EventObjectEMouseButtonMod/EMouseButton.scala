package typings.wonderDotJs.distEs2015EventObjectEMouseButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EMouseButton extends js.Object

@JSImport("wonder.js/dist/es2015/event/object/EMouseButton", "EMouseButton")
@js.native
object EMouseButton extends js.Object {
  @js.native
  sealed trait CENTER extends EMouseButton
  
  @js.native
  sealed trait LEFT extends EMouseButton
  
  @js.native
  sealed trait RIGHT extends EMouseButton
  
  /* 2 */ val CENTER: typings.wonderDotJs.distEs2015EventObjectEMouseButtonMod.EMouseButton.CENTER with Double = js.native
  /* 0 */ val LEFT: typings.wonderDotJs.distEs2015EventObjectEMouseButtonMod.EMouseButton.LEFT with Double = js.native
  /* 1 */ val RIGHT: typings.wonderDotJs.distEs2015EventObjectEMouseButtonMod.EMouseButton.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMouseButton with Double] = js.native
}

