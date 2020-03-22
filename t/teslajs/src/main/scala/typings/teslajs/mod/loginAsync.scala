package typings.teslajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teslajs", "loginAsync")
@js.native
object loginAsync extends js.Object {
  def apply(username: String, password: String): js.Promise[TokenResponse] = js.native
}

