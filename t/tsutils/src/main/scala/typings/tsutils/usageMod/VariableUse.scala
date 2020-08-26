package typings.tsutils.usageMod

import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableUse extends js.Object {
  var domain: UsageDomain = js.native
  var location: Identifier = js.native
}

object VariableUse {
  @scala.inline
  def apply(domain: UsageDomain, location: Identifier): VariableUse = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableUse]
  }
  @scala.inline
  implicit class VariableUseOps[Self <: VariableUse] (val x: Self) extends AnyVal {
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
    def setDomain(value: UsageDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Identifier): Self = this.set("location", value.asInstanceOf[js.Any])
  }
  
}

