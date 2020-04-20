package typings.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpaque extends js.Object {
  val __opaque__ : js.Symbol
}

object AnonOpaque {
  @scala.inline
  def apply(__opaque__ : js.Symbol): AnonOpaque = {
    val __obj = js.Dynamic.literal(__opaque__ = __opaque__.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpaque]
  }
}

