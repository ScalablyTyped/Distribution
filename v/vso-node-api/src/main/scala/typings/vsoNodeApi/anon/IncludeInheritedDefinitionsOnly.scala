package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeInheritedDefinitionsOnly extends js.Object {
  var includeInheritedDefinitionsOnly: scala.Double = js.native
  var includeLastUserAccess: scala.Double = js.native
  var includeNonInheritedDefinitionsOnly: scala.Double = js.native
  var includeServices: scala.Double = js.native
  var none: scala.Double = js.native
}

object IncludeInheritedDefinitionsOnly {
  @scala.inline
  def apply(
    includeInheritedDefinitionsOnly: scala.Double,
    includeLastUserAccess: scala.Double,
    includeNonInheritedDefinitionsOnly: scala.Double,
    includeServices: scala.Double,
    none: scala.Double
  ): IncludeInheritedDefinitionsOnly = {
    val __obj = js.Dynamic.literal(includeInheritedDefinitionsOnly = includeInheritedDefinitionsOnly.asInstanceOf[js.Any], includeLastUserAccess = includeLastUserAccess.asInstanceOf[js.Any], includeNonInheritedDefinitionsOnly = includeNonInheritedDefinitionsOnly.asInstanceOf[js.Any], includeServices = includeServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeInheritedDefinitionsOnly]
  }
  @scala.inline
  implicit class IncludeInheritedDefinitionsOnlyOps[Self <: IncludeInheritedDefinitionsOnly] (val x: Self) extends AnyVal {
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
    def setIncludeInheritedDefinitionsOnly(value: scala.Double): Self = this.set("includeInheritedDefinitionsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeLastUserAccess(value: scala.Double): Self = this.set("includeLastUserAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeNonInheritedDefinitionsOnly(value: scala.Double): Self = this.set("includeNonInheritedDefinitionsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeServices(value: scala.Double): Self = this.set("includeServices", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
  
}

