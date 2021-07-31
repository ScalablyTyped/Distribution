package typings.typeorm

import typings.std.Date
import typings.typeorm.anon.SaveOptionsreloadfalse
import typings.typeorm.deepPartialMod.DeepPartial
import typings.typeorm.deleteResultMod.DeleteResult
import typings.typeorm.entityManagerMod.EntityManager
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.findConditionsMod.FindConditions
import typings.typeorm.findManyOptionsMod.FindManyOptions
import typings.typeorm.findOneOptionsMod.FindOneOptions
import typings.typeorm.insertResultMod.InsertResult
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.queryPartialEntityMod.QueryDeepPartialEntity
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.removeOptionsMod.RemoveOptions
import typings.typeorm.saveOptionsMod.SaveOptions
import typings.typeorm.selectQueryBuilderMod.SelectQueryBuilder
import typings.typeorm.typingsMod.ObjectID
import typings.typeorm.updateResultMod.UpdateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryMod {
  
  @JSImport("typeorm/browser/repository/Repository", "Repository")
  @js.native
  class Repository[Entity /* <: ObjectLiteral */] () extends StObject {
    
    /**
      * Clears all the data from the given table/collection (truncates/drops it).
      *
      * Note: this method uses TRUNCATE and may not work as you expect in transactions on some platforms.
      * @see https://stackoverflow.com/a/5972738/925151
      */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Counts entities that match given options.
      */
    def count(): js.Promise[Double] = js.native
    def count(conditions: FindConditions[Entity]): js.Promise[Double] = js.native
    def count(options: FindManyOptions[Entity]): js.Promise[Double] = js.native
    
    /**
      * Creates a new entity instance.
      */
    def create(): Entity = js.native
    /**
      * Creates a new entities and copies all entity properties from given objects into their new entities.
      * Note that it copies only properties that present in entity schema.
      */
    def create(entityLikeArray: js.Array[DeepPartial[Entity]]): js.Array[Entity] = js.native
    /**
      * Creates a new entity instance and copies all entity properties from this object into a new entity.
      * Note that it copies only properties that present in entity schema.
      */
    def create(entityLike: DeepPartial[Entity]): Entity = js.native
    
    /**
      * Creates a new query builder that can be used to build a sql query.
      */
    def createQueryBuilder(): SelectQueryBuilder[Entity] = js.native
    def createQueryBuilder(alias: String): SelectQueryBuilder[Entity] = js.native
    def createQueryBuilder(alias: String, queryRunner: QueryRunner): SelectQueryBuilder[Entity] = js.native
    def createQueryBuilder(alias: Unit, queryRunner: QueryRunner): SelectQueryBuilder[Entity] = js.native
    
    def decrement(conditions: FindConditions[Entity], propertyPath: String, value: String): js.Promise[UpdateResult] = js.native
    /**
      * Decrements some column by provided value of the entities matched given conditions.
      */
    def decrement(conditions: FindConditions[Entity], propertyPath: String, value: Double): js.Promise[UpdateResult] = js.native
    
    /**
      * Deletes entities by a given criteria.
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient DELETE query.
      * Does not check if entity exist in the database.
      */
    def delete(criteria: String): js.Promise[DeleteResult] = js.native
    def delete(criteria: js.Array[Date | Double | ObjectID | String]): js.Promise[DeleteResult] = js.native
    def delete(criteria: Double): js.Promise[DeleteResult] = js.native
    def delete(criteria: Date): js.Promise[DeleteResult] = js.native
    def delete(criteria: FindConditions[Entity]): js.Promise[DeleteResult] = js.native
    def delete(criteria: ObjectID): js.Promise[DeleteResult] = js.native
    
    /**
      * Finds entities that match given options.
      */
    def find(): js.Promise[js.Array[Entity]] = js.native
    def find(conditions: FindConditions[Entity]): js.Promise[js.Array[Entity]] = js.native
    def find(options: FindManyOptions[Entity]): js.Promise[js.Array[Entity]] = js.native
    
    /**
      * Finds entities that match given find options.
      * Also counts all entities that match given conditions,
      * but ignores pagination settings (from and take options).
      */
    def findAndCount(): js.Promise[js.Tuple2[js.Array[Entity], Double]] = js.native
    def findAndCount(conditions: FindConditions[Entity]): js.Promise[js.Tuple2[js.Array[Entity], Double]] = js.native
    def findAndCount(options: FindManyOptions[Entity]): js.Promise[js.Tuple2[js.Array[Entity], Double]] = js.native
    
    /**
      * Finds entities by ids.
      * Optionally find options can be applied.
      */
    def findByIds(ids: js.Array[js.Any]): js.Promise[js.Array[Entity]] = js.native
    def findByIds(ids: js.Array[js.Any], conditions: FindConditions[Entity]): js.Promise[js.Array[Entity]] = js.native
    def findByIds(ids: js.Array[js.Any], options: FindManyOptions[Entity]): js.Promise[js.Array[Entity]] = js.native
    
    /**
      * Finds first entity that matches given options.
      */
    def findOne(): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(conditions: FindConditions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(conditions: FindConditions[Entity], options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(id: String): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(id: String, options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(id: Double): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(id: Double, options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(id: Unit, options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(id: Date): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(id: Date, options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(id: ObjectID): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(id: ObjectID, options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne(options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    
    /**
      * Finds first entity that matches given options.
      */
    def findOneOrFail(): js.Promise[Entity] = js.native
    def findOneOrFail(conditions: FindConditions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail(conditions: FindConditions[Entity], options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail(id: String): js.Promise[Entity] = js.native
    def findOneOrFail(id: String, options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail(id: Double): js.Promise[Entity] = js.native
    def findOneOrFail(id: Double, options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail(id: Unit, options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail(id: Date): js.Promise[Entity] = js.native
    def findOneOrFail(id: Date, options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail(id: ObjectID): js.Promise[Entity] = js.native
    def findOneOrFail(id: ObjectID, options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail(options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    
    /**
      * Gets entity mixed id.
      */
    def getId(entity: Entity): js.Any = js.native
    
    /**
      * Checks if entity has an id.
      * If entity composite compose ids, it will check them all.
      */
    def hasId(entity: Entity): Boolean = js.native
    
    def increment(conditions: FindConditions[Entity], propertyPath: String, value: String): js.Promise[UpdateResult] = js.native
    /**
      * Increments some column by provided value of the entities matched given conditions.
      */
    def increment(conditions: FindConditions[Entity], propertyPath: String, value: Double): js.Promise[UpdateResult] = js.native
    
    def insert(entity: js.Array[QueryDeepPartialEntity[Entity]]): js.Promise[InsertResult] = js.native
    /**
      * Inserts a given entity into the database.
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient INSERT query.
      * Does not check if entity exist in the database, so query will fail if duplicate entity is being inserted.
      */
    def insert(entity: QueryDeepPartialEntity[Entity]): js.Promise[InsertResult] = js.native
    
    /**
      * Entity Manager used by this repository.
      */
    val manager: EntityManager = js.native
    
    /**
      * Merges multiple entities (or entity-like objects) into a given entity.
      */
    def merge(mergeIntoEntity: Entity, entityLikes: DeepPartial[Entity]*): Entity = js.native
    
    /**
      * Entity metadata of the entity current repository manages.
      */
    val metadata: EntityMetadata = js.native
    
    /**
      * Creates a new entity from the given plain javascript object. If entity already exist in the database, then
      * it loads it (and everything related to it), replaces all values with the new ones from the given object
      * and returns this new entity. This new entity is actually a loaded from the db entity with all properties
      * replaced from the new object.
      *
      * Note that given entity-like object must have an entity id / primary key to find entity by.
      * Returns undefined if entity with given id was not found.
      */
    def preload(entityLike: DeepPartial[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    
    /**
      * Executes a raw SQL query and returns a raw database results.
      * Raw query execution is supported only by relational databases (MongoDB is not supported).
      */
    def query(query: String): js.Promise[js.Any] = js.native
    def query(query: String, parameters: js.Array[js.Any]): js.Promise[js.Any] = js.native
    
    /**
      * Query runner provider used for this repository.
      */
    val queryRunner: js.UndefOr[QueryRunner] = js.native
    
    /**
      * Recovers all given entities in the database.
      */
    def recover[T /* <: DeepPartial[Entity] */](entities: js.Array[T]): js.Promise[js.Array[T & Entity]] = js.native
    /**
      * Recovers all given entities in the database.
      */
    def recover[T /* <: DeepPartial[Entity] */](entities: js.Array[T], options: SaveOptionsreloadfalse): js.Promise[js.Array[T]] = js.native
    def recover[T /* <: DeepPartial[Entity] */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T & Entity]] = js.native
    /**
      * Recovers a given entity in the database.
      */
    def recover[T /* <: DeepPartial[Entity] */](entity: T): js.Promise[T & Entity] = js.native
    /**
      * Recovers a given entity in the database.
      */
    def recover[T /* <: DeepPartial[Entity] */](entity: T, options: SaveOptionsreloadfalse): js.Promise[T] = js.native
    def recover[T /* <: DeepPartial[Entity] */](entity: T, options: SaveOptions): js.Promise[T & Entity] = js.native
    
    /**
      * Removes a given entities from the database.
      */
    def remove(entities: js.Array[Entity]): js.Promise[js.Array[Entity]] = js.native
    def remove(entities: js.Array[Entity], options: RemoveOptions): js.Promise[js.Array[Entity]] = js.native
    /**
      * Removes a given entity from the database.
      */
    def remove(entity: Entity): js.Promise[Entity] = js.native
    def remove(entity: Entity, options: RemoveOptions): js.Promise[Entity] = js.native
    
    /**
      * Restores entities by a given criteria.
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient SOFT-DELETE query.
      * Does not check if entity exist in the database.
      */
    def restore(criteria: String): js.Promise[UpdateResult] = js.native
    def restore(criteria: js.Array[Date | Double | ObjectID | String]): js.Promise[UpdateResult] = js.native
    def restore(criteria: Double): js.Promise[UpdateResult] = js.native
    def restore(criteria: Date): js.Promise[UpdateResult] = js.native
    def restore(criteria: FindConditions[Entity]): js.Promise[UpdateResult] = js.native
    def restore(criteria: ObjectID): js.Promise[UpdateResult] = js.native
    
    /**
      * Saves all given entities in the database.
      * If entities do not exist in the database then inserts, otherwise updates.
      */
    def save[T /* <: DeepPartial[Entity] */](entities: js.Array[T]): js.Promise[js.Array[T & Entity]] = js.native
    /**
      * Saves all given entities in the database.
      * If entities do not exist in the database then inserts, otherwise updates.
      */
    def save[T /* <: DeepPartial[Entity] */](entities: js.Array[T], options: SaveOptionsreloadfalse): js.Promise[js.Array[T]] = js.native
    def save[T /* <: DeepPartial[Entity] */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T & Entity]] = js.native
    /**
      * Saves a given entity in the database.
      * If entity does not exist in the database then inserts, otherwise updates.
      */
    def save[T /* <: DeepPartial[Entity] */](entity: T): js.Promise[T & Entity] = js.native
    /**
      * Saves a given entity in the database.
      * If entity does not exist in the database then inserts, otherwise updates.
      */
    def save[T /* <: DeepPartial[Entity] */](entity: T, options: SaveOptionsreloadfalse): js.Promise[T] = js.native
    def save[T /* <: DeepPartial[Entity] */](entity: T, options: SaveOptions): js.Promise[T & Entity] = js.native
    
    /**
      * Records the delete date of entities by a given criteria.
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient SOFT-DELETE query.
      * Does not check if entity exist in the database.
      */
    def softDelete(criteria: String): js.Promise[UpdateResult] = js.native
    def softDelete(criteria: js.Array[Date | Double | ObjectID | String]): js.Promise[UpdateResult] = js.native
    def softDelete(criteria: Double): js.Promise[UpdateResult] = js.native
    def softDelete(criteria: Date): js.Promise[UpdateResult] = js.native
    def softDelete(criteria: FindConditions[Entity]): js.Promise[UpdateResult] = js.native
    def softDelete(criteria: ObjectID): js.Promise[UpdateResult] = js.native
    
    /**
      * Records the delete date of all given entities.
      */
    def softRemove[T /* <: DeepPartial[Entity] */](entities: js.Array[T]): js.Promise[js.Array[T & Entity]] = js.native
    /**
      * Records the delete date of all given entities.
      */
    def softRemove[T /* <: DeepPartial[Entity] */](entities: js.Array[T], options: SaveOptionsreloadfalse): js.Promise[js.Array[T]] = js.native
    def softRemove[T /* <: DeepPartial[Entity] */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T & Entity]] = js.native
    /**
      * Records the delete date of a given entity.
      */
    def softRemove[T /* <: DeepPartial[Entity] */](entity: T): js.Promise[T & Entity] = js.native
    /**
      * Records the delete date of a given entity.
      */
    def softRemove[T /* <: DeepPartial[Entity] */](entity: T, options: SaveOptionsreloadfalse): js.Promise[T] = js.native
    def softRemove[T /* <: DeepPartial[Entity] */](entity: T, options: SaveOptions): js.Promise[T & Entity] = js.native
    
    /**
      * Returns object that is managed by this repository.
      * If this repository manages entity from schema,
      * then it returns a name of that schema instead.
      */
    val target: js.Function | String = js.native
    
    /**
      * Updates entity partially. Entity can be found by a given conditions.
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient UPDATE query.
      * Does not check if entity exist in the database.
      */
    def update(criteria: String, partialEntity: QueryDeepPartialEntity[Entity]): js.Promise[UpdateResult] = js.native
    def update(
      criteria: js.Array[Date | Double | ObjectID | String],
      partialEntity: QueryDeepPartialEntity[Entity]
    ): js.Promise[UpdateResult] = js.native
    def update(criteria: Double, partialEntity: QueryDeepPartialEntity[Entity]): js.Promise[UpdateResult] = js.native
    def update(criteria: Date, partialEntity: QueryDeepPartialEntity[Entity]): js.Promise[UpdateResult] = js.native
    def update(criteria: FindConditions[Entity], partialEntity: QueryDeepPartialEntity[Entity]): js.Promise[UpdateResult] = js.native
    def update(criteria: ObjectID, partialEntity: QueryDeepPartialEntity[Entity]): js.Promise[UpdateResult] = js.native
  }
}
