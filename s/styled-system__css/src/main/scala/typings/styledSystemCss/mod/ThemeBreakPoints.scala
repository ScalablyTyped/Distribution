package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeBreakPoints
  extends StObject
     with _Theme {
  
  var breakpoints: js.Array[Double | String]
}
object ThemeBreakPoints {
  
  inline def apply(breakpoints: js.Array[Double | String]): ThemeBreakPoints = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeBreakPoints]
  }
  
  extension [Self <: ThemeBreakPoints](x: Self) {
    
    inline def setBreakpoints(value: js.Array[Double | String]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsVarargs(value: (Double | String)*): Self = StObject.set(x, "breakpoints", js.Array(value*))
  }
}
