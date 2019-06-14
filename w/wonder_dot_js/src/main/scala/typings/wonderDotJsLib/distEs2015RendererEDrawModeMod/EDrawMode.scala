package typings
package wonderDotJsLib.distEs2015RendererEDrawModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDrawMode extends js.Object

@JSImport("wonder.js/dist/es2015/renderer/EDrawMode", "EDrawMode")
@js.native
object EDrawMode extends js.Object {
  @js.native
  sealed trait LINES
    extends wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode
  
  @js.native
  sealed trait LINE_LOOP
    extends wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode
  
  @js.native
  sealed trait LINE_STRIP
    extends wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode
  
  @js.native
  sealed trait POINTS
    extends wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode
  
  @js.native
  sealed trait TRANGLE_FAN
    extends wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode
  
  @js.native
  sealed trait TRIANGLES
    extends wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode
  
  @js.native
  sealed trait TRIANGLE_STRIP
    extends wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode
  
  /* 1 */ val LINES: LINES with scala.Double = js.native
  /* 2 */ val LINE_LOOP: LINE_LOOP with scala.Double = js.native
  /* 3 */ val LINE_STRIP: LINE_STRIP with scala.Double = js.native
  /* 0 */ val POINTS: POINTS with scala.Double = js.native
  /* 6 */ val TRANGLE_FAN: TRANGLE_FAN with scala.Double = js.native
  /* 4 */ val TRIANGLES: TRIANGLES with scala.Double = js.native
  /* 5 */ val TRIANGLE_STRIP: TRIANGLE_STRIP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode with scala.Double] = js.native
}

