package typings.wonderDotJs.distEs2015RendererBufferEBufferUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBufferUsage extends js.Object

@JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferUsage", "EBufferUsage")
@js.native
object EBufferUsage extends js.Object {
  @js.native
  sealed trait DYNAMIC_DRAW extends EBufferUsage
  
  @js.native
  sealed trait STATIC_DRAW extends EBufferUsage
  
  @js.native
  sealed trait STREAM_DRAW extends EBufferUsage
  
  /* 2 */ val DYNAMIC_DRAW: typings.wonderDotJs.distEs2015RendererBufferEBufferUsageMod.EBufferUsage.DYNAMIC_DRAW with Double = js.native
  /* 1 */ val STATIC_DRAW: typings.wonderDotJs.distEs2015RendererBufferEBufferUsageMod.EBufferUsage.STATIC_DRAW with Double = js.native
  /* 0 */ val STREAM_DRAW: typings.wonderDotJs.distEs2015RendererBufferEBufferUsageMod.EBufferUsage.STREAM_DRAW with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBufferUsage with Double] = js.native
}

