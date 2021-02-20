package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object defining a color gradient.
  */
@js.native
trait Gradient extends StObject {
  
  /**
    * Set to `true` to continue filling with the final color beyond the `endPoint`.
    */
  var backfillEnd: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to `true` to continue filling with the starting color beyond the `startPoint`.
    */
  var backfillStart: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of colors, as a color name or hex triplet.
    */
  var colors: js.UndefOr[js.Array[GradientColorRef | String]] = js.native
  
  /**
    * End point for the gradient.
    */
  var endPoint: js.UndefOr[Point] = js.native
  
  /**
    * For a radial gradient, the radius at the `endPoint`.
    */
  var endRadius: js.UndefOr[Double] = js.native
  
  /**
    * Start point for the gradient.
    */
  var startPoint: js.UndefOr[Point] = js.native
  
  /**
    * For a radial gradient, the radius at the `startPoint`.
    */
  var startRadius: js.UndefOr[Double] = js.native
  
  /**
    * Type of gradient, either 'linear' or 'radial'.
    */
  var `type`: js.UndefOr[String] = js.native
}
object Gradient {
  
  @scala.inline
  def apply(): Gradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gradient]
  }
  
  @scala.inline
  implicit class GradientMutableBuilder[Self <: Gradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackfillEnd(value: Boolean): Self = StObject.set(x, "backfillEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackfillEndUndefined: Self = StObject.set(x, "backfillEnd", js.undefined)
    
    @scala.inline
    def setBackfillStart(value: Boolean): Self = StObject.set(x, "backfillStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackfillStartUndefined: Self = StObject.set(x, "backfillStart", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[GradientColorRef | String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: (GradientColorRef | String)*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setEndPoint(value: Point): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPointUndefined: Self = StObject.set(x, "endPoint", js.undefined)
    
    @scala.inline
    def setEndRadius(value: Double): Self = StObject.set(x, "endRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRadiusUndefined: Self = StObject.set(x, "endRadius", js.undefined)
    
    @scala.inline
    def setStartPoint(value: Point): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
    
    @scala.inline
    def setStartRadius(value: Double): Self = StObject.set(x, "startRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRadiusUndefined: Self = StObject.set(x, "startRadius", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
