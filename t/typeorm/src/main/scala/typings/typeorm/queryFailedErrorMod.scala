package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryFailedErrorMod {
  
  @JSImport("typeorm/browser/error/QueryFailedError", "QueryFailedError")
  @js.native
  class QueryFailedError protected ()
    extends StObject
       with Error {
    def this(query: String, parameters: js.Array[js.Any], driverError: js.Any) = this()
    def this(query: String, parameters: Unit, driverError: js.Any) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
