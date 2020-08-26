package typings.tannin.mod

import typings.std.TimerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TanninDomainMetadata extends js.Object {
  /**
    * Domain name.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Language code.
    */
  var lang: js.UndefOr[String] = js.native
  /**
    * Plural forms expression or
    *  function evaluator.
    */
  var plural_forms: js.UndefOr[TimerHandler] = js.native
}

object TanninDomainMetadata {
  @scala.inline
  def apply(): TanninDomainMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TanninDomainMetadata]
  }
  @scala.inline
  implicit class TanninDomainMetadataOps[Self <: TanninDomainMetadata] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setPlural_forms(value: TimerHandler): Self = this.set("plural_forms", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlural_forms: Self = this.set("plural_forms", js.undefined)
  }
  
}

