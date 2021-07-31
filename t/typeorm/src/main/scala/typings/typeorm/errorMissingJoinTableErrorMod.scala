package typings.typeorm

import typings.std.Error
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMissingJoinTableErrorMod {
  
  @JSImport("typeorm/error/MissingJoinTableError", "MissingJoinTableError")
  @js.native
  class MissingJoinTableError protected ()
    extends StObject
       with Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
