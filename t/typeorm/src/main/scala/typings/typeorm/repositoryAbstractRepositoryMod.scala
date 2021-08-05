package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.commonObjectTypeMod.ObjectType
import typings.typeorm.entityManagerEntityManagerMod.EntityManager
import typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import typings.typeorm.repositoryRepositoryMod.Repository
import typings.typeorm.repositoryTreeRepositoryMod.TreeRepository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryAbstractRepositoryMod {
  
  @JSImport("typeorm/repository/AbstractRepository", "AbstractRepository")
  @js.native
  class AbstractRepository[Entity /* <: ObjectLiteral */] () extends StObject {
    
    /**
      * Creates a new query builder for the repository's entity that can be used to build a sql query.
      * If current repository does not manage any entity, then exception will be thrown.
      */
    /* protected */ def createQueryBuilder(alias: String): SelectQueryBuilder[Entity] = js.native
    
    /**
      * Creates a new query builder for the given entity that can be used to build a sql query.
      */
    /* protected */ def createQueryBuilderFor[T](entity: ObjectType[T], alias: String): SelectQueryBuilder[T] = js.native
    
    /**
      * Gets custom repository's managed entity.
      * If given custom repository does not manage any entity then undefined will be returned.
      */
    /* private */ var getCustomRepositoryTarget: js.Any = js.native
    
    /**
      * Gets the original ORM repository for the given entity class.
      */
    /* protected */ def getRepositoryFor[T](entity: ObjectType[T]): Repository[T] = js.native
    
    /**
      * Gets the original ORM tree repository for the given entity class.
      */
    /* protected */ def getTreeRepositoryFor[T](entity: ObjectType[T]): TreeRepository[T] = js.native
    
    /**
      * Gets entity manager that allows to perform repository operations with any entity.
      */
    /* protected */ var manager: EntityManager = js.native
    
    /**
      * Gets the original ORM repository for the entity that is managed by this repository.
      * If current repository does not manage any entity, then exception will be thrown.
      */
    /* protected */ val repository: Repository[Entity] = js.native
    
    /**
      * Gets the original ORM tree repository for the entity that is managed by this repository.
      * If current repository does not manage any entity, then exception will be thrown.
      */
    /* protected */ val treeRepository: TreeRepository[Entity] = js.native
  }
}
