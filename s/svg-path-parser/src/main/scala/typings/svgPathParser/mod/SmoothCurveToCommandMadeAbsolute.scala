package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserBooleans.`false`
import typings.svgPathParser.svgPathParserStrings.S
import typings.svgPathParser.svgPathParserStrings.`smooth curveto`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmoothCurveToCommandMadeAbsolute
  extends StObject
     with BaseCommand
     with CommandMadeAbsolute {
  
  @JSName("code")
  var code_SmoothCurveToCommandMadeAbsolute: S
  
  @JSName("command")
  var command_SmoothCurveToCommandMadeAbsolute: `smooth curveto`
  
  @JSName("relative")
  var relative_SmoothCurveToCommandMadeAbsolute: `false`
  
  var x: Double
  
  var x0: Double
  
  var x2: Double
  
  var y: Double
  
  var y0: Double
  
  var y2: Double
}
object SmoothCurveToCommandMadeAbsolute {
  
  inline def apply(x: Double, x0: Double, x2: Double, y: Double, y0: Double, y2: Double): SmoothCurveToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "S", command = "smooth curveto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothCurveToCommandMadeAbsolute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmoothCurveToCommandMadeAbsolute] (val x: Self) extends AnyVal {
    
    inline def setCode(value: S): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `smooth curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: `false`): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
