package typings.typeorm

import typings.std.Error
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorInitializedRelationErrorMod {
  
  @JSImport("typeorm/error/InitializedRelationError", "InitializedRelationError")
  @js.native
  class InitializedRelationError protected ()
    extends StObject
       with Error {
    def this(relation: RelationMetadata) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
