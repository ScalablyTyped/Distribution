package typings.typeorm

import typings.std.Date
import typings.typeorm.connectionMod.Connection
import typings.typeorm.deepPartialMod.DeepPartial
import typings.typeorm.deleteResultMod.DeleteResult
import typings.typeorm.entityTargetMod.EntityTarget
import typings.typeorm.findConditionsMod.FindConditions
import typings.typeorm.findManyOptionsMod.FindManyOptions
import typings.typeorm.findOneOptionsMod.FindOneOptions
import typings.typeorm.insertResultMod.InsertResult
import typings.typeorm.isolationLevelMod.IsolationLevel
import typings.typeorm.mongoRepositoryMod.MongoRepository
import typings.typeorm.objectTypeMod.ObjectType
import typings.typeorm.plainObjectToNewEntityTransformerMod.PlainObjectToNewEntityTransformer
import typings.typeorm.queryPartialEntityMod.QueryDeepPartialEntity
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.removeOptionsMod.RemoveOptions
import typings.typeorm.repositoryMod.Repository
import typings.typeorm.saveOptionsMod.SaveOptions
import typings.typeorm.selectQueryBuilderMod.SelectQueryBuilder
import typings.typeorm.treeRepositoryMod.TreeRepository
import typings.typeorm.typingsMod.ObjectID
import typings.typeorm.updateResultMod.UpdateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityManagerMod {
  
  @JSImport("typeorm/browser/entity-manager/EntityManager", "EntityManager")
  @js.native
  class EntityManager protected () extends StObject {
    def this(connection: Connection) = this()
    def this(connection: Connection, queryRunner: QueryRunner) = this()
    
    /**
      * Clears all the data from the given table (truncates/drops it).
      *
      * Note: this method uses TRUNCATE and may not work as you expect in transactions on some platforms.
      * @see https://stackoverflow.com/a/5972738/925151
      */
    def clear[Entity](entityClass: EntityTarget[Entity]): js.Promise[Unit] = js.native
    
    /**
      * Connection used by this entity manager.
      */
    val connection: Connection = js.native
    
    /**
      * Counts entities that match given options.
      * Useful for pagination.
      */
    def count[Entity](entityClass: EntityTarget[Entity]): js.Promise[Double] = js.native
    def count[Entity](entityClass: EntityTarget[Entity], conditions: FindConditions[Entity]): js.Promise[Double] = js.native
    def count[Entity](entityClass: EntityTarget[Entity], options: FindManyOptions[Entity]): js.Promise[Double] = js.native
    def count[Entity](entityClass: EntityTarget[Entity], options: FindOneOptions[Entity]): js.Promise[Double] = js.native
    
    /**
      * Creates a new entity instance and copies all entity properties from this object into a new entity.
      * Note that it copies only properties that present in entity schema.
      */
    def create[Entity](entityClass: EntityTarget[Entity]): Entity = js.native
    def create[Entity](entityClass: EntityTarget[Entity], plainObjects: js.Array[DeepPartial[Entity]]): js.Array[Entity] = js.native
    def create[Entity](entityClass: EntityTarget[Entity], plainObject: DeepPartial[Entity]): Entity = js.native
    
    /**
      * Creates a new query builder that can be used to build a sql query.
      */
    def createQueryBuilder(): SelectQueryBuilder[js.Any] = js.native
    def createQueryBuilder(queryRunner: QueryRunner): SelectQueryBuilder[js.Any] = js.native
    /**
      * Creates a new query builder that can be used to build a sql query.
      */
    def createQueryBuilder[Entity](entityClass: EntityTarget[Entity], alias: String): SelectQueryBuilder[Entity] = js.native
    def createQueryBuilder[Entity](entityClass: EntityTarget[Entity], alias: String, queryRunner: QueryRunner): SelectQueryBuilder[Entity] = js.native
    
    /**
      * Creates a new entities and copies all entity properties from given objects into their new entities.
      * Note that it copies only properties that present in entity schema.
      */
    @JSName("create")
    def create_Entity_Array[Entity](entityClass: EntityTarget[Entity]): js.Array[Entity] = js.native
    
    def decrement[Entity](entityClass: EntityTarget[Entity], conditions: js.Any, propertyPath: String, value: String): js.Promise[UpdateResult] = js.native
    /**
      * Decrements some column by provided value of the entities matched given conditions.
      */
    def decrement[Entity](entityClass: EntityTarget[Entity], conditions: js.Any, propertyPath: String, value: Double): js.Promise[UpdateResult] = js.native
    
    /**
      * Deletes entities by a given condition(s).
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient DELETE query.
      * Does not check if entity exist in the database.
      * Condition(s) cannot be empty.
      */
    def delete[Entity](targetOrEntity: EntityTarget[Entity], criteria: String): js.Promise[DeleteResult] = js.native
    def delete[Entity](targetOrEntity: EntityTarget[Entity], criteria: js.Any): js.Promise[DeleteResult] = js.native
    def delete[Entity](targetOrEntity: EntityTarget[Entity], criteria: js.Array[Date | Double | ObjectID | String]): js.Promise[DeleteResult] = js.native
    def delete[Entity](targetOrEntity: EntityTarget[Entity], criteria: Double): js.Promise[DeleteResult] = js.native
    def delete[Entity](targetOrEntity: EntityTarget[Entity], criteria: Date): js.Promise[DeleteResult] = js.native
    def delete[Entity](targetOrEntity: EntityTarget[Entity], criteria: ObjectID): js.Promise[DeleteResult] = js.native
    
    /**
      * Finds entities that match given options.
      */
    def find[Entity](entityClass: EntityTarget[Entity]): js.Promise[js.Array[Entity]] = js.native
    def find[Entity](entityClass: EntityTarget[Entity], conditions: FindConditions[Entity]): js.Promise[js.Array[Entity]] = js.native
    def find[Entity](entityClass: EntityTarget[Entity], options: FindManyOptions[Entity]): js.Promise[js.Array[Entity]] = js.native
    
    /**
      * Finds entities that match given find options.
      * Also counts all entities that match given conditions,
      * but ignores pagination settings (from and take options).
      */
    def findAndCount[Entity](entityClass: EntityTarget[Entity]): js.Promise[js.Tuple2[js.Array[Entity], Double]] = js.native
    def findAndCount[Entity](entityClass: EntityTarget[Entity], conditions: FindConditions[Entity]): js.Promise[js.Tuple2[js.Array[Entity], Double]] = js.native
    def findAndCount[Entity](entityClass: EntityTarget[Entity], options: FindManyOptions[Entity]): js.Promise[js.Tuple2[js.Array[Entity], Double]] = js.native
    
    /**
      * Finds entities with ids.
      * Optionally find options can be applied.
      */
    def findByIds[Entity](entityClass: EntityTarget[Entity], ids: js.Array[js.Any]): js.Promise[js.Array[Entity]] = js.native
    def findByIds[Entity](entityClass: EntityTarget[Entity], ids: js.Array[js.Any], conditions: FindConditions[Entity]): js.Promise[js.Array[Entity]] = js.native
    def findByIds[Entity](entityClass: EntityTarget[Entity], ids: js.Array[js.Any], options: FindManyOptions[Entity]): js.Promise[js.Array[Entity]] = js.native
    
    /**
      * Finds first entity that matches given find options.
      */
    def findOne[Entity](entityClass: EntityTarget[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], conditions: FindConditions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](
      entityClass: EntityTarget[Entity],
      conditions: FindConditions[Entity],
      options: FindOneOptions[Entity]
    ): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], id: String): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], id: String, options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], id: Double): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], id: Double, options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], id: Unit, options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], id: Date): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], id: Date, options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], id: ObjectID): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], id: ObjectID, options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    def findOne[Entity](entityClass: EntityTarget[Entity], options: FindOneOptions[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    
    /**
      * Finds first entity that matches given find options or rejects the returned promise on error.
      */
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], conditions: FindConditions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](
      entityClass: EntityTarget[Entity],
      conditions: FindConditions[Entity],
      options: FindOneOptions[Entity]
    ): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], id: String): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], id: String, options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], id: Double): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], id: Double, options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], id: Unit, options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], id: Date): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], id: Date, options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], id: ObjectID): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], id: ObjectID, options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    def findOneOrFail[Entity](entityClass: EntityTarget[Entity], options: FindOneOptions[Entity]): js.Promise[Entity] = js.native
    
    /**
      * Gets custom entity repository marked with @EntityRepository decorator.
      */
    def getCustomRepository[T](customRepository: ObjectType[T]): T = js.native
    
    /**
      * Gets entity mixed id.
      */
    def getId(entity: js.Any): js.Any = js.native
    /**
      * Gets entity mixed id.
      */
    def getId(target: EntityTarget[js.Any], entity: js.Any): js.Any = js.native
    
    /**
      * Gets mongodb repository for the given entity class.
      */
    def getMongoRepository[Entity](target: EntityTarget[Entity]): MongoRepository[Entity] = js.native
    
    /**
      * Gets repository for the given entity class or name.
      * If single database connection mode is used, then repository is obtained from the
      * repository aggregator, where each repository is individually created for this entity manager.
      * When single database connection is not used, repository is being obtained from the connection.
      */
    def getRepository[Entity](target: EntityTarget[Entity]): Repository[Entity] = js.native
    
    /**
      * Gets tree repository for the given entity class or name.
      * If single database connection mode is used, then repository is obtained from the
      * repository aggregator, where each repository is individually created for this entity manager.
      * When single database connection is not used, repository is being obtained from the connection.
      */
    def getTreeRepository[Entity](target: EntityTarget[Entity]): TreeRepository[Entity] = js.native
    
    /**
      * Checks if entity has an id.
      */
    def hasId(entity: js.Any): Boolean = js.native
    def hasId(target: String, entity: js.Any): Boolean = js.native
    /**
      * Checks if entity of given schema name has an id.
      */
    def hasId(target: js.Function, entity: js.Any): Boolean = js.native
    
    def increment[Entity](entityClass: EntityTarget[Entity], conditions: js.Any, propertyPath: String, value: String): js.Promise[UpdateResult] = js.native
    /**
      * Increments some column by provided value of the entities matched given conditions.
      */
    def increment[Entity](entityClass: EntityTarget[Entity], conditions: js.Any, propertyPath: String, value: Double): js.Promise[UpdateResult] = js.native
    
    def insert[Entity](target: EntityTarget[Entity], entity: js.Array[QueryDeepPartialEntity[Entity]]): js.Promise[InsertResult] = js.native
    /**
      * Inserts a given entity into the database.
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient INSERT query.
      * Does not check if entity exist in the database, so query will fail if duplicate entity is being inserted.
      * You can execute bulk inserts using this method.
      */
    def insert[Entity](target: EntityTarget[Entity], entity: QueryDeepPartialEntity[Entity]): js.Promise[InsertResult] = js.native
    
    /**
      * Merges two entities into one new entity.
      */
    def merge[Entity](entityClass: EntityTarget[Entity], mergeIntoEntity: Entity, entityLikes: DeepPartial[Entity]*): Entity = js.native
    
    /**
      * Plain to object transformer used in create and merge operations.
      */
    /* protected */ var plainObjectToEntityTransformer: PlainObjectToNewEntityTransformer = js.native
    
    /**
      * Creates a new entity from the given plain javascript object. If entity already exist in the database, then
      * it loads it (and everything related to it), replaces all values with the new ones from the given object
      * and returns this new entity. This new entity is actually a loaded from the db entity with all properties
      * replaced from the new object.
      */
    def preload[Entity](entityClass: EntityTarget[Entity], entityLike: DeepPartial[Entity]): js.Promise[js.UndefOr[Entity]] = js.native
    
    /**
      * Executes raw SQL query and returns raw database results.
      */
    def query(query: String): js.Promise[js.Any] = js.native
    def query(query: String, parameters: js.Array[js.Any]): js.Promise[js.Any] = js.native
    
    /**
      * Custom query runner to be used for operations in this entity manager.
      * Used only in non-global entity manager.
      */
    val queryRunner: js.UndefOr[QueryRunner] = js.native
    
    /**
      * Recovers all given entities.
      */
    def recover[Entity](entities: js.Array[Entity]): js.Promise[js.Array[Entity]] = js.native
    def recover[Entity](entities: js.Array[Entity], options: SaveOptions): js.Promise[js.Array[Entity]] = js.native
    /**
      * Recovers a given entity.
      */
    def recover[Entity](entity: Entity): js.Promise[Entity] = js.native
    def recover[Entity](entity: Entity, options: SaveOptions): js.Promise[Entity] = js.native
    /**
      * Recovers all given entities.
      */
    def recover[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
    def recover[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = js.native
    /**
      * Recovers a given entity.
      */
    def recover[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entity: T): js.Promise[T] = js.native
    def recover[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entity: T, options: SaveOptions): js.Promise[T] = js.native
    
    /**
      * Releases all resources used by entity manager.
      * This is used when entity manager is created with a single query runner,
      * and this single query runner needs to be released after job with entity manager is done.
      */
    def release(): js.Promise[Unit] = js.native
    
    /**
      * Removes a given entity from the database.
      */
    def remove[Entity](entity: Entity): js.Promise[Entity] = js.native
    def remove[Entity](entity: Entity, options: RemoveOptions): js.Promise[Entity] = js.native
    /**
      * Removes a given entity from the database.
      */
    def remove[Entity](entity: js.Array[Entity]): js.Promise[Entity] = js.native
    def remove[Entity](entity: js.Array[Entity], options: RemoveOptions): js.Promise[Entity] = js.native
    /**
      * Removes a given entity from the database.
      */
    def remove[Entity](targetOrEntity: EntityTarget[Entity], entity: Entity): js.Promise[Entity] = js.native
    def remove[Entity](targetOrEntity: EntityTarget[Entity], entity: Entity, options: RemoveOptions): js.Promise[Entity] = js.native
    /**
      * Removes a given entity from the database.
      */
    def remove[Entity](targetOrEntity: EntityTarget[Entity], entity: js.Array[Entity]): js.Promise[js.Array[Entity]] = js.native
    def remove[Entity](targetOrEntity: EntityTarget[Entity], entity: js.Array[Entity], options: RemoveOptions): js.Promise[js.Array[Entity]] = js.native
    
    /**
      * Once created and then reused by en repositories.
      */
    /* protected */ var repositories: js.Array[Repository[js.Any]] = js.native
    
    /**
      * Restores entities by a given condition(s).
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient DELETE query.
      * Does not check if entity exist in the database.
      * Condition(s) cannot be empty.
      */
    def restore[Entity](targetOrEntity: EntityTarget[Entity], criteria: String): js.Promise[UpdateResult] = js.native
    def restore[Entity](targetOrEntity: EntityTarget[Entity], criteria: js.Any): js.Promise[UpdateResult] = js.native
    def restore[Entity](targetOrEntity: EntityTarget[Entity], criteria: js.Array[Date | Double | ObjectID | String]): js.Promise[UpdateResult] = js.native
    def restore[Entity](targetOrEntity: EntityTarget[Entity], criteria: Double): js.Promise[UpdateResult] = js.native
    def restore[Entity](targetOrEntity: EntityTarget[Entity], criteria: Date): js.Promise[UpdateResult] = js.native
    def restore[Entity](targetOrEntity: EntityTarget[Entity], criteria: ObjectID): js.Promise[UpdateResult] = js.native
    
    /**
      * Saves all given entities in the database.
      * If entities do not exist in the database then inserts, otherwise updates.
      */
    def save[Entity](entities: js.Array[Entity]): js.Promise[js.Array[Entity]] = js.native
    def save[Entity](entities: js.Array[Entity], options: SaveOptions): js.Promise[js.Array[Entity]] = js.native
    /**
      * Saves all given entities in the database.
      * If entities do not exist in the database then inserts, otherwise updates.
      */
    def save[Entity](entity: Entity): js.Promise[Entity] = js.native
    def save[Entity](entity: Entity, options: SaveOptions): js.Promise[Entity] = js.native
    /**
      * Saves all given entities in the database.
      * If entities do not exist in the database then inserts, otherwise updates.
      */
    def save[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
    def save[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = js.native
    /**
      * Saves all given entities in the database.
      * If entities do not exist in the database then inserts, otherwise updates.
      */
    def save[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entity: T): js.Promise[T] = js.native
    def save[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entity: T, options: SaveOptions): js.Promise[T] = js.native
    
    /**
      * Records the delete date of entities by a given condition(s).
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient DELETE query.
      * Does not check if entity exist in the database.
      * Condition(s) cannot be empty.
      */
    def softDelete[Entity](targetOrEntity: EntityTarget[Entity], criteria: String): js.Promise[UpdateResult] = js.native
    def softDelete[Entity](targetOrEntity: EntityTarget[Entity], criteria: js.Any): js.Promise[UpdateResult] = js.native
    def softDelete[Entity](targetOrEntity: EntityTarget[Entity], criteria: js.Array[Date | Double | ObjectID | String]): js.Promise[UpdateResult] = js.native
    def softDelete[Entity](targetOrEntity: EntityTarget[Entity], criteria: Double): js.Promise[UpdateResult] = js.native
    def softDelete[Entity](targetOrEntity: EntityTarget[Entity], criteria: Date): js.Promise[UpdateResult] = js.native
    def softDelete[Entity](targetOrEntity: EntityTarget[Entity], criteria: ObjectID): js.Promise[UpdateResult] = js.native
    
    /**
      * Records the delete date of all given entities.
      */
    def softRemove[Entity](entities: js.Array[Entity]): js.Promise[js.Array[Entity]] = js.native
    def softRemove[Entity](entities: js.Array[Entity], options: SaveOptions): js.Promise[js.Array[Entity]] = js.native
    /**
      * Records the delete date of a given entity.
      */
    def softRemove[Entity](entity: Entity): js.Promise[Entity] = js.native
    def softRemove[Entity](entity: Entity, options: SaveOptions): js.Promise[Entity] = js.native
    /**
      * Records the delete date of all given entities.
      */
    def softRemove[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entities: js.Array[T]): js.Promise[js.Array[T]] = js.native
    def softRemove[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entities: js.Array[T], options: SaveOptions): js.Promise[js.Array[T]] = js.native
    /**
      * Records the delete date of a given entity.
      */
    def softRemove[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entity: T): js.Promise[T] = js.native
    def softRemove[Entity, T /* <: DeepPartial[Entity] */](targetOrEntity: EntityTarget[Entity], entity: T, options: SaveOptions): js.Promise[T] = js.native
    
    /**
      * Wraps given function execution (and all operations made there) in a transaction.
      * All database operations must be executed using provided entity manager.
      */
    def transaction[T](
      isolationLevel: IsolationLevel,
      runInTransaction: js.Function1[/* entityManager */ this.type, js.Promise[T]]
    ): js.Promise[T] = js.native
    /**
      * Wraps given function execution (and all operations made there) in a transaction.
      * All database operations must be executed using provided entity manager.
      */
    def transaction[T](runInTransaction: js.Function1[/* entityManager */ this.type, js.Promise[T]]): js.Promise[T] = js.native
    
    /**
      * Updates entity partially. Entity can be found by a given condition(s).
      * Unlike save method executes a primitive operation without cascades, relations and other operations included.
      * Executes fast and efficient UPDATE query.
      * Does not check if entity exist in the database.
      * Condition(s) cannot be empty.
      */
    def update[Entity](target: EntityTarget[Entity], criteria: String, partialEntity: QueryDeepPartialEntity[Entity]): js.Promise[UpdateResult] = js.native
    def update[Entity](target: EntityTarget[Entity], criteria: js.Any, partialEntity: QueryDeepPartialEntity[Entity]): js.Promise[UpdateResult] = js.native
    def update[Entity](
      target: EntityTarget[Entity],
      criteria: js.Array[Date | Double | ObjectID | String],
      partialEntity: QueryDeepPartialEntity[Entity]
    ): js.Promise[UpdateResult] = js.native
    def update[Entity](target: EntityTarget[Entity], criteria: Double, partialEntity: QueryDeepPartialEntity[Entity]): js.Promise[UpdateResult] = js.native
    def update[Entity](target: EntityTarget[Entity], criteria: Date, partialEntity: QueryDeepPartialEntity[Entity]): js.Promise[UpdateResult] = js.native
    def update[Entity](target: EntityTarget[Entity], criteria: ObjectID, partialEntity: QueryDeepPartialEntity[Entity]): js.Promise[UpdateResult] = js.native
  }
}
