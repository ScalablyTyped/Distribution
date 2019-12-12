package typings.wonderDotJs

import org.scalablytyped.runtime.TopLevel
import typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode
import typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.LINES
import typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.LINE_LOOP
import typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.LINE_STRIP
import typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.POINTS
import typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.TRANGLE_FAN
import typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.TRIANGLES
import typings.wonderDotJs.distEs2015RendererEDrawModeMod.EDrawMode.TRIANGLE_STRIP
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EDrawMode with Double] = js.native
    /* 1 */ @js.native
    object LINES extends TopLevel[LINES with Double]
    
    /* 2 */ @js.native
    object LINE_LOOP extends TopLevel[LINE_LOOP with Double]
    
    /* 3 */ @js.native
    object LINE_STRIP extends TopLevel[LINE_STRIP with Double]
    
    /* 0 */ @js.native
    object POINTS extends TopLevel[POINTS with Double]
    
    /* 6 */ @js.native
    object TRANGLE_FAN extends TopLevel[TRANGLE_FAN with Double]
    
    /* 4 */ @js.native
    object TRIANGLES extends TopLevel[TRIANGLES with Double]
    
    /* 5 */ @js.native
    object TRIANGLE_STRIP extends TopLevel[TRIANGLE_STRIP with Double]
    
  }
  
}

