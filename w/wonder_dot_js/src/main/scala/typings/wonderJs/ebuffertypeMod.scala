package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ebuffertypeMod {
  
  @js.native
  sealed trait EBufferType extends StObject
  @JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferType", "EBufferType")
  @js.native
  object EBufferType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EBufferType & Double] = js.native
    
    @js.native
    sealed trait BYTE
      extends StObject
         with EBufferType
    /* 0 */ val BYTE: typings.wonderJs.ebuffertypeMod.EBufferType.BYTE & Double = js.native
    
    @js.native
    sealed trait FLOAT
      extends StObject
         with EBufferType
    /* 6 */ val FLOAT: typings.wonderJs.ebuffertypeMod.EBufferType.FLOAT & Double = js.native
    
    @js.native
    sealed trait INT
      extends StObject
         with EBufferType
    /* 4 */ val INT: typings.wonderJs.ebuffertypeMod.EBufferType.INT & Double = js.native
    
    @js.native
    sealed trait SHORT
      extends StObject
         with EBufferType
    /* 2 */ val SHORT: typings.wonderJs.ebuffertypeMod.EBufferType.SHORT & Double = js.native
    
    @js.native
    sealed trait UNSIGNED_BYTE
      extends StObject
         with EBufferType
    /* 1 */ val UNSIGNED_BYTE: typings.wonderJs.ebuffertypeMod.EBufferType.UNSIGNED_BYTE & Double = js.native
    
    @js.native
    sealed trait UNSIGNED_INT
      extends StObject
         with EBufferType
    /* 5 */ val UNSIGNED_INT: typings.wonderJs.ebuffertypeMod.EBufferType.UNSIGNED_INT & Double = js.native
    
    @js.native
    sealed trait UNSIGNED_SHORT
      extends StObject
         with EBufferType
    /* 3 */ val UNSIGNED_SHORT: typings.wonderJs.ebuffertypeMod.EBufferType.UNSIGNED_SHORT & Double = js.native
  }
}
