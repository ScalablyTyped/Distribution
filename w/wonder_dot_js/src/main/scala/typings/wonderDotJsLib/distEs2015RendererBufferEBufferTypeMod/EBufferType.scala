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
  
  val BYTE: BYTE with java.lang.String = js.native
  val FLOAT: FLOAT with java.lang.String = js.native
  val INT: INT with java.lang.String = js.native
  val SHORT: SHORT with java.lang.String = js.native
  val UNSIGNED_BYTE: UNSIGNED_BYTE with java.lang.String = js.native
  val UNSIGNED_INT: UNSIGNED_INT with java.lang.String = js.native
  val UNSIGNED_SHORT: UNSIGNED_SHORT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType with java.lang.String
  ] = js.native
}

