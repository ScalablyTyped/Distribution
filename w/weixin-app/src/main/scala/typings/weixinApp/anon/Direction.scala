package typings.weixinApp.anon

import typings.weixinApp.weixinAppNumbers.`-90`
import typings.weixinApp.weixinAppNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: typings.weixinApp.weixinAppNumbers.`0` | `90` | `-90`
}

object Direction {
  @scala.inline
  def apply(direction: typings.weixinApp.weixinAppNumbers.`0` | `90` | `-90`): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

