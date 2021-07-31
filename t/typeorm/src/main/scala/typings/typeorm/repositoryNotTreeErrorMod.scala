package typings.typeorm

import typings.std.Error
import typings.typeorm.entityTargetMod.EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryNotTreeErrorMod {
  
  @JSImport("typeorm/browser/error/RepositoryNotTreeError", "RepositoryNotTreeError")
  @js.native
  class RepositoryNotTreeError protected ()
    extends StObject
       with Error {
    def this(entityClass: EntityTarget[js.Any]) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
