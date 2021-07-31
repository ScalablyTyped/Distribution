package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ebufferdatatypeMod {
  
  @js.native
  sealed trait EBufferDataType extends StObject
  @JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferDataType", "EBufferDataType")
  @js.native
  object EBufferDataType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EBufferDataType & Double] = js.native
    
    @js.native
    sealed trait INDICE
      extends StObject
         with EBufferDataType
    /* 1 */ val INDICE: typings.wonderJs.ebufferdatatypeMod.EBufferDataType.INDICE & Double = js.native
    
    @js.native
    sealed trait VERTICE
      extends StObject
         with EBufferDataType
    /* 0 */ val VERTICE: typings.wonderJs.ebufferdatatypeMod.EBufferDataType.VERTICE & Double = js.native
  }
}
