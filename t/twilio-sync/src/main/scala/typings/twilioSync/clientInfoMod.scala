package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientInfoMod {
  
  @JSImport("twilio-sync/lib/clientInfo", JSImport.Default)
  @js.native
  class default protected () extends ClientInfo {
    def this(version: String) = this()
  }
  
  @JSImport("twilio-sync/lib/clientInfo", "ClientInfo")
  @js.native
  class ClientInfo protected () extends StObject {
    def this(version: String) = this()
    
    var os: String = js.native
    
    var osVer: String = js.native
    
    var pl: String = js.native
    
    var plVer: String = js.native
    
    var sdk: String = js.native
    
    var sdkVer: String = js.native
  }
}
