package typings.typeorm

import typings.std.Date
import typings.typeorm.commonDeepPartialMod.DeepPartial
import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.findOptionsFindConditionsMod.FindConditions
import typings.typeorm.findOptionsFindManyOptionsMod.FindManyOptions
import typings.typeorm.findOptionsFindOneOptionsMod.FindOneOptions
import typings.typeorm.mongodbTypingsMod.ObjectID
import typings.typeorm.queryBuilderQueryPartialEntityMod.QueryDeepPartialEntity
import typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import typings.typeorm.repositoryRemoveOptionsMod.RemoveOptions
import typings.typeorm.repositoryRepositoryMod.Repository
import typings.typeorm.repositorySaveOptionsMod.SaveOptions
import typings.typeorm.resultDeleteResultMod.DeleteResult
import typings.typeorm.resultInsertResultMod.InsertResult
import typings.typeorm.resultUpdateResultMod.UpdateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/repository/BaseEntity", JSImport.Namespace)
@js.native
object repositoryBaseEntityMod extends js.Object {
  
  @js.native
  class BaseEntity () extends js.Object {
    
    /**
      * Checks if entity has an id.
      * If entity composite compose ids, it will check them all.
      */
    def hasId(): Boolean = js.native
    
    /**
      * Recovers a given entity in the database.
      */
    def recover(): js.Promise[this.type] = js.native
    def recover(options: SaveOptions): js.Promise[this.type] = js.native
    
    /**
      * Reloads entity data from the database.
      */
    def reload(): js.Promise[Unit] = js.native
    
    /**
      * Removes current entity from the database.
      */
    def remove(): js.Promise[this.type] = js.native
    def remove(options: RemoveOptions): js.Promise[this.type] = js.native
    
    /**
      * Saves current entity in the database.
      * If entity does not exist in the database then inserts, otherwise updates.
      */
    def save(): js.Promise[this.type] = js.native
    def save(options: SaveOptions): js.Promise[this.type] = js.native
    
    /**
      * Records the delete date of current entity.
      */
    def softRemove(): js.Promise[this.type] = js.native
    def softRemove(options: SaveOptions): js.Promise[this.type] = js.native
  }
  /* static members */
  @js.native
  object BaseEntity extends js.Object {
    
    /**
      * Clears all the data from the given table/collection (truncates/drops it).
      */
    def clear[T /* <: BaseEntity */](): js.Promise[Unit] = js.native
    
    /**
      * Counts entities that match given options.
      */
    /**
      * Counts entities that match given conditions.
      */
    def count[T /* <: BaseEntity */](): js.Promise[Double] = js.native
    def count[T /* <: BaseEntity */](conditions: FindConditions[T]): js.Promise[Double] = js.native
    def count[T /* <: BaseEntity */](options: FindManyOptions[T]): js.Promise[Double] = js.native
    
    /**
      * Creates a new entity instance.
      */
    def create[T /* <: BaseEntity */](): T = js.native
    /**
      * Creates a new entities and copies all entity properties from given objects into their new entities.
      * Note that it copies only properties that present in entity schema.
      */
    def create[T /* <: BaseEntity */](entityLikeArray: js.Array[DeepPartial[T]]): js.Array[T] = js.native
    /**
      * Creates a new entity instance and copies all entity properties from this object into a new entity.
      * Note that it copies only properties that present in entity schema.
      */
    def create[T /* <: BaseEntity */](entityLike: DeepPartial[T]): T = js.native
    
    /**
      * Creates a new query builder that can be used to build a sql query.
      */
    def createQueryBuilder[T /* <: BaseEntity */](): SelectQueryBuilder[T] = js.native
    def createQueryBuilder[T /* <: BaseEntity */](alias: String): SelectQueryBuilder[T] = js.native
    
