package typings.velocityDashAnimate

import typings.velocityDashAnimate.jquery.velocity.VelocityStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var Velocity: VelocityStatic
}

object JQueryStatic {
  @scala.inline
  def apply(Velocity: VelocityStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(Velocity = Velocity)
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

