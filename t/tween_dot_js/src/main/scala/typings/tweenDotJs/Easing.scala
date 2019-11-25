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
    val __obj = js.Dynamic.literal(Back = Back.asInstanceOf[js.Any], Bounce = Bounce.asInstanceOf[js.Any], Circular = Circular.asInstanceOf[js.Any], Cubic = Cubic.asInstanceOf[js.Any], Elastic = Elastic.asInstanceOf[js.Any], Exponential = Exponential.asInstanceOf[js.Any], Linear = Linear.asInstanceOf[js.Any], Quadratic = Quadratic.asInstanceOf[js.Any], Quartic = Quartic.asInstanceOf[js.Any], Quintic = Quintic.asInstanceOf[js.Any], Sinusoidal = Sinusoidal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Easing]
  }
}

