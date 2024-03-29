package typings.typeorm

import typings.std.Error
import typings.typeorm.commonEntityTargetMod.EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorRepositoryNotFoundErrorMod {
  
  @JSImport("typeorm/error/RepositoryNotFoundError", "RepositoryNotFoundError")
  @js.native
  class RepositoryNotFoundError protected ()
    extends StObject
       with Error {
    def this(connectionName: String, entityClass: EntityTarget[js.Any]) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
