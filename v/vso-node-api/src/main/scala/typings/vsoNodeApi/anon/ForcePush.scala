package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForcePush extends js.Object {
  var create: scala.Double
  var forcePush: scala.Double
  var push: scala.Double
  var rebase: scala.Double
  var unknown: scala.Double
}

object ForcePush {
  @scala.inline
  def apply(
    create: scala.Double,
    forcePush: scala.Double,
    push: scala.Double,
    rebase: scala.Double,
    unknown: scala.Double
  ): ForcePush = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], forcePush = forcePush.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rebase = rebase.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcePush]
  }
}

