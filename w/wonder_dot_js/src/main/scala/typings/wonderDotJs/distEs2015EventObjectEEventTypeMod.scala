package typings.wonderDotJs

import typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/EEventType", JSImport.Namespace)
@js.native
object distEs2015EventObjectEEventTypeMod extends js.Object {
  @js.native
  sealed trait EEventType extends js.Object
  
  @js.native
  object EEventType extends js.Object {
    @js.native
    sealed trait CUSTOM extends EEventType
    
    @js.native
    sealed trait KEYBOARD extends EEventType
    
    @js.native
    sealed trait MOUSE extends EEventType
    
    @js.native
    sealed trait POINT extends EEventType
    
    @js.native
    sealed trait TOUCH extends EEventType
    
    /* 4 */ val CUSTOM: typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType.CUSTOM with Double = js.native
    /* 3 */ val KEYBOARD: typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType.KEYBOARD with Double = js.native
    /* 0 */ val MOUSE: typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType.MOUSE with Double = js.native
    /* 2 */ val POINT: typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType.POINT with Double = js.native
    /* 1 */ val TOUCH: typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType.TOUCH with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEventType with Double] = js.native
  }
  
}

