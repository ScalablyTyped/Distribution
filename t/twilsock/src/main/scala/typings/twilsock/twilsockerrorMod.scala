package typings.twilsock

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilsockerrorMod {
  
  @JSImport("twilsock/lib/error/twilsockerror", "TwilsockError")
  @js.native
  class TwilsockError protected ()
    extends StObject
       with Error {
    def this(description: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
