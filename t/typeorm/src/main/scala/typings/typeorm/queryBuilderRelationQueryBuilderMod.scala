package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderRelationQueryBuilderMod {
  
  @JSImport("typeorm/query-builder/RelationQueryBuilder", "RelationQueryBuilder")
  @js.native
  class RelationQueryBuilder[Entity] protected () extends QueryBuilder[Entity] {
    /**
      * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
      */
    def this(connection: Connection) = this()
    /**
      * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
      */
    def this(queryBuilder: QueryBuilder[js.Any]) = this()
    def this(connection: Connection, queryRunner: QueryRunner) = this()
    
    /**
      * Adds (binds) given value to entity relation.
      * Value can be entity, entity id or entity id map (if entity has composite ids).
      * Value also can be array of entities, array of entity ids or array of entity id maps (if entity has composite ids).
      * Works only for many-to-many and one-to-many relations.
      * For many-to-one and one-to-one use #set method instead.
      */
    def add(value: js.Any): js.Promise[Unit] = js.native
    def add(value: js.Array[js.Any]): js.Promise[Unit] = js.native
    
    /**
      * Adds (binds) and removes (unbinds) given values to/from entity relation.
      * Value can be entity, entity id or entity id map (if entity has composite ids).
      * Value also can be array of entities, array of entity ids or array of entity id maps (if entity has composite ids).
      * Works only for many-to-many and one-to-many relations.
      * For many-to-one and one-to-one use #set method instead.
      */
    def addAndRemove(added: js.Any, removed: js.Any): js.Promise[Unit] = js.native
    def addAndRemove(added: js.Any, removed: js.Array[js.Any]): js.Promise[Unit] = js.native
    def addAndRemove(added: js.Array[js.Any], removed: js.Any): js.Promise[Unit] = js.native
    def addAndRemove(added: js.Array[js.Any], removed: js.Array[js.Any]): js.Promise[Unit] = js.native
    
    /**
      * Loads many entities (relational) from the relation.
      * You can also provide ids of relational entities to filter by.
      */
    def loadMany[T](): js.Promise[js.Array[T]] = js.native
    
    /**
      * Gets entity's relation id.
      async getId(): Promise<any> {
      }*/
    /**
      * Gets entity's relation ids.
      async getIds(): Promise<any[]> {
      return [];
      }*/
    /**
      * Loads a single entity (relational) from the relation.
      * You can also provide id of relational entity to filter by.
      */
    def loadOne[T](): js.Promise[js.UndefOr[T]] = js.native
    
    /**
      * Sets entity (target) which relations will be updated.
      */
    def of(entity: js.Any): this.type = js.native
    def of(entity: js.Array[js.Any]): this.type = js.native
    
    /**
      * Removes (unbinds) given value from entity relation.
      * Value can be entity, entity id or entity id map (if entity has composite ids).
      * Value also can be array of entities, array of entity ids or array of entity id maps (if entity has composite ids).
      * Works only for many-to-many and one-to-many relations.
      * For many-to-one and one-to-one use #set method instead.
      */
    def remove(value: js.Any): js.Promise[Unit] = js.native
    def remove(value: js.Array[js.Any]): js.Promise[Unit] = js.native
    
    /**
      * Sets entity relation's value.
      * Value can be entity, entity id or entity id map (if entity has composite ids).
      * Works only for many-to-one and one-to-one relations.
      * For many-to-many and one-to-many relations use #add and #remove methods instead.
      */
    def set(value: js.Any): js.Promise[Unit] = js.native
  }
}
