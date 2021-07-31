package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorCannotConnectAlreadyConnectedErrorMod {
  
  @JSImport("typeorm/error/CannotConnectAlreadyConnectedError", "CannotConnectAlreadyConnectedError")
  @js.native
  class CannotConnectAlreadyConnectedError protected ()
    extends StObject
       with Error {
    def this(connectionName: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
