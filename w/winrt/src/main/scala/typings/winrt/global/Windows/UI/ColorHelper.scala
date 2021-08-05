package typings.winrt.global.Windows.UI

import typings.winrt.Windows.UI.Color
import typings.winrt.Windows.UI.IColorHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.UI.ColorHelper")
@js.native
class ColorHelper ()
  extends StObject
     with IColorHelper
/* static members */
object ColorHelper {
  
  @JSGlobal("Windows.UI.ColorHelper")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromArgb(a: Double, r: Double, g: Double, b: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArgb")(a.asInstanceOf[js.Any], r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Color]
}
