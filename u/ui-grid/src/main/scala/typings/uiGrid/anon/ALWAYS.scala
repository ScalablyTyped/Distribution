package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALWAYS extends js.Object {
  var ALWAYS: Double
  var NEVER: Double
  var WHEN_NEEDED: Double
}

object ALWAYS {
  @scala.inline
  def apply(ALWAYS: Double, NEVER: Double, WHEN_NEEDED: Double): ALWAYS = {
    val __obj = js.Dynamic.literal(ALWAYS = ALWAYS.asInstanceOf[js.Any], NEVER = NEVER.asInstanceOf[js.Any], WHEN_NEEDED = WHEN_NEEDED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALWAYS]
  }
}

