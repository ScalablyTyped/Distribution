package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadDriver extends js.Object {
  var flash: js.Any
  var html5: js.Any
}

object UploadDriver {
  @scala.inline
  def apply(flash: js.Any, html5: js.Any): UploadDriver = {
    val __obj = js.Dynamic.literal(flash = flash, html5 = html5)
  
    __obj.asInstanceOf[UploadDriver]
  }
}

