package typings.svgArcToCubicBezier

import typings.svgArcToCubicBezier.svgArcToCubicBezierNumbers.`0`
import typings.svgArcToCubicBezier.svgArcToCubicBezierNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-arc-to-cubic-bezier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: Arc): js.Array[CubicBezierCurve] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[CubicBezierCurve]]
  
  trait Arc extends StObject {
    
    var cx: Double
    
    var cy: Double
    
    var largeArcFlag: `0` | `1`
    
    var px: Double
    
    var py: Double
    
    var rx: Double
    
    var ry: Double
    
    var sweepFlag: `0` | `1`
    
    var xAxisRotation: Double
  }
  object Arc {
    
    inline def apply(
      cx: Double,
      cy: Double,
      largeArcFlag: `0` | `1`,
      px: Double,
      py: Double,
      rx: Double,
      ry: Double,
      sweepFlag: `0` | `1`,
      xAxisRotation: Double
    ): Arc = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], px = px.asInstanceOf[js.Any], py = py.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], xAxisRotation = xAxisRotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arc]
    }
    
    extension [Self <: Arc](x: Self) {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setLargeArcFlag(value: `0` | `1`): Self = StObject.set(x, "largeArcFlag", value.asInstanceOf[js.Any])
      
      inline def setPx(value: Double): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setPy(value: Double): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setSweepFlag(value: `0` | `1`): Self = StObject.set(x, "sweepFlag", value.asInstanceOf[js.Any])
      
      inline def setXAxisRotation(value: Double): Self = StObject.set(x, "xAxisRotation", value.asInstanceOf[js.Any])
    }
  }
  
  trait CubicBezierCurve extends StObject {
    
    var x: Double
    
    var x1: Double
    
    var x2: Double
    
    var y: Double
    
    var y1: Double
    
    var y2: Double
  }
  object CubicBezierCurve {
    
    inline def apply(x: Double, x1: Double, x2: Double, y: Double, y1: Double, y2: Double): CubicBezierCurve = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[CubicBezierCurve]
    }
    
    extension [Self <: CubicBezierCurve](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
}
