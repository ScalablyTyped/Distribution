package typings.typeorm

import typings.typeorm.anon.ParentId
import typings.typeorm.repositoryMod.Repository
import typings.typeorm.selectQueryBuilderMod.SelectQueryBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeRepositoryMod {
  
  @JSImport("typeorm/browser/repository/TreeRepository", "TreeRepository")
  @js.native
  class TreeRepository[Entity] () extends Repository[Entity] {
    
    /* protected */ def buildChildrenEntityTree(entity: js.Any, entities: js.Array[_], relationMaps: js.Array[ParentId]): Unit = js.native
    
    /* protected */ def buildParentEntityTree(entity: js.Any, entities: js.Array[_], relationMaps: js.Array[ParentId]): Unit = js.native
    
    /**
      * Gets number of ancestors of the entity.
      */
    def countAncestors(entity: Entity): js.Promise[Double] = js.native
    
    /**
      * Gets number of descendants of the entity.
      */
    def countDescendants(entity: Entity): js.Promise[Double] = js.native
    
    /**
      * Creates a query builder used to get ancestors of the entities in the tree.
      */
    def createAncestorsQueryBuilder(alias: String, closureTableAlias: String, entity: Entity): SelectQueryBuilder[Entity] = js.native
    
    /**
      * Creates a query builder used to get descendants of the entities in a tree.
      */
    def createDescendantsQueryBuilder(alias: String, closureTableAlias: String, entity: Entity): SelectQueryBuilder[Entity] = js.native
    
    /**
      * Moves entity to the children of then given entity.
      *
      move(entity: Entity, to: Entity): Promise<void> {
      return Promise.resolve();
      } */
    /* protected */ def createRelationMaps(alias: String, rawResults: js.Array[_]): js.Array[ParentId] = js.native
    
    /**
      * Gets all parents (ancestors) of the given entity. Returns them all in a flat array.
      */
    def findAncestors(entity: Entity): js.Promise[js.Array[Entity]] = js.native
    
    /**
      * Gets all parents (ancestors) of the given entity. Returns them in a tree - nested into each other.
      */
    def findAncestorsTree(entity: Entity): js.Promise[Entity] = js.native
    
    /**
      * Gets all children (descendants) of the given entity. Returns them all in a flat array.
      */
    def findDescendants(entity: Entity): js.Promise[js.Array[Entity]] = js.native
    
    /**
      * Gets all children (descendants) of the given entity. Returns them in a tree - nested into each other.
      */
    def findDescendantsTree(entity: Entity): js.Promise[Entity] = js.native
    
    /**
      * Roots are entities that have no ancestors. Finds them all.
      */
    def findRoots(): js.Promise[js.Array[Entity]] = js.native
    
    /**
      * Gets complete trees for all roots in the table.
      */
    def findTrees(): js.Promise[js.Array[Entity]] = js.native
  }
}
