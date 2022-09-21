package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glUtilsMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/GlUtils", "GlUtils")
  @js.native
  open class GlUtils () extends StObject
  /* static members */
  object GlUtils {
    
    @JSImport("wonder.js/dist/es2015/renderer/GlUtils", "GlUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def drawArrays(mode: Any, first: Double, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawArrays")(mode.asInstanceOf[js.Any], first.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawElements(mode: Any, count: Double, `type`: Any, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawElements")(mode.asInstanceOf[js.Any], count.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
