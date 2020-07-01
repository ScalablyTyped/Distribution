package typings.tlsKeygen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls-keygen", "ephemeral")
@js.native
object ephemeral extends js.Object {
  def apply(options: KeyGenOptions): js.Promise[EphemeralResult] = js.native
}

