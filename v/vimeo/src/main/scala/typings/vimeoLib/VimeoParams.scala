package typings
package vimeoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VimeoParams extends js.Object {
  var name: java.lang.String
  var value: js.Any
}

object VimeoParams {
  @scala.inline
  def apply(name: java.lang.String, value: js.Any): VimeoParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[VimeoParams]
  }
}

