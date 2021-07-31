package typings.typeorm

import typings.std.Error
import typings.typeorm.commonEntityTargetMod.EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorEntityNotFoundErrorMod {
  
  @JSImport("typeorm/error/EntityNotFoundError", "EntityNotFoundError")
  @js.native
  class EntityNotFoundError protected ()
    extends StObject
       with Error {
    def this(entityClass: EntityTarget[js.Any], criteria: js.Any) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var stringifyCriteria: js.Any = js.native
  }
}
