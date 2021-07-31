package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorNoConnectionForRepositoryErrorMod {
  
  @JSImport("typeorm/error/NoConnectionForRepositoryError", "NoConnectionForRepositoryError")
  @js.native
  class NoConnectionForRepositoryError protected ()
    extends StObject
       with Error {
    def this(connectionName: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
