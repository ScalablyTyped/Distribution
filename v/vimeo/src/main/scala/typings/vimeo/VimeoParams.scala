package typings.vimeo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VimeoParams extends js.Object {
  var name: String
  var value: js.Any
}

object VimeoParams {
  @scala.inline
  def apply(name: String, value: js.Any): VimeoParams = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[VimeoParams]
  }
}

