package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeBreakPoints extends _Theme {
  
  var breakpoints: js.Array[Double | String] = js.native
}
object ThemeBreakPoints {
  
  @scala.inline
  def apply(breakpoints: js.Array[Double | String]): ThemeBreakPoints = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeBreakPoints]
  }
  
  @scala.inline
  implicit class ThemeBreakPointsMutableBuilder[Self <: ThemeBreakPoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpoints(value: js.Array[Double | String]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsVarargs(value: (Double | String)*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
  }
}
