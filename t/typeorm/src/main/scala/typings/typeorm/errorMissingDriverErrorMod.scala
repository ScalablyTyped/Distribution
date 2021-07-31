package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMissingDriverErrorMod {
  
  @JSImport("typeorm/error/MissingDriverError", "MissingDriverError")
  @js.native
  class MissingDriverError protected ()
    extends StObject
       with Error {
    def this(driverType: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
