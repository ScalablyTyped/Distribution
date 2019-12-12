package typings.wonderDotJs

import org.scalablytyped.runtime.TopLevel
import typings.wonderDotJs.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType
import typings.wonderDotJs.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType.INDICE
import typings.wonderDotJs.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType.VERTICE
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EBufferDataType with Double] = js.native
    /* 1 */ @js.native
    object INDICE extends TopLevel[INDICE with Double]
    
    /* 0 */ @js.native
    object VERTICE extends TopLevel[VERTICE with Double]
    
  }
  
}

