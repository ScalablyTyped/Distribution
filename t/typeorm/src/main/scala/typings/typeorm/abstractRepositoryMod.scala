package typings.typeorm

import typings.typeorm.entityManagerMod.EntityManager
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.objectTypeMod.ObjectType
import typings.typeorm.repositoryMod.Repository
import typings.typeorm.selectQueryBuilderMod.SelectQueryBuilder
import typings.typeorm.treeRepositoryMod.TreeRepository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractRepositoryMod {
  
  @JSImport("typeorm/browser/repository/AbstractRepository", "AbstractRepository")
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
    var getCustomRepositoryTarget: js.Any = js.native
    
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
    var manager: EntityManager = js.native
    
    /**
      * Gets the original ORM repository for the entity that is managed by this repository.
      * If current repository does not manage any entity, then exception will be thrown.
      */
    val repository: Repository[Entity] = js.native
    
    /**
      * Gets the original ORM tree repository for the entity that is managed by this repository.
      * If current repository does not manage any entity, then exception will be thrown.
      */
    val treeRepository: TreeRepository[Entity] = js.native
  }
}
