package typings.tsEssentials.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TYPE[K] extends js.Object {
  var __TYPE__ : K
}

object TYPE {
  @scala.inline
  def apply[K](__TYPE__ : K): TYPE[K] = {
    val __obj = js.Dynamic.literal(__TYPE__ = __TYPE__.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYPE[K]]
  }
}

