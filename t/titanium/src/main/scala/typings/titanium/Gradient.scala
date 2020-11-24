package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object defining a color gradient.
  */
@js.native
trait Gradient extends js.Object {
  
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
  implicit class GradientOps[Self <: Gradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackfillEnd(value: Boolean): Self = this.set("backfillEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackfillEnd: Self = this.set("backfillEnd", js.undefined)
    
    @scala.inline
    def setBackfillStart(value: Boolean): Self = this.set("backfillStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackfillStart: Self = this.set("backfillStart", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: (GradientColorRef | String)*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[GradientColorRef | String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setEndPoint(value: Point): Self = this.set("endPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPoint: Self = this.set("endPoint", js.undefined)
    
    @scala.inline
    def setEndRadius(value: Double): Self = this.set("endRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndRadius: Self = this.set("endRadius", js.undefined)
    
    @scala.inline
    def setStartPoint(value: Point): Self = this.set("startPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPoint: Self = this.set("startPoint", js.undefined)
    
    @scala.inline
    def setStartRadius(value: Double): Self = this.set("startRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRadius: Self = this.set("startRadius", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
