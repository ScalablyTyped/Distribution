package typings.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Easing extends js.Object {
  var Back: AnonIn
  var Bounce: AnonIn
  var Circular: AnonIn
  var Cubic: AnonIn
  var Elastic: AnonIn
  var Exponential: AnonIn
  var Linear: AnonNone
  var Quadratic: AnonIn
  var Quartic: AnonIn
  var Quintic: AnonIn
  var Sinusoidal: AnonIn
}

object Easing {
  @scala.inline
  def apply(
    Back: AnonIn,
    Bounce: AnonIn,
    Circular: AnonIn,
    Cubic: AnonIn,
    Elastic: AnonIn,
    Exponential: AnonIn,
    Linear: AnonNone,
    Quadratic: AnonIn,
    Quartic: AnonIn,
    Quintic: AnonIn,
    Sinusoidal: AnonIn
  ): Easing = {
    val __obj = js.Dynamic.literal(Back = Back.asInstanceOf[js.Any], Bounce = Bounce.asInstanceOf[js.Any], Circular = Circular.asInstanceOf[js.Any], Cubic = Cubic.asInstanceOf[js.Any], Elastic = Elastic.asInstanceOf[js.Any], Exponential = Exponential.asInstanceOf[js.Any], Linear = Linear.asInstanceOf[js.Any], Quadratic = Quadratic.asInstanceOf[js.Any], Quartic = Quartic.asInstanceOf[js.Any], Quintic = Quintic.asInstanceOf[js.Any], Sinusoidal = Sinusoidal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Easing]
  }
}

