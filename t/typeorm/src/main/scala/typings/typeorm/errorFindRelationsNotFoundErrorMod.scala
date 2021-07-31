package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorFindRelationsNotFoundErrorMod {
  
  @JSImport("typeorm/error/FindRelationsNotFoundError", "FindRelationsNotFoundError")
  @js.native
  class FindRelationsNotFoundError protected ()
    extends StObject
       with Error {
    def this(notFoundRelations: js.Array[String]) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
