package typings.tlsKeygen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls-keygen", "keygen")
@js.native
object keygen extends js.Object {
  def apply(options: KeyGenOptions): js.Promise[KeyGenResult] = js.native
}

