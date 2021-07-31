package typings.webdriverio

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object severeServiceErrorMod {
  
  @JSImport("webdriverio/build/utils/SevereServiceError", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  type SevereServiceError = Error
}
