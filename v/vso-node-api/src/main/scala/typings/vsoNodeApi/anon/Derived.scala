package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Derived extends js.Object {
  var custom: scala.Double = js.native
  var derived: scala.Double = js.native
  var system: scala.Double = js.native
}

object Derived {
  @scala.inline
  def apply(custom: scala.Double, derived: scala.Double, system: scala.Double): Derived = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], derived = derived.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Derived]
  }
  @scala.inline
  implicit class DerivedOps[Self <: Derived] (val x: Self) extends AnyVal {
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
    def setDerived(value: scala.Double): Self = this.set("derived", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystem(value: scala.Double): Self = this.set("system", value.asInstanceOf[js.Any])
  }
  
}

