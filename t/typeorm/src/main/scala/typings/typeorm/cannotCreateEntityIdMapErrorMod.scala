package typings.typeorm

import typings.std.Error
import typings.typeorm.entityMetadataMod.EntityMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cannotCreateEntityIdMapErrorMod {
  
  @JSImport("typeorm/browser/error/CannotCreateEntityIdMapError", "CannotCreateEntityIdMapError")
  @js.native
  class CannotCreateEntityIdMapError protected ()
    extends StObject
       with Error {
    def this(metadata: EntityMetadata, id: js.Any) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
