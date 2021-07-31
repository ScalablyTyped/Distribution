package typings.styleValueTypes

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("style-value-types/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clamp(min: Double, max: Double): js.Function1[/* v */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Double]]
  
  @JSImport("style-value-types/lib/utils", "colorRegex")
  @js.native
  val colorRegex: RegExp = js.native
  
  @JSImport("style-value-types/lib/utils", "floatRegex")
  @js.native
  val floatRegex: RegExp = js.native
  
  @scala.inline
  def sanitize(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("style-value-types/lib/utils", "singleColorRegex")
  @js.native
  val singleColorRegex: RegExp = js.native
}
