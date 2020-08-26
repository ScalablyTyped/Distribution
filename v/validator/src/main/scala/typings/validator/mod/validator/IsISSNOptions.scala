package typings.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsISSNOptions extends js.Object {
  /**
    * If `case_sensitive` is `true`, ISSNs with a lowercase `x` as the check digit are rejected.
    *
    * @default false
    */
  var case_sensitive: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var require_hyphen: js.UndefOr[Boolean] = js.native
}

object IsISSNOptions {
  @scala.inline
  def apply(): IsISSNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsISSNOptions]
  }
  @scala.inline
  implicit class IsISSNOptionsOps[Self <: IsISSNOptions] (val x: Self) extends AnyVal {
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
    def setCase_sensitive(value: Boolean): Self = this.set("case_sensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCase_sensitive: Self = this.set("case_sensitive", js.undefined)
    @scala.inline
    def setRequire_hyphen(value: Boolean): Self = this.set("require_hyphen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire_hyphen: Self = this.set("require_hyphen", js.undefined)
  }
  
}

