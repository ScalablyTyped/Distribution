package typings.typeorm

import typings.std.Error
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.relationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usingJoinColumnOnlyOnOneSideAllowedErrorMod {
  
  @JSImport("typeorm/browser/error/UsingJoinColumnOnlyOnOneSideAllowedError", "UsingJoinColumnOnlyOnOneSideAllowedError")
  @js.native
  class UsingJoinColumnOnlyOnOneSideAllowedError protected ()
    extends StObject
       with Error {
    def this(entityMetadata: EntityMetadata, relation: RelationMetadata) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
