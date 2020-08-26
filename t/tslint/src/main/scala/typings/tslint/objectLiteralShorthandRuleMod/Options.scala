package typings.tslint.objectLiteralShorthandRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var enforceShorthandMethods: Boolean = js.native
  var enforceShorthandProperties: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(enforceShorthandMethods: Boolean, enforceShorthandProperties: Boolean): Options = {
    val __obj = js.Dynamic.literal(enforceShorthandMethods = enforceShorthandMethods.asInstanceOf[js.Any], enforceShorthandProperties = enforceShorthandProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setEnforceShorthandMethods(value: Boolean): Self = this.set("enforceShorthandMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnforceShorthandProperties(value: Boolean): Self = this.set("enforceShorthandProperties", value.asInstanceOf[js.Any])
  }
  
}

