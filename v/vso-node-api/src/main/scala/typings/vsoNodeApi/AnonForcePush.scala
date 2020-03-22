package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForcePush extends js.Object {
  var create: Double
  var forcePush: Double
  var push: Double
  var rebase: Double
  var unknown: Double
}

object AnonForcePush {
  @scala.inline
  def apply(create: Double, forcePush: Double, push: Double, rebase: Double, unknown: Double): AnonForcePush = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], forcePush = forcePush.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rebase = rebase.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonForcePush]
  }
}

