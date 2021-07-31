package typings.vegaTypings.encodeMod

import typings.vegaTypings.vegaTypingsStrings.radial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGradient
  extends StObject
     with BaseGradient
     with Gradient {
  
  /**
    * The type of gradient. Use `"radial"` for a radial gradient.
    */
  @JSName("gradient")
  var gradient_RadialGradient: radial
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The radius length, in normalized [0, 1] coordinates, of the inner circle for the gradient.
    *
    * __Default value:__ `0`
    */
  var r1: js.UndefOr[Double] = js.undefined
  
  /**
    * The radius length, in normalized [0, 1] coordinates, of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var r2: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of gradient stops defining the gradient color sequence.
    */
  var stops: js.Array[GradientStop]
  
  /**
    * The x-coordinate, in normalized [0, 1] coordinates, for the center of the inner circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var x1: js.UndefOr[Double] = js.undefined
  
  /**
    * The x-coordinate, in normalized [0, 1] coordinates, for the center of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var x2: js.UndefOr[Double] = js.undefined
  
  /**
    * The y-coordinate, in normalized [0, 1] coordinates, for the center of the inner circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var y1: js.UndefOr[Double] = js.undefined
  
  /**
    * The y-coordinate, in normalized [0, 1] coordinates, for the center of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var y2: js.UndefOr[Double] = js.undefined
}
object RadialGradient {
  
  @scala.inline
  def apply(stops: js.Array[GradientStop]): RadialGradient = {
    val __obj = js.Dynamic.literal(gradient = "radial", stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradient]
  }
  
  @scala.inline
  implicit class RadialGradientMutableBuilder[Self <: RadialGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGradient(value: radial): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR1Undefined: Self = StObject.set(x, "r1", js.undefined)
    
    @scala.inline
    def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR2Undefined: Self = StObject.set(x, "r2", js.undefined)
    
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
