package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererEdrawmodeMod {
  
  @js.native
  sealed trait EDrawMode extends StObject
  @JSImport("wonder.js/dist/es2015/renderer/EDrawMode", "EDrawMode")
  @js.native
  object EDrawMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EDrawMode & Double] = js.native
    
    @js.native
    sealed trait LINES
      extends StObject
         with EDrawMode
    /* 1 */ val LINES: typings.wonderJs.distEs2015RendererEdrawmodeMod.EDrawMode.LINES & Double = js.native
    
    @js.native
    sealed trait LINE_LOOP
      extends StObject
         with EDrawMode
    /* 2 */ val LINE_LOOP: typings.wonderJs.distEs2015RendererEdrawmodeMod.EDrawMode.LINE_LOOP & Double = js.native
    
    @js.native
    sealed trait LINE_STRIP
      extends StObject
         with EDrawMode
    /* 3 */ val LINE_STRIP: typings.wonderJs.distEs2015RendererEdrawmodeMod.EDrawMode.LINE_STRIP & Double = js.native
    
    @js.native
    sealed trait POINTS
      extends StObject
         with EDrawMode
    /* 0 */ val POINTS: typings.wonderJs.distEs2015RendererEdrawmodeMod.EDrawMode.POINTS & Double = js.native
    
    @js.native
    sealed trait TRANGLE_FAN
      extends StObject
         with EDrawMode
    /* 6 */ val TRANGLE_FAN: typings.wonderJs.distEs2015RendererEdrawmodeMod.EDrawMode.TRANGLE_FAN & Double = js.native
    
    @js.native
    sealed trait TRIANGLES
      extends StObject
         with EDrawMode
    /* 4 */ val TRIANGLES: typings.wonderJs.distEs2015RendererEdrawmodeMod.EDrawMode.TRIANGLES & Double = js.native
    
    @js.native
    sealed trait TRIANGLE_STRIP
      extends StObject
         with EDrawMode
    /* 5 */ val TRIANGLE_STRIP: typings.wonderJs.distEs2015RendererEdrawmodeMod.EDrawMode.TRIANGLE_STRIP & Double = js.native
  }
}
