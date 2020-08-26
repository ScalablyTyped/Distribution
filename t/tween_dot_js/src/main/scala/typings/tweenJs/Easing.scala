package typings.tweenJs

import typings.tweenJs.anon.In
import typings.tweenJs.anon.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Easing extends js.Object {
  var Back: In = js.native
  var Bounce: In = js.native
  var Circular: In = js.native
  var Cubic: In = js.native
  var Elastic: In = js.native
  var Exponential: In = js.native
  var Linear: None = js.native
  var Quadratic: In = js.native
  var Quartic: In = js.native
  var Quintic: In = js.native
  var Sinusoidal: In = js.native
}

object Easing {
  @scala.inline
  def apply(
    Back: In,
    Bounce: In,
    Circular: In,
    Cubic: In,
    Elastic: In,
    Exponential: In,
    Linear: None,
    Quadratic: In,
    Quartic: In,
    Quintic: In,
    Sinusoidal: In
  ): Easing = {
    val __obj = js.Dynamic.literal(Back = Back.asInstanceOf[js.Any], Bounce = Bounce.asInstanceOf[js.Any], Circular = Circular.asInstanceOf[js.Any], Cubic = Cubic.asInstanceOf[js.Any], Elastic = Elastic.asInstanceOf[js.Any], Exponential = Exponential.asInstanceOf[js.Any], Linear = Linear.asInstanceOf[js.Any], Quadratic = Quadratic.asInstanceOf[js.Any], Quartic = Quartic.asInstanceOf[js.Any], Quintic = Quintic.asInstanceOf[js.Any], Sinusoidal = Sinusoidal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  @scala.inline
  implicit class EasingOps[Self <: Easing] (val x: Self) extends AnyVal {
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
    def setBack(value: In): Self = this.set("Back", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounce(value: In): Self = this.set("Bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircular(value: In): Self = this.set("Circular", value.asInstanceOf[js.Any])
    @scala.inline
    def setCubic(value: In): Self = this.set("Cubic", value.asInstanceOf[js.Any])
    @scala.inline
    def setElastic(value: In): Self = this.set("Elastic", value.asInstanceOf[js.Any])
    @scala.inline
    def setExponential(value: In): Self = this.set("Exponential", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinear(value: None): Self = this.set("Linear", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuadratic(value: In): Self = this.set("Quadratic", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuartic(value: In): Self = this.set("Quartic", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuintic(value: In): Self = this.set("Quintic", value.asInstanceOf[js.Any])
    @scala.inline
    def setSinusoidal(value: In): Self = this.set("Sinusoidal", value.asInstanceOf[js.Any])
  }
  
}

