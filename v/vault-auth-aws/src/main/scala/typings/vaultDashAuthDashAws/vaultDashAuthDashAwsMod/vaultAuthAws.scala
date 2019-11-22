package typings.vaultDashAuthDashAws.vaultDashAuthDashAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait vaultAuthAws extends js.Object {
  def authenticate(): js.Promise[_]
  def getOptions(creds: Creds): Options
}

object vaultAuthAws {
  @scala.inline
  def apply(authenticate: () => js.Promise[_], getOptions: Creds => Options): vaultAuthAws = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), getOptions = js.Any.fromFunction1(getOptions))
  
    __obj.asInstanceOf[vaultAuthAws]
  }
}

