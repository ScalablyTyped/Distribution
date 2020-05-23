package typings.tweenJs

import typings.tweenJs.anon.In
import typings.tweenJs.anon.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Easing extends js.Object {
  var Back: In
  var Bounce: In
  var Circular: In
  var Cubic: In
  var Elastic: In
  var Exponential: In
  var Linear: None
  var Quadratic: In
  var Quartic: In
  var Quintic: In
  var Sinusoidal: In
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
}

