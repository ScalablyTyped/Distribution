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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryBaseEntityMod {
  
  @JSImport("typeorm/repository/BaseEntity", "BaseEntity")
  @js.native
  class BaseEntity () extends StObject {
    
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
  object BaseEntity {
    
    @JSImport("typeorm/repository/BaseEntity", "BaseEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Clears all the data from the given table/collection (truncates/drops it).
      */
    @scala.inline
    def clear[T /* <: BaseEntity */](): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * Counts entities that match given options.
      */
    /**
      * Counts entities that match given conditions.
      */
    @scala.inline
    def count[T /* <: BaseEntity */](): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[js.Promise[Double]]
    @scala.inline
    def count[T /* <: BaseEntity */](conditions: FindConditions[T]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    @scala.inline
    def count[T /* <: BaseEntity */](options: FindManyOptions[T]): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    
    /**
      * Creates a new entity instance.
      */
    @scala.inline
    def create[T /* <: BaseEntity */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[T]
    /**
      * Creates a new entities and copies all entity properties from given objects into their new entities.
      * Note that it copies only properties that present in entity schema.
      */
    @scala.inline
    def create[T /* <: BaseEntity */](entityLikeArray: js.Array[DeepPartial[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityLikeArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    /**
      * Creates a new entity instance and copies all entity properties from this object into a new entity.
      * Note that it copies only properties that present in entity schema.
      */
    @scala.inline
    def create[T /* <: BaseEntity */](entityLike: DeepPartial[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityLike.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Creates a new query builder that can be used to build a sql query.
      */
    @scala.inline
    def createQueryBuilder[T /* <: BaseEntity */](): SelectQueryBuilder[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryBuilder")().asInstanceOf[SelectQueryBuilder[T]]
    @scala.inline
    def createQueryBuilder[T /* <: BaseEntity */](alias: String): SelectQueryBuilder[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueryBuilder")(alias.asInstanceOf[js.Any]).asInstanceOf[SelectQueryBuilder[T]]
    
    /**
      * Deletes entities by a given criteria.
      * Unlike remove method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient DELETE query.
      * Does not check if entity exist in the database.
      */
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: String): js.Promise[DeleteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: String, options: RemoveOptions): js.Promise[DeleteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: js.Array[Date | Double | ObjectID | String]): js.Promise[DeleteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: js.Array[Date | Double | ObjectID | String], options: RemoveOptions): js.Promise[DeleteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: Double): js.Promise[DeleteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: Double, options: RemoveOptions): js.Promise[DeleteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: Date): js.Promise[DeleteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: Date, options: RemoveOptions): js.Promise[DeleteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: FindConditions[T]): js.Promise[DeleteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: FindConditions[T], options: RemoveOptions): js.Promise[DeleteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: ObjectID): js.Promise[DeleteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteResult]]
    @scala.inline
    def delete[T /* <: BaseEntity */](criteria: ObjectID, options: RemoveOptions): js.Promise[DeleteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteResult]]
    
    /**
      * Finds entities that match given options.
      */
    /**
      * Finds entities that match given conditions.
      */
    @scala.inline
    def find[T /* <: BaseEntity */](): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")().asInstanceOf[js.Promise[js.Array[T]]]
    @scala.inline
    def find[T /* <: BaseEntity */](conditions: FindConditions[T]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
    @scala.inline
    def find[T /* <: BaseEntity */](options: FindManyOptions[T]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
    
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
    @scala.inline
    def findAndCount[T /* <: BaseEntity */](): js.Promise[js.Tuple2[js.Array[T], Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAndCount")().asInstanceOf[js.Promise[js.Tuple2[js.Array[T], Double]]]
    @scala.inline
    def findAndCount[T /* <: BaseEntity */](conditions: FindConditions[T]): js.Promise[js.Tuple2[js.Array[T], Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAndCount")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[js.Array[T], Double]]]
    @scala.inline
    def findAndCount[T /* <: BaseEntity */](options: FindManyOptions[T]): js.Promise[js.Tuple2[js.Array[T], Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAndCount")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[js.Array[T], Double]]]
    
    /**
      * Finds entities by ids.
      * Optionally find options can be applied.
      */
    /**
      * Finds entities by ids.
      * Optionally conditions can be applied.
      */
    @scala.inline
    def findByIds[T /* <: BaseEntity */](ids: js.Array[js.Any]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByIds")(ids.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
    @scala.inline
    def findByIds[T /* <: BaseEntity */](ids: js.Array[js.Any], conditions: FindConditions[T]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findByIds")(ids.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
    @scala.inline
    def findByIds[T /* <: BaseEntity */](ids: js.Array[js.Any], options: FindManyOptions[T]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findByIds")(ids.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
    
    /**
      * Finds first entity that matches given options.
      */
    /**
      * Finds first entity that matches given conditions.
      */
    @scala.inline
    def findOne[T /* <: BaseEntity */](): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")().asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](conditions: FindConditions[T]): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](conditions: FindConditions[T], options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(conditions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](id: String): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](id: String, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](id: Double): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](id: Double, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](id: Unit, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](id: Date): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](id: Date, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](id: ObjectID): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](id: ObjectID, options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[T]]]
    @scala.inline
    def findOne[T /* <: BaseEntity */](options: FindOneOptions[T]): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
    
    /**
      * Finds first entity that matches given options.
      */
    /**
      * Finds first entity that matches given conditions.
      */
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")().asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](conditions: FindConditions[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(conditions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](conditions: FindConditions[T], options: FindOneOptions[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(conditions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](id: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](id: String, options: FindOneOptions[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](id: Double): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](id: Double, options: FindOneOptions[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](id: Unit, options: FindOneOptions[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](id: Date): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](id: Date, options: FindOneOptions[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](id: ObjectID): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](id: ObjectID, options: FindOneOptions[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    @scala.inline
    def findOneOrFail[T /* <: BaseEntity */](options: FindOneOptions[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOneOrFail")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    
    /**
      * Gets entity mixed id.
      */
    @scala.inline
    def getId[T /* <: BaseEntity */](entity: T): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(entity.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Gets current entity's Repository.
      */
    @scala.inline
    def getRepository[T /* <: BaseEntity */](): Repository[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepository")().asInstanceOf[Repository[T]]
    
    /**
      * Checks entity has an id.
      * If entity composite compose ids, it will check them all.
      */
    @scala.inline
    def hasId(entity: BaseEntity): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasId")(entity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def insert[T /* <: BaseEntity */](entity: js.Array[QueryDeepPartialEntity[T]]): js.Promise[InsertResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(entity.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InsertResult]]
    @scala.inline
    def insert[T /* <: BaseEntity */](entity: js.Array[QueryDeepPartialEntity[T]], options: SaveOptions): js.Promise[InsertResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InsertResult]]
    /**
      * Inserts a given entity into the database.
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient INSERT query.
      * Does not check if entity exist in the database, so query will fail if duplicate entity is being inserted.
      */
    @scala.inline
    def insert[T /* <: BaseEntity */](entity: QueryDeepPartialEntity[T]): js.Promise[InsertResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(entity.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InsertResult]]
    @scala.inline
    def insert[T /* <: BaseEntity */](entity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[InsertResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InsertResult]]
    
    /**
      * Merges multiple entities (or entity-like objects) into a given entity.
      */
    @scala.inline
    def merge[T /* <: BaseEntity */](mergeIntoEntity: T, entityLikes: DeepPartial[T]*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(mergeIntoEntity.asInstanceOf[js.Any], entityLikes.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new entity from the given plain javascript object. If entity already exist in the database, then
      * it loads it (and everything related to it), replaces all values with the new ones from the given object
      * and returns this new entity. This new entity is actually a loaded from the db entity with all properties
      * replaced from the new object.
      *
      * Note that given entity-like object must have an entity id / primary key to find entity by.
      * Returns undefined if entity with given id was not found.
      */
    @scala.inline
    def preload[T /* <: BaseEntity */](entityLike: DeepPartial[T]): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("preload")(entityLike.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
    
    /**
      * Executes a raw SQL query and returns a raw database results.
      * Raw query execution is supported only by relational databases (MongoDB is not supported).
      */
    @scala.inline
    def query[T /* <: BaseEntity */](query: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def query[T /* <: BaseEntity */](query: String, parameters: js.Array[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    /**
      * Removes a given entities from the database.
      */
    @scala.inline
    def remove[T /* <: BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(entities.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
    @scala.inline
    def remove[T /* <: BaseEntity */](entities: js.Array[T], options: RemoveOptions): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(entities.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
    /**
      * Removes a given entity from the database.
      */
    @scala.inline
    def remove[T /* <: BaseEntity */](entity: T): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(entity.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    @scala.inline
    def remove[T /* <: BaseEntity */](entity: T, options: RemoveOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    
    /**
      * Saves all given entities in the database.
      * If entities do not exist in the database then inserts, otherwise updates.
      */
    @scala.inline
    def save[T /* <: BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(entities.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
    @scala.inline
    def save[T /* <: BaseEntity */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(entities.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
    /**
      * Saves a given entity in the database.
      * If entity does not exist in the database then inserts, otherwise updates.
      */
    @scala.inline
    def save[T /* <: BaseEntity */](entity: T): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(entity.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    @scala.inline
    def save[T /* <: BaseEntity */](entity: T, options: SaveOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    
    /**
      * Records the delete date of all given entities.
      */
    @scala.inline
    def softRemove[T /* <: BaseEntity */](entities: js.Array[T]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("softRemove")(entities.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
    @scala.inline
    def softRemove[T /* <: BaseEntity */](entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("softRemove")(entities.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
    /**
      * Records the delete date of a given entity.
      */
    @scala.inline
    def softRemove[T /* <: BaseEntity */](entity: T): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("softRemove")(entity.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    @scala.inline
    def softRemove[T /* <: BaseEntity */](entity: T, options: SaveOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("softRemove")(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    
    /**
      * Returns object that is managed by this repository.
      * If this repository manages entity from schema,
      * then it returns a name of that schema instead.
      */
    @JSImport("typeorm/repository/BaseEntity", "BaseEntity.target")
    @js.native
    val target: js.Function | String = js.native
    
    /**
      * Updates entity partially. Entity can be found by a given conditions.
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient UPDATE query.
      * Does not check if entity exist in the database.
      */
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: String, partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: String, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: js.Array[Date | Double | ObjectID | String], partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](
      criteria: js.Array[Date | Double | ObjectID | String],
      partialEntity: QueryDeepPartialEntity[T],
      options: SaveOptions
    ): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: Double, partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: Double, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: Date, partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: Date, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: FindConditions[T], partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: FindConditions[T], partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: ObjectID, partialEntity: QueryDeepPartialEntity[T]): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    @scala.inline
    def update[T /* <: BaseEntity */](criteria: ObjectID, partialEntity: QueryDeepPartialEntity[T], options: SaveOptions): js.Promise[UpdateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(criteria.asInstanceOf[js.Any], partialEntity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResult]]
    
    /**
      * Sets connection to be used by entity.
      */
    @scala.inline
    def useConnection(connection: Connection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useConnection")(connection.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Connection used in all static methods of the BaseEntity.
      */
    @JSImport("typeorm/repository/BaseEntity", "BaseEntity.usedConnection")
    @js.native
    def usedConnection: js.Any = js.native
    @scala.inline
    def usedConnection_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usedConnection")(x.asInstanceOf[js.Any])
  }
}
