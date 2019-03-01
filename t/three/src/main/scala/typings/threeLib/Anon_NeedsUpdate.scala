package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NeedsUpdate extends js.Object {
  var needsUpdate: scala.Boolean
  var value: js.Any
}

object Anon_NeedsUpdate {
  @scala.inline
  def apply(needsUpdate: scala.Boolean, value: js.Any): Anon_NeedsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("needsUpdate")(needsUpdate)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_NeedsUpdate]
  }
}

