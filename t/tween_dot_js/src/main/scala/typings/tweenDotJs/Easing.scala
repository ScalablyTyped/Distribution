package typings.tweenDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Easing extends js.Object {
  var Back: Anon_In
  var Bounce: Anon_In
  var Circular: Anon_In
  var Cubic: Anon_In
  var Elastic: Anon_In
  var Exponential: Anon_In
  var Linear: Anon_K
  var Quadratic: Anon_In
  var Quartic: Anon_In
  var Quintic: Anon_In
  var Sinusoidal: Anon_In
}

object Easing {
  @scala.inline
  def apply(
    Back: Anon_In,
    Bounce: Anon_In,
    Circular: Anon_In,
    Cubic: Anon_In,
    Elastic: Anon_In,
    Exponential: Anon_In,
    Linear: Anon_K,
    Quadratic: Anon_In,
    Quartic: Anon_In,
    Quintic: Anon_In,
    Sinusoidal: Anon_In
  ): Easing = {
    val __obj = js.Dynamic.literal(Back = Back, Bounce = Bounce, Circular = Circular, Cubic = Cubic, Elastic = Elastic, Exponential = Exponential, Linear = Linear, Quadratic = Quadratic, Quartic = Quartic, Quintic = Quintic, Sinusoidal = Sinusoidal)
  
    __obj.asInstanceOf[Easing]
  }
}