    /**
      * Deletes entities by a given criteria.
      * Unlike remove method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient DELETE query.
      * Does not check if entity exist in the database.
      */
    def delete[T /* <: BaseEntity */](criteria: String): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: String, options: RemoveOptions): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: js.Array[Date | Double | ObjectID | String]): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: js.Array[Date | Double | ObjectID | String], options: RemoveOptions): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: Double): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: Double, options: RemoveOptions): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: Date): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: Date, options: RemoveOptions): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: FindConditions[T]): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: FindConditions[T], options: RemoveOptions): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: ObjectID): js.Promise[DeleteResult] = js.native
    def delete[T /* <: BaseEntity */](criteria: ObjectID, options: RemoveOptions): js.Promise[DeleteResult] = js.native
    
    /**
      * Finds entities that match given options.
      */
    /**
      * Finds entities that match given conditions.
      */
    def find[T /* <: BaseEntity */](): js.Promise[js.Array[T]] = js.native
    def find[T /* <: BaseEntity */](conditions: FindConditions[T]): js.Promise[js.Array[T]] = js.native
    def find[T /* <: BaseEntity */](options: FindManyOptions[T]): js.Promise[js.Array[T]] = js.native
    
    /**
      * Finds entities that match given find options.
      * Also counts all entities that match given conditions,
      * but ignores pagination settings (from and take options).
      */
    /**
      * Finds entities that match given conditions.
      * Also counts all entities that match given conditions,
      * but ignores pagination settings (from and take options).
      */
    def findAndCount[T /* <: BaseEntity */](): js.Promise[js.Tuple2[js.Array[T], Double]] = js.native
    def findAndCount[T /* <: BaseEntity */](conditions: FindConditions[T]): js.Promise[js.Tuple2[js.Array[T], Double]] = js.native
    def findAndCount[T /* <: BaseEntity */](options: FindManyOptions[T]): js.Promise[js.Tuple2[js.Array[T], Double]] = js.native
    
    /**
      * Finds entities by ids.
      * Optionally find options can be applied.
      */
    /**
      * Finds entities by ids.
      * Optionally conditions can be applied.
      */
    def findByIds[T /* <: BaseEntity */](ids: js.Array[_]): js.Promise[js.Array[T]] = js.native
    def findByIds[T /* <: BaseEntity */](ids: js.Array[_], conditions: FindConditions[T]): js.Promise[js.Array[T]] = js.native
    def findByIds[T /* <: BaseEntity */](ids: js.Array[_], options: FindManyOptions[T]): js.Promise[js.Array[T]] = js.native
    
    /**
      * Finds first entity that matches given options.
      */
    /**
      * Finds first entity that matches given conditions.
      */
    def findOne[T /* <: BaseEntity */](): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](conditions: FindConditions[T]): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](conditions: FindConditions[T], options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](id: js.UndefOr[scala.Nothing], options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](id: String): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](id: String, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](id: Double): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](id: Double, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](id: Date): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](id: Date, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](id: ObjectID): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](id: ObjectID, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
    def findOne[T /* <: BaseEntity */](options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
    
    /**
      * Finds first entity that matches given options.
      */
    /**
      * Finds first entity that matches given conditions.
      */
    def findOneOrFail[T /* <: BaseEntity */](): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](conditions: FindConditions[T]): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](conditions: FindConditions[T], options: FindOneOptions[T]): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](id: js.UndefOr[scala.Nothing], options: FindOneOptions[T]): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](id: String): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](id: String, options: FindOneOptions[T]): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](id: Double): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](id: Double, options: FindOneOptions[T]): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](id: Date): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](id: Date, options: FindOneOptions[T]): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](id: ObjectID): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](id: ObjectID, options: FindOneOptions[T]): js.Promise[T] = js.native
    def findOneOrFail[T /* <: BaseEntity */](options: FindOneOptions[T]): js.Promise[T] = js.native
    
    /**
      * Gets entity mixed id.
      */
    def getId[T /* <: BaseEntity */](entity: T): js.Any = js.native
    
    /**
      * Gets current entity's Repository.
      */
    def getRepository[T /* <: BaseEntity */](): Repository[T] = js.native
    
    /**
      * Checks entity has an id.
      * If entity composite compose ids, it will check them all.
      */
    def hasId(entity: BaseEntity): Boolean = js.native
    
    def insert[T /* <: BaseEntity */](entity: js.Array[QueryDeepPartialEntity[T]]): js.Promise[InsertResult] = js.native
    def insert[T /* <: BaseEntity */](entity: js.Array[QueryDeepPartialEntity[T]], options: SaveOptions): js.Promise[InsertResult] = js.native
    /**
      * Inserts a given entity into the database.
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient INSERT query.
      * Does not check if entity exist in the database, so query will fail if duplicate entity is being inserted.
      */
    def insert[T /* <: BaseEntity */](entity: QueryDeepPartialEntity[T]): js.Promise[InsertResult] = js.native
    def insert[T /* <: BaseEntity */](entity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[InsertResult] = js.native
    
    /**
      * Merges multiple entities (or entity-like objects) into a given entity.
      */
    def merge[T /* <: BaseEntity */](mergeIntoEntity: T, entityLikes: DeepPartial[T]*): T = js.native
    
    /**
      * Creates a new entity from the given plain javascript object. If entity already exist in the database, then
      * it loads it (and everything related to it), replaces all values with the new ones from the given object
      * and returns this new entity. This new entity is actually a loaded from the db entity with all properties
      * replaced from the new object.
      *
      * Note that given entity-like object must have an entity id / primary key to find entity by.
      * Returns undefined if entity with given id was not found.
      */
    def preload[T /* <: BaseEntity */](entityLike: DeepPartial[T]): js.Promise[js.UndefOr[T]] = js.native
    
    /**
      * Executes a raw SQL query and returns a raw database results.
      * Raw query execution is supported only by relational databases (MongoDB is not supported).
      */
    def query[T /* <: BaseEntity */](query: String): js.Promise[_] = js.native
    def query[T /* <: BaseEntity */](query: String, parameters: js.Array[_]): js.Promise[_] = js.native
    
    /**
      * Removes a given entities from the database.
      */
    def remove[T /* <: BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
    def remove[T /* <: BaseEntity */](entities: js.Array[T], options: RemoveOptions): js.Promise[js.Array[T]] = js.native
    /**
      * Removes a given entity from the database.
      */
    def remove[T /* <: BaseEntity */](entity: T): js.Promise[T] = js.native
    def remove[T /* <: BaseEntity */](entity: T, options: RemoveOptions): js.Promise[T] = js.native
    
    /**
      * Saves all given entities in the database.
      * If entities do not exist in the database then inserts, otherwise updates.
      */
    def save[T /* <: BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
    def save[T /* <: BaseEntity */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = js.native
    /**
      * Saves a given entity in the database.
      * If entity does not exist in the database then inserts, otherwise updates.
      */
    def save[T /* <: BaseEntity */](entity: T): js.Promise[T] = js.native
    def save[T /* <: BaseEntity */](entity: T, options: SaveOptions): js.Promise[T] = js.native
    
    /**
      * Records the delete date of all given entities.
      */
    def softRemove[T /* <: BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
    def softRemove[T /* <: BaseEntity */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = js.native
    /**
      * Records the delete date of a given entity.
      */
    def softRemove[T /* <: BaseEntity */](entity: T): js.Promise[T] = js.native
    def softRemove[T /* <: BaseEntity */](entity: T, options: SaveOptions): js.Promise[T] = js.native
    
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
    def update[T /* <: BaseEntity */](criteria: String, partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](criteria: String, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](criteria: js.Array[Date | Double | ObjectID | String], partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](
      criteria: js.Array[Date | Double | ObjectID | String],
      partialEntity: QueryDeepPartialEntity[T],
      options: SaveOptions
    ): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](criteria: Double, partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](criteria: Double, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](criteria: Date, partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](criteria: Date, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](criteria: FindConditions[T], partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](criteria: FindConditions[T], partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](criteria: ObjectID, partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = js.native
    def update[T /* <: BaseEntity */](criteria: ObjectID, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[UpdateResult] = js.native
    
    /**
      * Sets connection to be used by entity.
      */
    def useConnection(connection: Connection): Unit = js.native
    
    /**
      * Connection used in all static methods of the BaseEntity.
      */
    var usedConnection: js.Any = js.native
  }
}
