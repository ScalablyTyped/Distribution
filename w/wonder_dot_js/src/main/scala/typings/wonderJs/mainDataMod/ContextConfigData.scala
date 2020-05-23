package typings.wonderJs.mainDataMod

import typings.wonderJs.anon.Alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextConfigData extends js.Object {
  var options: Alpha
}

object ContextConfigData {
  @scala.inline
  def apply(options: Alpha): ContextConfigData = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextConfigData]
  }
}

