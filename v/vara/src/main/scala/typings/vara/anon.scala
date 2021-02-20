package typings.vara

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BreakPoints extends StObject {
    
    var breakPoints: js.Array[js.Array[String | Double]] = js.native
    
    var width: Double = js.native
  }
  object BreakPoints {
    
    @scala.inline
    def apply(breakPoints: js.Array[js.Array[String | Double]], width: Double): BreakPoints = {
      val __obj = js.Dynamic.literal(breakPoints = breakPoints.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreakPoints]
    }
    
    @scala.inline
    implicit class BreakPointsMutableBuilder[Self <: BreakPoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakPoints(value: js.Array[js.Array[String | Double]]): Self = StObject.set(x, "breakPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakPointsVarargs(value: (js.Array[String | Double])*): Self = StObject.set(x, "breakPoints", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: js.UndefOr[Boolean] = js.native
    
    var y: js.UndefOr[Boolean] = js.native
  }
  object X {
    
    @scala.inline
    def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait XY extends StObject {
    
    var x: Boolean = js.native
    
    var y: Boolean = js.native
  }
  object XY {
    
    @scala.inline
    def apply(x: Boolean, y: Boolean): XY = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[XY]
    }
    
    @scala.inline
    implicit class XYMutableBuilder[Self <: XY] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Y extends StObject {
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object Y {
    
    @scala.inline
    def apply(): Y = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
