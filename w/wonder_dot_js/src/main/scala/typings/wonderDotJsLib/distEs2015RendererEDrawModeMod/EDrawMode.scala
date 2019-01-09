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
  
  val LINES: LINES with java.lang.String = js.native
  val LINE_LOOP: LINE_LOOP with java.lang.String = js.native
  val LINE_STRIP: LINE_STRIP with java.lang.String = js.native
  val POINTS: POINTS with java.lang.String = js.native
  val TRANGLE_FAN: TRANGLE_FAN with java.lang.String = js.native
  val TRIANGLES: TRIANGLES with java.lang.String = js.native
  val TRIANGLE_STRIP: TRIANGLE_STRIP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[wonderDotJsLib.distEs2015RendererEDrawModeMod.EDrawMode with java.lang.String] = js.native
}

