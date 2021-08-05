package typings.vara

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BreakPoints extends StObject {
    
    var breakPoints: js.Array[js.Array[String | Double]]
    
    var width: Double
  }
  object BreakPoints {
    
    inline def apply(breakPoints: js.Array[js.Array[String | Double]], width: Double): BreakPoints = {
      val __obj = js.Dynamic.literal(breakPoints = breakPoints.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreakPoints]
    }
    
    extension [Self <: BreakPoints](x: Self) {
      
      inline def setBreakPoints(value: js.Array[js.Array[String | Double]]): Self = StObject.set(x, "breakPoints", value.asInstanceOf[js.Any])
      
      inline def setBreakPointsVarargs(value: (js.Array[String | Double])*): Self = StObject.set(x, "breakPoints", js.Array(value :_*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: js.UndefOr[Boolean] = js.undefined
    
    var y: js.UndefOr[Boolean] = js.undefined
  }
  object X {
    
    inline def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait XY extends StObject {
    
    var x: Boolean
    
    var y: Boolean
  }
  object XY {
    
    inline def apply(x: Boolean, y: Boolean): XY = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[XY]
    }
    
    extension [Self <: XY](x: Self) {
      
      inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Y {
    
    inline def apply(): Y = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Y]
    }
    
    extension [Self <: Y](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
