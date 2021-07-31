package typings.typeorm

import typings.typeorm.entityManagerEntityManagerMod.EntityManager
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.repositoryRepositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryRepositoryFactoryMod {
  
  @JSImport("typeorm/repository/RepositoryFactory", "RepositoryFactory")
  @js.native
  class RepositoryFactory () extends StObject {
    
    /**
      * Creates a repository.
      */
    def create(manager: EntityManager, metadata: EntityMetadata): Repository[js.Any] = js.native
    def create(manager: EntityManager, metadata: EntityMetadata, queryRunner: QueryRunner): Repository[js.Any] = js.native
  }
}
