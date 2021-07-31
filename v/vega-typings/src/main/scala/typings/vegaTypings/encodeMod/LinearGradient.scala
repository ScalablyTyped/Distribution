package typings.vegaTypings.encodeMod

import typings.vegaTypings.vegaTypingsStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGradient
  extends StObject
     with BaseGradient
     with Gradient {
  
  /**
    * The type of gradient. Use `"linear"` for a linear gradient.
    */
  @JSName("gradient")
  var gradient_LinearGradient: linear
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * An array of gradient stops defining the gradient color sequence.
    */
  var stops: js.Array[GradientStop]
  
  /**
    * The starting x-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `0`
    */
  var x1: js.UndefOr[Double] = js.undefined
  
  /**
    * The ending x-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `1`
    */
  var x2: js.UndefOr[Double] = js.undefined
  
  /**
    * The starting y-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `0`
    */
  var y1: js.UndefOr[Double] = js.undefined
  
  /**
    * The ending y-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
    *
    * __Default value:__ `0`
    */
  var y2: js.UndefOr[Double] = js.undefined
}
object LinearGradient {
  
  @scala.inline
  def apply(stops: js.Array[GradientStop]): LinearGradient = {
    val __obj = js.Dynamic.literal(gradient = "linear", stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradient]
  }
  
  @scala.inline
  implicit class LinearGradientMutableBuilder[Self <: LinearGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGradient(value: linear): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[GradientStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsVarargs(value: GradientStop*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
