package typings
package wonderDotJsLib.distEs2015RendererBufferEBufferDataTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBufferDataType extends js.Object

@JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferDataType", "EBufferDataType")
@js.native
object EBufferDataType extends js.Object {
  @js.native
  sealed trait INDICE
    extends wonderDotJsLib.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType
  
  @js.native
  sealed trait VERTICE
    extends wonderDotJsLib.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType
  
  /* 1 */ val INDICE: INDICE with scala.Double = js.native
  /* 0 */ val VERTICE: VERTICE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    wonderDotJsLib.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType with scala.Double
  ] = js.native
}

