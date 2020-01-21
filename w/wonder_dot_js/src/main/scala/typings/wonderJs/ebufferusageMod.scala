package typings.wonderJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferUsage", JSImport.Namespace)
@js.native
object ebufferusageMod extends js.Object {
  @js.native
  sealed trait EBufferUsage extends js.Object
  
  @js.native
  object EBufferUsage extends js.Object {
    @js.native
    sealed trait DYNAMIC_DRAW extends EBufferUsage
    
    @js.native
    sealed trait STATIC_DRAW extends EBufferUsage
    
    @js.native
    sealed trait STREAM_DRAW extends EBufferUsage
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EBufferUsage with Double] = js.native
    /* 2 */ @js.native
    object DYNAMIC_DRAW extends TopLevel[DYNAMIC_DRAW with Double]
    
    /* 1 */ @js.native
    object STATIC_DRAW extends TopLevel[STATIC_DRAW with Double]
    
    /* 0 */ @js.native
    object STREAM_DRAW extends TopLevel[STREAM_DRAW with Double]
    
  }
  
}

