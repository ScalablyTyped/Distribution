package typings.typeorm

import typings.std.Error
import typings.typeorm.entityTargetMod.EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMetadataNotFoundErrorMod {
  
  @JSImport("typeorm/browser/error/EntityMetadataNotFoundError", "EntityMetadataNotFoundError")
  @js.native
  class EntityMetadataNotFoundError protected ()
    extends StObject
       with Error {
    def this(target: EntityTarget[js.Any]) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
