package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserBooleans.`false`
import typings.svgPathParser.svgPathParserStrings.A
import typings.svgPathParser.svgPathParserStrings.`elliptical arc`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EllipticalArcCommandMadeAbsolute
  extends StObject
     with BaseCommand
     with CommandMadeAbsolute {
  
  @JSName("code")
  var code_EllipticalArcCommandMadeAbsolute: A
  
  @JSName("command")
  var command_EllipticalArcCommandMadeAbsolute: `elliptical arc`
  
  var largeArc: Boolean
  
  @JSName("relative")
  var relative_EllipticalArcCommandMadeAbsolute: `false`
  
  var rx: Double
  
  var ry: Double
  
  var sweep: Boolean
  
  var x: Double
  
  var x0: Double
  
  var xAxisRotation: Double
  
  var y: Double
  
  var y0: Double
}
object EllipticalArcCommandMadeAbsolute {
  
  inline def apply(
    largeArc: Boolean,
    rx: Double,
    ry: Double,
    sweep: Boolean,
    x: Double,
    x0: Double,
    xAxisRotation: Double,
    y: Double,
    y0: Double
  ): EllipticalArcCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "A", command = "elliptical arc", largeArc = largeArc.asInstanceOf[js.Any], relative = false, rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sweep = sweep.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], xAxisRotation = xAxisRotation.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipticalArcCommandMadeAbsolute]
  }
  
  extension [Self <: EllipticalArcCommandMadeAbsolute](x: Self) {
    
    inline def setCode(value: A): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `elliptical arc`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setLargeArc(value: Boolean): Self = StObject.set(x, "largeArc", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: `false`): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setSweep(value: Boolean): Self = StObject.set(x, "sweep", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setXAxisRotation(value: Double): Self = StObject.set(x, "xAxisRotation", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
  }
}
