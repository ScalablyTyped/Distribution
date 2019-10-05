package typings.wonderDotJs

import typings.wonderDotJs.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferDataType", JSImport.Namespace)
@js.native
object distEs2015RendererBufferEBufferDataTypeMod extends js.Object {
  @js.native
  sealed trait EBufferDataType extends js.Object
  
  @js.native
  object EBufferDataType extends js.Object {
    @js.native
    sealed trait INDICE extends EBufferDataType
    
    @js.native
    sealed trait VERTICE extends EBufferDataType
    
    /* 1 */ val INDICE: typings.wonderDotJs.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType.INDICE with Double = js.native
    /* 0 */ val VERTICE: typings.wonderDotJs.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType.VERTICE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EBufferDataType with Double] = js.native
  }
  
}

