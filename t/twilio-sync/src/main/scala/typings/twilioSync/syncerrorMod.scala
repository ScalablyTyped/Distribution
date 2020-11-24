package typings.twilioSync

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-sync/lib/utils/syncerror", JSImport.Namespace)
@js.native
object syncerrorMod extends js.Object {
  
  @js.native
  class SyncError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, status: Double) = this()
    def this(message: String, status: js.UndefOr[scala.Nothing], code: Double) = this()
    def this(message: String, status: Double, code: Double) = this()
    
    var code: Double = js.native
    
    var status: Double = js.native
  }
  
  @js.native
  class SyncNetworkError protected () extends SyncError {
    def this(message: String, status: Double, code: Double, body: js.Any) = this()
    
    var body: js.Any = js.native
  }
  
  @js.native
  class default protected () extends SyncError {
    def this(message: String) = this()
    def this(message: String, status: Double) = this()
    def this(message: String, status: js.UndefOr[scala.Nothing], code: Double) = this()
    def this(message: String, status: Double, code: Double) = this()
  }
}
