package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateForcePush extends js.Object {
  var create: scala.Double
  var forcePush: scala.Double
  var push: scala.Double
  var rebase: scala.Double
  var unknown: scala.Double
}

object Anon_CreateForcePush {
  @scala.inline
  def apply(
    create: scala.Double,
    forcePush: scala.Double,
    push: scala.Double,
    rebase: scala.Double,
    unknown: scala.Double
  ): Anon_CreateForcePush = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("forcePush")(forcePush)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("rebase")(rebase)
    __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[Anon_CreateForcePush]
  }
}

