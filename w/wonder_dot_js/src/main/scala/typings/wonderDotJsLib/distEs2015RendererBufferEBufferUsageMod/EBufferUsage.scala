package typings
package wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBufferUsage extends js.Object

@JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferUsage", "EBufferUsage")
@js.native
object EBufferUsage extends js.Object {
  @js.native
  sealed trait DYNAMIC_DRAW
    extends wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
  
  @js.native
  sealed trait STATIC_DRAW
    extends wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
  
  @js.native
  sealed trait STREAM_DRAW
    extends wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
  
  val DYNAMIC_DRAW: DYNAMIC_DRAW with java.lang.String = js.native
  val STATIC_DRAW: STATIC_DRAW with java.lang.String = js.native
  val STREAM_DRAW: STREAM_DRAW with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage with java.lang.String
  ] = js.native
}

