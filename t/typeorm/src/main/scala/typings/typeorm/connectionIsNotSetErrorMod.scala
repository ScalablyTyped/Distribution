package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionIsNotSetErrorMod {
  
  @JSImport("typeorm/browser/error/ConnectionIsNotSetError", "ConnectionIsNotSetError")
  @js.native
  class ConnectionIsNotSetError protected ()
    extends StObject
       with Error {
    def this(dbType: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
