package typings
package wonderDotJsLib.distEs2015EventObjectEEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EEventType extends js.Object

@JSImport("wonder.js/dist/es2015/event/object/EEventType", "EEventType")
@js.native
object EEventType extends js.Object {
  @js.native
  sealed trait CUSTOM
    extends wonderDotJsLib.distEs2015EventObjectEEventTypeMod.EEventType
  
  @js.native
  sealed trait KEYBOARD
    extends wonderDotJsLib.distEs2015EventObjectEEventTypeMod.EEventType
  
  @js.native
  sealed trait MOUSE
    extends wonderDotJsLib.distEs2015EventObjectEEventTypeMod.EEventType
  
  @js.native
  sealed trait POINT
    extends wonderDotJsLib.distEs2015EventObjectEEventTypeMod.EEventType
  
  @js.native
  sealed trait TOUCH
    extends wonderDotJsLib.distEs2015EventObjectEEventTypeMod.EEventType
  
  /* 4 */ val CUSTOM: CUSTOM with scala.Double = js.native
  /* 3 */ val KEYBOARD: KEYBOARD with scala.Double = js.native
  /* 0 */ val MOUSE: MOUSE with scala.Double = js.native
  /* 2 */ val POINT: POINT with scala.Double = js.native
  /* 1 */ val TOUCH: TOUCH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDotJsLib.distEs2015EventObjectEEventTypeMod.EEventType with scala.Double] = js.native
}

