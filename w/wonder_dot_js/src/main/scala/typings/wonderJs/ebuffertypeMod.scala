package typings.wonderJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferType", JSImport.Namespace)
@js.native
object ebuffertypeMod extends js.Object {
  @js.native
  sealed trait EBufferType extends js.Object
  
  @js.native
  object EBufferType extends js.Object {
    @js.native
    sealed trait BYTE extends EBufferType
    
    @js.native
    sealed trait FLOAT extends EBufferType
    
    @js.native
    sealed trait INT extends EBufferType
    
    @js.native
    sealed trait SHORT extends EBufferType
    
    @js.native
    sealed trait UNSIGNED_BYTE extends EBufferType
    
    @js.native
    sealed trait UNSIGNED_INT extends EBufferType
    
    @js.native
    sealed trait UNSIGNED_SHORT extends EBufferType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EBufferType with Double] = js.native
    /* 0 */ @js.native
    object BYTE extends TopLevel[BYTE with Double]
    
    /* 6 */ @js.native
    object FLOAT extends TopLevel[FLOAT with Double]
    
    /* 4 */ @js.native
    object INT extends TopLevel[INT with Double]
    
    /* 2 */ @js.native
    object SHORT extends TopLevel[SHORT with Double]
    
    /* 1 */ @js.native
    object UNSIGNED_BYTE extends TopLevel[UNSIGNED_BYTE with Double]
    
    /* 5 */ @js.native
    object UNSIGNED_INT extends TopLevel[UNSIGNED_INT with Double]
    
    /* 3 */ @js.native
    object UNSIGNED_SHORT extends TopLevel[UNSIGNED_SHORT with Double]
    
  }
  
}

