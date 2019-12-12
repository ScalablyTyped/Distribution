package typings.wonderDotJs

import org.scalablytyped.runtime.TopLevel
import typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType
import typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType.CUSTOM
import typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType.KEYBOARD
import typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType.MOUSE
import typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType.POINT
import typings.wonderDotJs.distEs2015EventObjectEEventTypeMod.EEventType.TOUCH
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEventType with Double] = js.native
    /* 4 */ @js.native
    object CUSTOM extends TopLevel[CUSTOM with Double]
    
    /* 3 */ @js.native
    object KEYBOARD extends TopLevel[KEYBOARD with Double]
    
    /* 0 */ @js.native
    object MOUSE extends TopLevel[MOUSE with Double]
    
    /* 2 */ @js.native
    object POINT extends TopLevel[POINT with Double]
    
    /* 1 */ @js.native
    object TOUCH extends TopLevel[TOUCH with Double]
    
  }
  
}

