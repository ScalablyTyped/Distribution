package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeInjection extends js.Object {
  var codeinjection_foot: js.UndefOr[Nullable[String]] = js.native
  var codeinjection_head: js.UndefOr[Nullable[String]] = js.native
}

object CodeInjection {
  @scala.inline
  def apply(): CodeInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeInjection]
  }
  @scala.inline
  implicit class CodeInjectionOps[Self <: CodeInjection] (val x: Self) extends AnyVal {
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
    def setCodeinjection_foot(value: Nullable[String]): Self = this.set("codeinjection_foot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeinjection_foot: Self = this.set("codeinjection_foot", js.undefined)
    @scala.inline
    def setCodeinjection_footNull: Self = this.set("codeinjection_foot", null)
    @scala.inline
    def setCodeinjection_head(value: Nullable[String]): Self = this.set("codeinjection_head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeinjection_head: Self = this.set("codeinjection_head", js.undefined)
    @scala.inline
    def setCodeinjection_headNull: Self = this.set("codeinjection_head", null)
  }
  
}

