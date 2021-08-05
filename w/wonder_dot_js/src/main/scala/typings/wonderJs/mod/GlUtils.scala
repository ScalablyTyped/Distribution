package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "GlUtils")
@js.native
class GlUtils ()
  extends typings.wonderJs.glUtilsMod.GlUtils
/* static members */
object GlUtils {
  
  @JSImport("wonder.js/dist/es2015", "GlUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawArrays(mode: js.Any, first: Double, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawArrays")(mode.asInstanceOf[js.Any], first.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawElements(mode: js.Any, count: Double, `type`: js.Any, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawElements")(mode.asInstanceOf[js.Any], count.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
