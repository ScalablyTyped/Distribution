package typings.twilioSync

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncerrorMod {
  
  @JSImport("twilio-sync/lib/utils/syncerror", JSImport.Default)
  @js.native
  class default protected () extends SyncError {
    def this(message: String) = this()
    def this(message: String, status: Double) = this()
    def this(message: String, status: js.UndefOr[scala.Nothing], code: Double) = this()
    def this(message: String, status: Double, code: Double) = this()
  }
  
  @JSImport("twilio-sync/lib/utils/syncerror", "SyncError")
  @js.native
  class SyncError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, status: Double) = this()
    def this(message: String, status: js.UndefOr[scala.Nothing], code: Double) = this()
    def this(message: String, status: Double, code: Double) = this()
    
    var code: Double = js.native
    
    var status: Double = js.native
  }
  
  @JSImport("twilio-sync/lib/utils/syncerror", "SyncNetworkError")
  @js.native
  class SyncNetworkError protected () extends SyncError {
    def this(message: String, status: Double, code: Double, body: js.Any) = this()
    
    var body: js.Any = js.native
  }
}
