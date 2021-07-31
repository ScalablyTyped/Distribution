package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularRelationsErrorMod {
  
  @JSImport("typeorm/browser/error/CircularRelationsError", "CircularRelationsError")
  @js.native
  class CircularRelationsError protected ()
    extends StObject
       with Error {
    def this(path: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
