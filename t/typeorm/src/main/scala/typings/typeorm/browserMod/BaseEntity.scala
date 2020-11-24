package typings.typeorm.browserMod

import typings.std.Date
import typings.typeorm.deepPartialMod.DeepPartial
import typings.typeorm.findConditionsMod.FindConditions
import typings.typeorm.findManyOptionsMod.FindManyOptions
import typings.typeorm.findOneOptionsMod.FindOneOptions
import typings.typeorm.queryPartialEntityMod.QueryDeepPartialEntity
import typings.typeorm.removeOptionsMod.RemoveOptions
import typings.typeorm.saveOptionsMod.SaveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "BaseEntity")
@js.native
class BaseEntity ()
  extends typings.typeorm.baseEntityMod.BaseEntity
/* static members */
@JSImport("typeorm/browser", "BaseEntity")
@js.native
object BaseEntity extends js.Object {
  
  /**
    * Clears all the data from the given table/collection (truncates/drops it).
    */
  def clear[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](): js.Promise[Unit] = js.native
  
  /**
    * Counts entities that match given options.
    */
  /**
    * Counts entities that match given conditions.
    */
  def count[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](): js.Promise[scala.Double] = js.native
  def count[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](conditions: FindConditions[T]): js.Promise[scala.Double] = js.native
  def count[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](options: FindManyOptions[T]): js.Promise[scala.Double] = js.native
  
  /**
    * Creates a new entity instance.
    */
  def create[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](): T = js.native
  /**
    * Creates a new entities and copies all entity properties from given objects into their new entities.
    * Note that it copies only properties that present in entity schema.
    */
  def create[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entityLikeArray: js.Array[DeepPartial[T]]): js.Array[T] = js.native
  /**
    * Creates a new entity instance and copies all entity properties from this object into a new entity.
    * Note that it copies only properties that present in entity schema.
    */
  def create[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entityLike: DeepPartial[T]): T = js.native
  
