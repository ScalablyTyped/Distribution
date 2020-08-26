package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicRegistration extends js.Object {
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}

object DynamicRegistration {
  @scala.inline
  def apply(): DynamicRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicRegistration]
  }
  @scala.inline
  implicit class DynamicRegistrationOps[Self <: DynamicRegistration] (val x: Self) extends AnyVal {
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
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
  }
  
}

