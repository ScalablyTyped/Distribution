package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreAcceleratorKeys extends js.Object {
  var onacceleratorkeyactivated: js.Any = js.native
}

object ICoreAcceleratorKeys {
  @scala.inline
  def apply(onacceleratorkeyactivated: js.Any): ICoreAcceleratorKeys = {
    val __obj = js.Dynamic.literal(onacceleratorkeyactivated = onacceleratorkeyactivated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreAcceleratorKeys]
  }
  @scala.inline
  implicit class ICoreAcceleratorKeysOps[Self <: ICoreAcceleratorKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnacceleratorkeyactivated(value: js.Any): Self = this.set("onacceleratorkeyactivated", value.asInstanceOf[js.Any])
  }
  
}

