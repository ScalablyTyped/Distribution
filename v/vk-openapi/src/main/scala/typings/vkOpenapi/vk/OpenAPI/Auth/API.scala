package typings.vkOpenapi.vk.OpenAPI.Auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait API extends js.Object {
  def getLoginStatus(cb: js.Function1[/* status */ LoginStatus, Unit]): Unit
  def getSession(cb: js.Function1[/* session */ Session, Unit]): Unit
  def login(cb: js.Function1[/* status */ LoginStatus, Unit], settings: Double): Unit
  def logout(cb: js.Function1[/* status */ EmptyLoginStatus, Unit]): Unit
  def revokeGrants(cb: js.Function1[/* status */ EmptyLoginStatus, Unit]): Unit
}

object API {
  @scala.inline
  def apply(
    getLoginStatus: js.Function1[/* status */ LoginStatus, Unit] => Unit,
    getSession: js.Function1[/* session */ Session, Unit] => Unit,
    login: (js.Function1[/* status */ LoginStatus, Unit], Double) => Unit,
    logout: js.Function1[/* status */ EmptyLoginStatus, Unit] => Unit,
    revokeGrants: js.Function1[/* status */ EmptyLoginStatus, Unit] => Unit
  ): API = {
    val __obj = js.Dynamic.literal(getLoginStatus = js.Any.fromFunction1(getLoginStatus), getSession = js.Any.fromFunction1(getSession), login = js.Any.fromFunction2(login), logout = js.Any.fromFunction1(logout), revokeGrants = js.Any.fromFunction1(revokeGrants))
    __obj.asInstanceOf[API]
  }
}

