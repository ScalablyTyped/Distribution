package typings.styleValueTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("style-value-types/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clamp(min: Double, max: Double): js.Function1[/* v */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Double]]
  
  @JSImport("style-value-types/lib/utils", "colorRegex")
  @js.native
  val colorRegex: js.RegExp = js.native
  
  @JSImport("style-value-types/lib/utils", "floatRegex")
  @js.native
  val floatRegex: js.RegExp = js.native
  
  inline def isString(v: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(v.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def sanitize(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("style-value-types/lib/utils", "singleColorRegex")
  @js.native
  val singleColorRegex: js.RegExp = js.native
}
