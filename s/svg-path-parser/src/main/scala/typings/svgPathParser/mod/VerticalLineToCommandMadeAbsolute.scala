package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserBooleans.`false`
import typings.svgPathParser.svgPathParserStrings.V
import typings.svgPathParser.svgPathParserStrings.`vertical lineto`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalLineToCommandMadeAbsolute
  extends StObject
     with BaseCommand
     with CommandMadeAbsolute {
  
  @JSName("code")
  var code_VerticalLineToCommandMadeAbsolute: V
  
  @JSName("command")
  var command_VerticalLineToCommandMadeAbsolute: `vertical lineto`
  
  @JSName("relative")
  var relative_VerticalLineToCommandMadeAbsolute: `false`
  
  var x: Double
  
  var x0: Double
  
  var y: Double
  
  var y0: Double
}
object VerticalLineToCommandMadeAbsolute {
  
  inline def apply(x: Double, x0: Double, y: Double, y0: Double): VerticalLineToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "V", command = "vertical lineto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalLineToCommandMadeAbsolute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerticalLineToCommandMadeAbsolute] (val x: Self) extends AnyVal {
    
    inline def setCode(value: V): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `vertical lineto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: `false`): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
  }
}
