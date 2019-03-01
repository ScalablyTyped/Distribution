package typings
package xssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsClosing extends js.Object {
  var isClosing: scala.Boolean
  var position: scala.Double
}

object Anon_IsClosing {
  @scala.inline
  def apply(isClosing: scala.Boolean, position: scala.Double): Anon_IsClosing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isClosing")(isClosing)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_IsClosing]
  }
}

