package typings.typeorm.mod

import typings.std.Date
import typings.typeorm.commonDeepPartialMod.DeepPartial
import typings.typeorm.findOptionsFindConditionsMod.FindConditions
import typings.typeorm.findOptionsFindManyOptionsMod.FindManyOptions
import typings.typeorm.findOptionsFindOneOptionsMod.FindOneOptions
import typings.typeorm.queryBuilderQueryPartialEntityMod.QueryDeepPartialEntity
import typings.typeorm.repositoryRemoveOptionsMod.RemoveOptions
import typings.typeorm.repositorySaveOptionsMod.SaveOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "BaseEntity")
@js.native
class BaseEntity ()
  extends typings.typeorm.repositoryBaseEntityMod.BaseEntity
/* static members */
object BaseEntity {
  
  @JSImport("typeorm", "BaseEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears all the data from the given table/collection (truncates/drops it).
    */
  @JSImport("typeorm", "BaseEntity.clear")
  @js.native
  def clear[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](): js.Promise[Unit] = js.native
  
  /**
    * Counts entities that match given options.
    */
  /**
    * Counts entities that match given conditions.
    */
  @JSImport("typeorm", "BaseEntity.count")
  @js.native
  def count[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](): js.Promise[scala.Double] = js.native
  @JSImport("typeorm", "BaseEntity.count")
  @js.native
  def count[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](conditions: FindConditions[T]): js.Promise[scala.Double] = js.native
  @JSImport("typeorm", "BaseEntity.count")
  @js.native
  def count[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](options: FindManyOptions[T]): js.Promise[scala.Double] = js.native
  
  /**
    * Creates a new entity instance.
    */
  @JSImport("typeorm", "BaseEntity.create")
  @js.native
  def create[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](): T = js.native
  /**
    * Creates a new entities and copies all entity properties from given objects into their new entities.
    * Note that it copies only properties that present in entity schema.
    */
  @JSImport("typeorm", "BaseEntity.create")
  @js.native
  def create[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entityLikeArray: js.Array[DeepPartial[T]]): js.Array[T] = js.native
  /**
    * Creates a new entity instance and copies all entity properties from this object into a new entity.
    * Note that it copies only properties that present in entity schema.
    */
  @JSImport("typeorm", "BaseEntity.create")
  @js.native
  def create[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entityLike: DeepPartial[T]): T = js.native
  
  /**
    * Creates a new query builder that can be used to build a sql query.
    */
  @JSImport("typeorm", "BaseEntity.createQueryBuilder")
  @js.native
  def createQueryBuilder[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  @JSImport("typeorm", "BaseEntity.createQueryBuilder")
  @js.native
  def createQueryBuilder[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](alias: String): typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder[T] = js.native
  
  /**
    * Deletes entities by a given criteria.
    * Unlike remove method executes a primitive operation without cascades, relations and other operations included.
    * Executes fast and efficient DELETE query.
    * Does not check if entity exist in the database.
    */
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: String): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: String, options: RemoveOptions): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: js.Array[Date | scala.Double | typings.typeorm.mongodbTypingsMod.ObjectID | String]): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](
    criteria: js.Array[Date | scala.Double | typings.typeorm.mongodbTypingsMod.ObjectID | String],
    options: RemoveOptions
  ): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: scala.Double): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: scala.Double, options: RemoveOptions): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: Date): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: Date, options: RemoveOptions): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: FindConditions[T]): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: FindConditions[T], options: RemoveOptions): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: typings.typeorm.mongodbTypingsMod.ObjectID): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  @JSImport("typeorm", "BaseEntity.delete")
  @js.native
  def delete[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: typings.typeorm.mongodbTypingsMod.ObjectID, options: RemoveOptions): js.Promise[typings.typeorm.resultDeleteResultMod.DeleteResult] = js.native
  
  /**
    * Finds entities that match given options.
    */
  /**
    * Finds entities that match given conditions.
    */
  @JSImport("typeorm", "BaseEntity.find")
  @js.native
  def find[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](): js.Promise[js.Array[T]] = js.native
  @JSImport("typeorm", "BaseEntity.find")
  @js.native
  def find[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](conditions: FindConditions[T]): js.Promise[js.Array[T]] = js.native
  @JSImport("typeorm", "BaseEntity.find")
  @js.native
  def find[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](options: FindManyOptions[T]): js.Promise[js.Array[T]] = js.native
  
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
  @JSImport("typeorm", "BaseEntity.findAndCount")
  @js.native
  def findAndCount[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](): js.Promise[js.Tuple2[js.Array[T], scala.Double]] = js.native
  @JSImport("typeorm", "BaseEntity.findAndCount")
  @js.native
  def findAndCount[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](conditions: FindConditions[T]): js.Promise[js.Tuple2[js.Array[T], scala.Double]] = js.native
  @JSImport("typeorm", "BaseEntity.findAndCount")
  @js.native
  def findAndCount[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](options: FindManyOptions[T]): js.Promise[js.Tuple2[js.Array[T], scala.Double]] = js.native
  
  /**
    * Finds entities by ids.
    * Optionally find options can be applied.
    */
  /**
    * Finds entities by ids.
    * Optionally conditions can be applied.
    */
  @JSImport("typeorm", "BaseEntity.findByIds")
  @js.native
  def findByIds[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](ids: js.Array[_]): js.Promise[js.Array[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findByIds")
  @js.native
  def findByIds[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](ids: js.Array[_], conditions: FindConditions[T]): js.Promise[js.Array[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findByIds")
  @js.native
  def findByIds[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](ids: js.Array[_], options: FindManyOptions[T]): js.Promise[js.Array[T]] = js.native
  
  /**
    * Finds first entity that matches given options.
    */
  /**
    * Finds first entity that matches given conditions.
    */
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](conditions: FindConditions[T]): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](conditions: FindConditions[T], options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: js.UndefOr[scala.Nothing], options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: String): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: String, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: scala.Double): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: scala.Double, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: Date): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: Date, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: typings.typeorm.mongodbTypingsMod.ObjectID): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: typings.typeorm.mongodbTypingsMod.ObjectID, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  @JSImport("typeorm", "BaseEntity.findOne")
  @js.native
  def findOne[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = js.native
  
  /**
    * Finds first entity that matches given options.
    */
  /**
    * Finds first entity that matches given conditions.
    */
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](conditions: FindConditions[T]): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](conditions: FindConditions[T], options: FindOneOptions[T]): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: js.UndefOr[scala.Nothing], options: FindOneOptions[T]): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: String): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: String, options: FindOneOptions[T]): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: scala.Double): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: scala.Double, options: FindOneOptions[T]): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: Date): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: Date, options: FindOneOptions[T]): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: typings.typeorm.mongodbTypingsMod.ObjectID): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](id: typings.typeorm.mongodbTypingsMod.ObjectID, options: FindOneOptions[T]): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.findOneOrFail")
  @js.native
  def findOneOrFail[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](options: FindOneOptions[T]): js.Promise[T] = js.native
  
  /**
    * Gets entity mixed id.
    */
  @JSImport("typeorm", "BaseEntity.getId")
  @js.native
  def getId[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: T): js.Any = js.native
  
  /**
    * Gets current entity's Repository.
    */
  @JSImport("typeorm", "BaseEntity.getRepository")
  @js.native
  def getRepository[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](): typings.typeorm.repositoryRepositoryMod.Repository[T] = js.native
  
  /**
    * Checks entity has an id.
    * If entity composite compose ids, it will check them all.
    */
  @JSImport("typeorm", "BaseEntity.hasId")
  @js.native
  def hasId(entity: typings.typeorm.repositoryBaseEntityMod.BaseEntity): Boolean = js.native
  
  @JSImport("typeorm", "BaseEntity.insert")
  @js.native
  def insert[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: js.Array[QueryDeepPartialEntity[T]]): js.Promise[typings.typeorm.resultInsertResultMod.InsertResult] = js.native
  @JSImport("typeorm", "BaseEntity.insert")
  @js.native
  def insert[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: js.Array[QueryDeepPartialEntity[T]], options: SaveOptions): js.Promise[typings.typeorm.resultInsertResultMod.InsertResult] = js.native
  /**
    * Inserts a given entity into the database.
    * Unlike save method executes a primitive operation without cascades, relations and other operations included.
    * Executes fast and efficient INSERT query.
    * Does not check if entity exist in the database, so query will fail if duplicate entity is being inserted.
    */
  @JSImport("typeorm", "BaseEntity.insert")
  @js.native
  def insert[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.resultInsertResultMod.InsertResult] = js.native
  @JSImport("typeorm", "BaseEntity.insert")
  @js.native
  def insert[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[typings.typeorm.resultInsertResultMod.InsertResult] = js.native
  
  /**
    * Merges multiple entities (or entity-like objects) into a given entity.
    */
  @JSImport("typeorm", "BaseEntity.merge")
  @js.native
  def merge[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](mergeIntoEntity: T, entityLikes: DeepPartial[T]*): T = js.native
  
  /**
    * Creates a new entity from the given plain javascript object. If entity already exist in the database, then
    * it loads it (and everything related to it), replaces all values with the new ones from the given object
    * and returns this new entity. This new entity is actually a loaded from the db entity with all properties
    * replaced from the new object.
    *
    * Note that given entity-like object must have an entity id / primary key to find entity by.
    * Returns undefined if entity with given id was not found.
    */
  @JSImport("typeorm", "BaseEntity.preload")
  @js.native
  def preload[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entityLike: DeepPartial[T]): js.Promise[js.UndefOr[T]] = js.native
  
  /**
    * Executes a raw SQL query and returns a raw database results.
    * Raw query execution is supported only by relational databases (MongoDB is not supported).
    */
  @JSImport("typeorm", "BaseEntity.query")
  @js.native
  def query[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](query: String): js.Promise[_] = js.native
  @JSImport("typeorm", "BaseEntity.query")
  @js.native
  def query[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](query: String, parameters: js.Array[_]): js.Promise[_] = js.native
  
  /**
    * Removes a given entities from the database.
    */
  @JSImport("typeorm", "BaseEntity.remove")
  @js.native
  def remove[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
  @JSImport("typeorm", "BaseEntity.remove")
  @js.native
  def remove[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entities: js.Array[T], options: RemoveOptions): js.Promise[js.Array[T]] = js.native
  /**
    * Removes a given entity from the database.
    */
  @JSImport("typeorm", "BaseEntity.remove")
  @js.native
  def remove[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: T): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.remove")
  @js.native
  def remove[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: T, options: RemoveOptions): js.Promise[T] = js.native
  
  /**
    * Saves all given entities in the database.
    * If entities do not exist in the database then inserts, otherwise updates.
    */
  @JSImport("typeorm", "BaseEntity.save")
  @js.native
  def save[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
  @JSImport("typeorm", "BaseEntity.save")
  @js.native
  def save[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = js.native
  /**
    * Saves a given entity in the database.
    * If entity does not exist in the database then inserts, otherwise updates.
    */
  @JSImport("typeorm", "BaseEntity.save")
  @js.native
  def save[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: T): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.save")
  @js.native
  def save[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: T, options: SaveOptions): js.Promise[T] = js.native
  
  /**
    * Records the delete date of all given entities.
    */
  @JSImport("typeorm", "BaseEntity.softRemove")
  @js.native
  def softRemove[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
  @JSImport("typeorm", "BaseEntity.softRemove")
  @js.native
  def softRemove[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = js.native
  /**
    * Records the delete date of a given entity.
    */
  @JSImport("typeorm", "BaseEntity.softRemove")
  @js.native
  def softRemove[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: T): js.Promise[T] = js.native
  @JSImport("typeorm", "BaseEntity.softRemove")
  @js.native
  def softRemove[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](entity: T, options: SaveOptions): js.Promise[T] = js.native
  
  /**
    * Returns object that is managed by this repository.
    * If this repository manages entity from schema,
    * then it returns a name of that schema instead.
    */
  @JSImport("typeorm", "BaseEntity.target")
  @js.native
  val target: js.Function | String = js.native
  
  /**
    * Updates entity partially. Entity can be found by a given conditions.
    * Unlike save method executes a primitive operation without cascades, relations and other operations included.
    * Executes fast and efficient UPDATE query.
    * Does not check if entity exist in the database.
    */
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: String, partialEntity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: String, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](
    criteria: js.Array[Date | scala.Double | typings.typeorm.mongodbTypingsMod.ObjectID | String],
    partialEntity: QueryDeepPartialEntity[T]
  ): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](
    criteria: js.Array[Date | scala.Double | typings.typeorm.mongodbTypingsMod.ObjectID | String],
    partialEntity: QueryDeepPartialEntity[T],
    options: SaveOptions
  ): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: scala.Double, partialEntity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: scala.Double, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: Date, partialEntity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: Date, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: FindConditions[T], partialEntity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: FindConditions[T], partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](criteria: typings.typeorm.mongodbTypingsMod.ObjectID, partialEntity: QueryDeepPartialEntity[T]): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  @JSImport("typeorm", "BaseEntity.update")
  @js.native
  def update[T /* <: typings.typeorm.repositoryBaseEntityMod.BaseEntity */](
    criteria: typings.typeorm.mongodbTypingsMod.ObjectID,
    partialEntity: QueryDeepPartialEntity[T],
    options: SaveOptions
  ): js.Promise[typings.typeorm.resultUpdateResultMod.UpdateResult] = js.native
  
  /**
    * Sets connection to be used by entity.
    */
  @JSImport("typeorm", "BaseEntity.useConnection")
  @js.native
  def useConnection(connection: typings.typeorm.connectionConnectionMod.Connection): Unit = js.native
  
  /**
    * Connection used in all static methods of the BaseEntity.
    */
  @JSImport("typeorm", "BaseEntity.usedConnection")
  @js.native
  def usedConnection: js.Any = js.native
  @scala.inline
  def usedConnection_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usedConnection")(x.asInstanceOf[js.Any])
}
