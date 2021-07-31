package typings.twilioSync

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncerrorMod {
  
  @JSImport("twilio-sync/lib/utils/syncerror", JSImport.Default)
  @js.native
  class default protected () extends SyncError {
    def this(message: String) = this()
    def this(message: String, status: Double) = this()
    def this(message: String, status: Double, code: Double) = this()
    def this(message: String, status: Unit, code: Double) = this()
  }
  
  @JSImport("twilio-sync/lib/utils/syncerror", "SyncError")
  @js.native
  class SyncError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, status: Double) = this()
    def this(message: String, status: Double, code: Double) = this()
    def this(message: String, status: Unit, code: Double) = this()
    
    var code: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var status: Double = js.native
  }
  
  @JSImport("twilio-sync/lib/utils/syncerror", "SyncNetworkError")
  @js.native
  class SyncNetworkError protected () extends SyncError {
    def this(message: String, status: Double, code: Double, body: js.Any) = this()
    
    var body: js.Any = js.native
  }
}
