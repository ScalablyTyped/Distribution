package typings.wonderDotJs

import typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/EDrawMode", JSImport.Namespace)
@js.native
object distEs2015RendererEDrawModeMod extends js.Object {
  @js.native
  sealed trait EDrawMode extends js.Object
  
  @js.native
  object EDrawMode extends js.Object {
    @js.native
    sealed trait LINES extends EDrawMode
    
    @js.native
    sealed trait LINE_LOOP extends EDrawMode
    
    @js.native
    sealed trait LINE_STRIP extends EDrawMode
    
    @js.native
    sealed trait POINTS extends EDrawMode
    
    @js.native
    sealed trait TRANGLE_FAN extends EDrawMode
    
    @js.native
    sealed trait TRIANGLES extends EDrawMode
    
    @js.native
    sealed trait TRIANGLE_STRIP extends EDrawMode
    
    /* 1 */ val LINES: typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.LINES with Double = js.native
    /* 2 */ val LINE_LOOP: typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.LINE_LOOP with Double = js.native
    /* 3 */ val LINE_STRIP: typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.LINE_STRIP with Double = js.native
    /* 0 */ val POINTS: typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.POINTS with Double = js.native
    /* 6 */ val TRANGLE_FAN: typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.TRANGLE_FAN with Double = js.native
    /* 4 */ val TRIANGLES: typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.TRIANGLES with Double = js.native
    /* 5 */ val TRIANGLE_STRIP: typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.TRIANGLE_STRIP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EDrawMode with Double] = js.native
  }
  
}

