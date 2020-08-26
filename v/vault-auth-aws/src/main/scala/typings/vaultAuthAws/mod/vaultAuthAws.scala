package typings.vaultAuthAws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait vaultAuthAws extends js.Object {
  def authenticate(): js.Promise[_] = js.native
  def getOptions(creds: Creds): Options = js.native
}

object vaultAuthAws {
  @scala.inline
  def apply(authenticate: () => js.Promise[_], getOptions: Creds => Options): vaultAuthAws = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), getOptions = js.Any.fromFunction1(getOptions))
    __obj.asInstanceOf[vaultAuthAws]
  }
  @scala.inline
  implicit class vaultAuthAwsOps[Self <: vaultAuthAws] (val x: Self) extends AnyVal {
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
    def setAuthenticate(value: () => js.Promise[_]): Self = this.set("authenticate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOptions(value: Creds => Options): Self = this.set("getOptions", js.Any.fromFunction1(value))
  }
  
}