  /**
    * Creates a new query builder that can be used to build a sql query.
    */
  def createQueryBuilder[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](): typings.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  def createQueryBuilder[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](alias: String): typings.typeorm.selectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  
  /**
    * Deletes entities by a given criteria.
    * Unlike remove method executes a primitive operation without cascades, relations and other operations included.
    * Executes fast and efficient DELETE query.
    * Does not check if entity exist in the database.
    */
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: String): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: String, options: RemoveOptions): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: js.Array[Date | scala.Double | typings.typeorm.typingsMod.ObjectID | String]): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](
    criteria: js.Array[Date | scala.Double | typings.typeorm.typingsMod.ObjectID | String],
    options: RemoveOptions
  ): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: scala.Double): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: scala.Double, options: RemoveOptions): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: Date): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: Date, options: RemoveOptions): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: FindConditions[T]): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: FindConditions[T], options: RemoveOptions): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: typings.typeorm.typingsMod.ObjectID): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  def delete[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: typings.typeorm.typingsMod.ObjectID, options: RemoveOptions): js.Promise[typings.typeorm.deleteResultMod.DeleteResult] = js.native
  
  /**
    * Finds entities that match given options.
    */
  /**
    * Finds entities that match given conditions.
    */
  def find[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](): js.Promise[js.Array[T]] = js.native
  def find[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](conditions: FindConditions[T]): js.Promise[js.Array[T]] = js.native
  def find[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](options: FindManyOptions[T]): js.Promise[js.Array[T]] = js.native
  
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
  def findAndCount[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](): js.Promise[js.Tuple2[js.Array[T], scala.Double]] = js.native
  def findAndCount[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](conditions: FindConditions[T]): js.Promise[js.Tuple2[js.Array[T], scala.Double]] = js.native
  def findAndCount[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](options: FindManyOptions[T]): js.Promise[js.Tuple2[js.Array[T], scala.Double]] = js.native
  
  /**
    * Finds entities by ids.
    * Optionally find options can be applied.
    */
  /**
    * Finds entities by ids.
    * Optionally conditions can be applied.
    */
  def findByIds[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](ids: js.Array[_]): js.Promise[js.Array[T]] = js.native
  def findByIds[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](ids: js.Array[_], conditions: FindConditions[T]): js.Promise[js.Array[T]] = js.native
  def findByIds[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](ids: js.Array[_], options: FindManyOptions[T]): js.Promise[js.Array[T]] = js.native
  
  /**
    * Finds first entity that matches given options.
    */
  /**
    * Finds first entity that matches given conditions.
    */
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](conditions: FindConditions[T]): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](conditions: FindConditions[T], options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: js.UndefOr[scala.Nothing], options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: String): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: String, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: scala.Double): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: scala.Double, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: Date): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: Date, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: typings.typeorm.typingsMod.ObjectID): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: typings.typeorm.typingsMod.ObjectID, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  def findOne[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  
  /**
    * Finds first entity that matches given options.
    */
  /**
    * Finds first entity that matches given conditions.
    */
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](conditions: FindConditions[T]): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](conditions: FindConditions[T], options: FindOneOptions[T]): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: js.UndefOr[scala.Nothing], options: FindOneOptions[T]): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: String): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: String, options: FindOneOptions[T]): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: scala.Double): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: scala.Double, options: FindOneOptions[T]): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: Date): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: Date, options: FindOneOptions[T]): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: typings.typeorm.typingsMod.ObjectID): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](id: typings.typeorm.typingsMod.ObjectID, options: FindOneOptions[T]): js.Promise[T] = js.native
  def findOneOrFail[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](options: FindOneOptions[T]): js.Promise[T] = js.native
  
  /**
    * Gets entity mixed id.
    */
  def getId[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: T): js.Any = js.native
  
  /**
    * Gets current entity's Repository.
    */
  def getRepository[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](): typings.typeorm.repositoryMod.Repository[T] = js.native
  
  /**
    * Checks entity has an id.
    * If entity composite compose ids, it will check them all.
    */
  def hasId(entity: typings.typeorm.baseEntityMod.BaseEntity): Boolean = js.native
  
  def insert[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: js.Array[QueryDeepPartialEntity[T]]): js.Promise[typings.typeorm.insertResultMod.InsertResult] = js.native
  def insert[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: js.Array[QueryDeepPartialEntity[T]], options: SaveOptions): js.Promise[typings.typeorm.insertResultMod.InsertResult] = js.native
  /**
    * Inserts a given entity into the database.
    * Unlike save method executes a primitive operation without cascades, relations and other operations included.
    * Executes fast and efficient INSERT query.
    * Does not check if entity exist in the database, so query will fail if duplicate entity is being inserted.
    */
  def insert[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.insertResultMod.InsertResult] = js.native
  def insert[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[typings.typeorm.insertResultMod.InsertResult] = js.native
  
  /**
    * Merges multiple entities (or entity-like objects) into a given entity.
    */
  def merge[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](mergeIntoEntity: T, entityLikes: DeepPartial[T]*): T = js.native
  
  /**
    * Creates a new entity from the given plain javascript object. If entity already exist in the database, then
    * it loads it (and everything related to it), replaces all values with the new ones from the given object
    * and returns this new entity. This new entity is actually a loaded from the db entity with all properties
    * replaced from the new object.
    *
    * Note that given entity-like object must have an entity id / primary key to find entity by.
    * Returns undefined if entity with given id was not found.
    */
  def preload[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entityLike: DeepPartial[T]): js.Promise[js.UndefOr[T]] = js.native
  
  /**
    * Executes a raw SQL query and returns a raw database results.
    * Raw query execution is supported only by relational databases (MongoDB is not supported).
    */
  def query[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](query: String): js.Promise[_] = js.native
  def query[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](query: String, parameters: js.Array[_]): js.Promise[_] = js.native
  
  /**
    * Removes a given entities from the database.
    */
  def remove[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def remove[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entities: js.Array[T], options: RemoveOptions): js.Promise[js.Array[T]] = js.native
  /**
    * Removes a given entity from the database.
    */
  def remove[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: T): js.Promise[T] = js.native
  def remove[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: T, options: RemoveOptions): js.Promise[T] = js.native
  
  /**
    * Saves all given entities in the database.
    * If entities do not exist in the database then inserts, otherwise updates.
    */
  def save[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def save[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = js.native
  /**
    * Saves a given entity in the database.
    * If entity does not exist in the database then inserts, otherwise updates.
    */
  def save[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: T): js.Promise[T] = js.native
  def save[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: T, options: SaveOptions): js.Promise[T] = js.native
  
  /**
    * Records the delete date of all given entities.
    */
  def softRemove[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def softRemove[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = js.native
  /**
    * Records the delete date of a given entity.
    */
  def softRemove[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: T): js.Promise[T] = js.native
  def softRemove[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](entity: T, options: SaveOptions): js.Promise[T] = js.native
  
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
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: String, partialEntity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: String, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](
    criteria: js.Array[Date | scala.Double | typings.typeorm.typingsMod.ObjectID | String],
    partialEntity: QueryDeepPartialEntity[T]
  ): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](
    criteria: js.Array[Date | scala.Double | typings.typeorm.typingsMod.ObjectID | String],
    partialEntity: QueryDeepPartialEntity[T],
    options: SaveOptions
  ): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: scala.Double, partialEntity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: scala.Double, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: Date, partialEntity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: Date, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: FindConditions[T], partialEntity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: FindConditions[T], partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](criteria: typings.typeorm.typingsMod.ObjectID, partialEntity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  def update[T /* <: typings.typeorm.baseEntityMod.BaseEntity */](
    criteria: typings.typeorm.typingsMod.ObjectID,
    partialEntity: QueryDeepPartialEntity[T],
    options: SaveOptions
  ): js.Promise[typings.typeorm.updateResultMod.UpdateResult] = js.native
  
  /**
    * Sets connection to be used by entity.
    */
  def useConnection(connection: typings.typeorm.connectionMod.Connection): Unit = js.native
  
  /**
    * Connection used in all static methods of the BaseEntity.
    */
  var usedConnection: js.Any = js.native
}
