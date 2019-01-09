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
  
  val INDICE: INDICE with java.lang.String = js.native
  val VERTICE: VERTICE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    wonderDotJsLib.distEs2015RendererBufferEBufferDataTypeMod.EBufferDataType with java.lang.String
  ] = js.native
}

