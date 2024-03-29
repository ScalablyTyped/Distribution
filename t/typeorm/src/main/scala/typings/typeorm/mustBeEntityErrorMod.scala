package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mustBeEntityErrorMod {
  
  @JSImport("typeorm/browser/error/MustBeEntityError", "MustBeEntityError")
  @js.native
  class MustBeEntityError protected ()
    extends StObject
       with Error {
    def this(operation: String, wrongValue: js.Any) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
