package typings.twilioSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/clientInfo", JSImport.Namespace)
@js.native
object clientInfoMod extends js.Object {
  @js.native
  class ClientInfo protected () extends js.Object {
    def this(version: String) = this()
    var os: String = js.native
    var osVer: String = js.native
    var pl: String = js.native
    var plVer: String = js.native
    var sdk: String = js.native
    var sdkVer: String = js.native
  }
  
  @js.native
  class default protected () extends ClientInfo {
    def this(version: String) = this()
  }
  
}

