package typings.tsEssentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTYPE[K] extends js.Object {
  var __TYPE__ : K
}

object AnonTYPE {
  @scala.inline
  def apply[K](__TYPE__ : K): AnonTYPE[K] = {
    val __obj = js.Dynamic.literal(__TYPE__ = __TYPE__.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTYPE[K]]
  }
}

