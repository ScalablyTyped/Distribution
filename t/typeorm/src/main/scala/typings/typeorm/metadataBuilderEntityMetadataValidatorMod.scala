package typings.typeorm

import typings.typeorm.driverDriverMod.Driver
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataBuilderEntityMetadataValidatorMod {
  
  @JSImport("typeorm/metadata-builder/EntityMetadataValidator", "EntityMetadataValidator")
  @js.native
  class EntityMetadataValidator () extends StObject {
    
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
