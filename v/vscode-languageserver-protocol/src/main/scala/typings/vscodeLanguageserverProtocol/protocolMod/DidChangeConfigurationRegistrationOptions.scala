package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidChangeConfigurationRegistrationOptions extends js.Object {
  var section: js.UndefOr[String | js.Array[String]] = js.native
}

object DidChangeConfigurationRegistrationOptions {
  @scala.inline
  def apply(): DidChangeConfigurationRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DidChangeConfigurationRegistrationOptions]
  }
  @scala.inline
  implicit class DidChangeConfigurationRegistrationOptionsOps[Self <: DidChangeConfigurationRegistrationOptions] (val x: Self) extends AnyVal {
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
    def setSectionVarargs(value: String*): Self = this.set("section", js.Array(value :_*))
    @scala.inline
    def setSection(value: String | js.Array[String]): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
  }
  
}

