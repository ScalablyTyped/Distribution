package typings.svgPathParser.mod

import typings.svgPathParser.svgPathParserStrings.A
import typings.svgPathParser.svgPathParserStrings.`elliptical arc`
import typings.svgPathParser.svgPathParserStrings.a_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EllipticalArcCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_EllipticalArcCommand: a_ | A
  
  @JSName("command")
  var command_EllipticalArcCommand: `elliptical arc`
  
  var largeArc: Boolean
  
  var rx: Double
  
  var ry: Double
  
  var sweep: Boolean
  
  var x: Double
  
  var xAxisRotation: Double
  
  var y: Double
}
object EllipticalArcCommand {
  
  inline def apply(
    code: a_ | A,
    largeArc: Boolean,
    rx: Double,
    ry: Double,
    sweep: Boolean,
    x: Double,
    xAxisRotation: Double,
    y: Double
  ): EllipticalArcCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "elliptical arc", largeArc = largeArc.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sweep = sweep.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xAxisRotation = xAxisRotation.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipticalArcCommand]
  }
  
  extension [Self <: EllipticalArcCommand](x: Self) {
    
    inline def setCode(value: a_ | A): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `elliptical arc`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setLargeArc(value: Boolean): Self = StObject.set(x, "largeArc", value.asInstanceOf[js.Any])
    
    inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setSweep(value: Boolean): Self = StObject.set(x, "sweep", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXAxisRotation(value: Double): Self = StObject.set(x, "xAxisRotation", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
