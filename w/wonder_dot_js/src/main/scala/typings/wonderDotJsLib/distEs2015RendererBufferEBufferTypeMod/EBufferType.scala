package typings
package wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBufferType extends js.Object

@JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferType", "EBufferType")
@js.native
object EBufferType extends js.Object {
  @js.native
  sealed trait BYTE
    extends wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  
  @js.native
  sealed trait FLOAT
    extends wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  
  @js.native
  sealed trait INT
    extends wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  
  @js.native
  sealed trait SHORT
    extends wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  
  @js.native
  sealed trait UNSIGNED_BYTE
    extends wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  
  @js.native
  sealed trait UNSIGNED_INT
    extends wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  
  @js.native
  sealed trait UNSIGNED_SHORT
    extends wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType
  
  /* 0 */ val BYTE: BYTE with scala.Double = js.native
  /* 6 */ val FLOAT: FLOAT with scala.Double = js.native
  /* 4 */ val INT: INT with scala.Double = js.native
  /* 2 */ val SHORT: SHORT with scala.Double = js.native
  /* 1 */ val UNSIGNED_BYTE: UNSIGNED_BYTE with scala.Double = js.native
  /* 5 */ val UNSIGNED_INT: UNSIGNED_INT with scala.Double = js.native
  /* 3 */ val UNSIGNED_SHORT: UNSIGNED_SHORT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType with scala.Double
  ] = js.native
}

