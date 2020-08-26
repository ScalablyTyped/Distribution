package typings.vegaTypings.encodeMod

import typings.vegaTypings.vegaTypingsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadialGradient
  extends BaseGradient
     with Gradient {
  /**
    * The type of gradient. Use `"radial"` for a radial gradient.
    */
  @JSName("gradient")
  var gradient_RadialGradient: radial = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * The radius length, in normalized [0, 1] coordinates, of the inner circle for the gradient.
    *
    * __Default value:__ `0`
    */
  var r1: js.UndefOr[Double] = js.native
  /**
    * The radius length, in normalized [0, 1] coordinates, of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var r2: js.UndefOr[Double] = js.native
  /**
    * An array of gradient stops defining the gradient color sequence.
    */
  var stops: js.Array[GradientStop] = js.native
  /**
    * The x-coordinate, in normalized [0, 1] coordinates, for the center of the inner circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var x1: js.UndefOr[Double] = js.native
  /**
    * The x-coordinate, in normalized [0, 1] coordinates, for the center of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var x2: js.UndefOr[Double] = js.native
  /**
    * The y-coordinate, in normalized [0, 1] coordinates, for the center of the inner circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var y1: js.UndefOr[Double] = js.native
  /**
    * The y-coordinate, in normalized [0, 1] coordinates, for the center of the outer circle for the gradient.
    *
    * __Default value:__ `0.5`
    */
  var y2: js.UndefOr[Double] = js.native
}

object RadialGradient {
  @scala.inline
  def apply(gradient: radial, stops: js.Array[GradientStop]): RadialGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradient]
  }
  @scala.inline
  implicit class RadialGradientOps[Self <: RadialGradient] (val x: Self) extends AnyVal {
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
    def setGradient(value: radial): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopsVarargs(value: GradientStop*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[GradientStop]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setR1(value: Double): Self = this.set("r1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR1: Self = this.set("r1", js.undefined)
    @scala.inline
    def setR2(value: Double): Self = this.set("r2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR2: Self = this.set("r2", js.undefined)
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
  
}

