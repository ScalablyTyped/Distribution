package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default extends js.Object {
  var custom: scala.Double = js.native
  var default: scala.Double = js.native
  var upgrade: scala.Double = js.native
}

object Default {
  @scala.inline
  def apply(custom: scala.Double, default: scala.Double, upgrade: scala.Double): Default = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
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
    def setCustom(value: scala.Double): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: scala.Double): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpgrade(value: scala.Double): Self = this.set("upgrade", value.asInstanceOf[js.Any])
  }
  
}

