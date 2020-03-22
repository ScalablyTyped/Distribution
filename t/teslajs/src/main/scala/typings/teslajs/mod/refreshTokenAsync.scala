package typings.teslajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teslajs", "refreshTokenAsync")
@js.native
object refreshTokenAsync extends js.Object {
  def apply(refresh_token: String): js.Promise[TokenResponse] = js.native
}

