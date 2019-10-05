package typings.wonderDotJs

import typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferType", JSImport.Namespace)
@js.native
object distEs2015RendererBufferEBufferTypeMod extends js.Object {
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
    
    /* 0 */ val BYTE: typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType.BYTE with Double = js.native
    /* 6 */ val FLOAT: typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType.FLOAT with Double = js.native
    /* 4 */ val INT: typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType.INT with Double = js.native
    /* 2 */ val SHORT: typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType.SHORT with Double = js.native
    /* 1 */ val UNSIGNED_BYTE: typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType.UNSIGNED_BYTE with Double = js.native
    /* 5 */ val UNSIGNED_INT: typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType.UNSIGNED_INT with Double = js.native
    /* 3 */ val UNSIGNED_SHORT: typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType.UNSIGNED_SHORT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EBufferType with Double] = js.native
  }
  
}

