package typings.tlsKeygen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tls-keygen", "keygen")
@js.native
object keygen extends js.Object {
  
  def apply(options: KeyGenOptions): js.Promise[KeyGenResult] = js.native
}
