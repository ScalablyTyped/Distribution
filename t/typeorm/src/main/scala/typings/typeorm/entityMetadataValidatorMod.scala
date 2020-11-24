package typings.typeorm

import typings.typeorm.driverMod.Driver
import typings.typeorm.entityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/metadata-builder/EntityMetadataValidator", JSImport.Namespace)
@js.native
object entityMetadataValidatorMod extends js.Object {
  
  @js.native
  class EntityMetadataValidator () extends js.Object {
    
    /**
      * Validates given entity metadata.
      */
    def validate(entityMetadata: EntityMetadata, allEntityMetadatas: js.Array[EntityMetadata], driver: Driver): Unit = js.native
    
    /**
      * Validates dependencies of the entity metadatas.
      */
    /* protected */ def validateDependencies(entityMetadatas: js.Array[EntityMetadata]): Unit = js.native
    
    /**
      * Validates eager relations to prevent circular dependency in them.
      */
    /* protected */ def validateEagerRelations(entityMetadatas: js.Array[EntityMetadata]): Unit = js.native
    
    /**
      * Validates all given entity metadatas.
      */
    def validateMany(entityMetadatas: js.Array[EntityMetadata], driver: Driver): Unit = js.native
  }
}
