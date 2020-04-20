package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInherited extends js.Object {
  var custom: Double
  var inherited: Double
  var system: Double
}

object AnonInherited {
  @scala.inline
  def apply(custom: Double, inherited: Double, system: Double): AnonInherited = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInherited]
  }
}

