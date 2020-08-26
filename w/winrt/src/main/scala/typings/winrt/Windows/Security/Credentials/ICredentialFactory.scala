package typings.winrt.Windows.Security.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICredentialFactory extends js.Object {
  def createPasswordCredential(resource: String, userName: String, password: String): PasswordCredential = js.native
}

object ICredentialFactory {
  @scala.inline
  def apply(createPasswordCredential: (String, String, String) => PasswordCredential): ICredentialFactory = {
    val __obj = js.Dynamic.literal(createPasswordCredential = js.Any.fromFunction3(createPasswordCredential))
    __obj.asInstanceOf[ICredentialFactory]
  }
  @scala.inline
  implicit class ICredentialFactoryOps[Self <: ICredentialFactory] (val x: Self) extends AnyVal {
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
    def setCreatePasswordCredential(value: (String, String, String) => PasswordCredential): Self = this.set("createPasswordCredential", js.Any.fromFunction3(value))
  }
  
}

