package typings.wonderJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferDataType", JSImport.Namespace)
@js.native
object ebufferdatatypeMod extends js.Object {
  @js.native
  sealed trait EBufferDataType extends js.Object
  
  @js.native
  object EBufferDataType extends js.Object {
    @js.native
    sealed trait INDICE extends EBufferDataType
    
    @js.native
    sealed trait VERTICE extends EBufferDataType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EBufferDataType with Double] = js.native
    /* 1 */ @js.native
    object INDICE extends TopLevel[INDICE with Double]
    
    /* 0 */ @js.native
    object VERTICE extends TopLevel[VERTICE with Double]
    
  }
  
}

