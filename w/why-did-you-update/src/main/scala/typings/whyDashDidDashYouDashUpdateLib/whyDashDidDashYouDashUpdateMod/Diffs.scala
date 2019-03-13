package typings
package whyDashDidDashYouDashUpdateLib.whyDashDidDashYouDashUpdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diffs extends js.Object {
  var name: java.lang.String
  var next: js.Any
  var prev: js.Any
  var `type`: js.Any
}

object Diffs {
  @scala.inline
  def apply(name: java.lang.String, next: js.Any, prev: js.Any, `type`: js.Any): Diffs = {
    val __obj = js.Dynamic.literal(name = name, next = next, prev = prev)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Diffs]
  }
}

