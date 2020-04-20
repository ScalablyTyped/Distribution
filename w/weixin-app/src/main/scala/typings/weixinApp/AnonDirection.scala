package typings.weixinApp

import typings.weixinApp.weixinAppNumbers.`-90`
import typings.weixinApp.weixinAppNumbers.`0`
import typings.weixinApp.weixinAppNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: `0` | `90` | `-90`
}

object AnonDirection {
  @scala.inline
  def apply(direction: `0` | `90` | `-90`): AnonDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
}

