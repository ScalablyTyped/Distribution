package typings.typeorm

import typings.typeorm.anon.Transaction
import typings.typeorm.cacheQueryResultCacheMod.QueryResultCache
import typings.typeorm.commonEntityTargetMod.EntityTarget
import typings.typeorm.commonObjectTypeMod.ObjectType
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.driverDriverMod.Driver
import typings.typeorm.entityManagerEntityManagerMod.EntityManager
import typings.typeorm.entityManagerMongoEntityManagerMod.MongoEntityManager
import typings.typeorm.entityManagerSqljsEntityManagerMod.SqljsEntityManager
import typings.typeorm.loggerLoggerMod.Logger
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.migrationMigrationInterfaceMod.MigrationInterface
import typings.typeorm.migrationMigrationMod.Migration
import typings.typeorm.namingStrategyNamingStrategyInterfaceMod.NamingStrategyInterface
import typings.typeorm.queryBuilderRelationLoaderMod.RelationLoader
import typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.repositoryMongoRepositoryMod.MongoRepository
import typings.typeorm.repositoryRepositoryMod.Repository
import typings.typeorm.repositoryTreeRepositoryMod.TreeRepository
import typings.typeorm.subscriberEntitySubscriberInterfaceMod.EntitySubscriberInterface
import typings.typeorm.typeormRelationIdLoaderMod.RelationIdLoader
import typings.typeorm.typesIsolationLevelMod.IsolationLevel
import typings.typeorm.typesReplicationModeMod.ReplicationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/connection/Connection", JSImport.Namespace)
@js.native
object connectionConnectionMod extends js.Object {
  
  @js.native
  class Connection protected () extends js.Object {
    def this(options: ConnectionOptions) = this()
    
    /**
      * Builds metadatas for all registered classes inside this connection.
      */
    /* protected */ def buildMetadatas(): Unit = js.native
    
    /**
      * Closes connection with the database.
      * Once connection is closed, you cannot use repositories or perform any operations except opening connection again.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Performs connection to the database.
      * This method should be called once on application bootstrap.
      * This method not necessarily creates database connection (depend on database type),
      * but it also can setup a connection pool with database to use.
      */
    def connect(): js.Promise[this.type] = js.native
    
    /**
      * Creates an Entity Manager for the current connection with the help of the EntityManagerFactory.
      */
    def createEntityManager(): EntityManager = js.native
    def createEntityManager(queryRunner: QueryRunner): EntityManager = js.native
    
    /**
      * Creates a new query builder that can be used to build a sql query.
      */
    def createQueryBuilder(): SelectQueryBuilder[_] = js.native
    def createQueryBuilder(queryRunner: QueryRunner): SelectQueryBuilder[_] = js.native
    /**
      * Creates a new query builder that can be used to build a sql query.
      */
    def createQueryBuilder[Entity](entityClass: EntityTarget[Entity], alias: String): SelectQueryBuilder[Entity] = js.native
    def createQueryBuilder[Entity](entityClass: EntityTarget[Entity], alias: String, queryRunner: QueryRunner): SelectQueryBuilder[Entity] = js.native
    
    /**
      * Creates a query runner used for perform queries on a single database connection.
      * Using query runners you can control your queries to execute using single database connection and
      * manually control your database transaction.
      *
      * Mode is used in replication mode and indicates whatever you want to connect
      * to master database or any of slave databases.
      * If you perform writes you must use master database,
      * if you perform reads you can use slave databases.
      */
    def createQueryRunner(): QueryRunner = js.native
    def createQueryRunner(mode: ReplicationMode): QueryRunner = js.native
    
    /**
      * Database driver used by this connection.
      */
    val driver: Driver = js.native
    
    /**
      * Drops the database and all its data.
      * Be careful with this method on production since this method will erase all your database tables and their data.
      * Can be used only after connection to the database is established.
      */
    def dropDatabase(): js.Promise[Unit] = js.native
    
    /**
      * All entity metadatas that are registered for this connection.
      */
    val entityMetadatas: js.Array[EntityMetadata] = js.native
    
    /**
      * Finds exist entity metadata by the given entity class, target name or table name.
      */
    /* protected */ def findMetadata(target: EntityTarget[_]): js.UndefOr[EntityMetadata] = js.native
    
    /**
      * Gets custom entity repository marked with @EntityRepository decorator.
      */
    def getCustomRepository[T](customRepository: ObjectType[T]): T = js.native
    
    /* protected */ def getDatabaseName(): String = js.native
    
    /**
      * Gets entity metadata of the junction table (many-to-many table).
      */
    def getManyToManyMetadata(entityTarget: EntityTarget[_], relationPropertyPath: String): js.UndefOr[EntityMetadata] = js.native
    
    /**
      * Gets entity metadata for the given entity class or schema name.
      */
    def getMetadata(target: EntityTarget[_]): EntityMetadata = js.native
    
    /**
      * Gets mongodb-specific repository for the given entity class or name.
      * Works only if connection is mongodb-specific.
      */
    def getMongoRepository[Entity](target: EntityTarget[Entity]): MongoRepository[Entity] = js.native
    
    /**
      * Gets repository for the given entity.
      */
    def getRepository[Entity](target: EntityTarget[Entity]): Repository[Entity] = js.native
    
    /**
      * Gets tree repository for the given entity class or name.
      * Only tree-type entities can have a TreeRepository, like ones decorated with @Tree decorator.
      */
    def getTreeRepository[Entity](target: EntityTarget[Entity]): TreeRepository[Entity] = js.native
    
    /**
      * Checks if entity metadata exist for the given entity class, target name or table name.
      */
    def hasMetadata(target: EntityTarget[_]): Boolean = js.native
    
    /**
      * Indicates if connection is initialized or not.
      */
    val isConnected: Boolean = js.native
    
    /**
      * Logger used to log orm events.
      */
    val logger: Logger = js.native
    
    /**
      * EntityManager of this connection.
      */
    val manager: EntityManager = js.native
    
    /**
      * Migration instances that are registered for this connection.
      */
    val migrations: js.Array[MigrationInterface] = js.native
    
    /**
      * Gets the mongodb entity manager that allows to perform mongodb-specific repository operations
      * with any entity in this connection.
      *
      * Available only in mongodb connections.
      */
    val mongoManager: MongoEntityManager = js.native
    
    /**
      * Connection name.
      */
    val name: String = js.native
    
    /**
      * Naming strategy used in the connection.
      */
    val namingStrategy: NamingStrategyInterface = js.native
    
    /**
      * Connection options.
      */
    val options: ConnectionOptions = js.native
    
    /**
      * Executes raw SQL query and returns raw database results.
      */
    def query(query: String): js.Promise[_] = js.native
    def query(query: String, parameters: js.UndefOr[scala.Nothing], queryRunner: QueryRunner): js.Promise[_] = js.native
    def query(query: String, parameters: js.Array[_]): js.Promise[_] = js.native
    def query(query: String, parameters: js.Array[_], queryRunner: QueryRunner): js.Promise[_] = js.native
    
    /**
      * Used to work with query result cache.
      */
    val queryResultCache: js.UndefOr[QueryResultCache] = js.native
    
    /**
      * Used to load relation ids of specific entity relations.
      */
    val relationIdLoader: RelationIdLoader = js.native
    
    /**
      * Used to load relations and work with lazy relations.
      */
    val relationLoader: RelationLoader = js.native
    
    /**
      * Runs all pending migrations.
      * Can be used only after connection to the database is established.
      */
    def runMigrations(): js.Promise[js.Array[Migration]] = js.native
    def runMigrations(options: Transaction): js.Promise[js.Array[Migration]] = js.native
    
    /**
      * Lists all migrations and whether they have been run.
      * Returns true if there are pending migrations
      */
    def showMigrations(): js.Promise[Boolean] = js.native
    
    /**
      * Gets a sql.js specific Entity Manager that allows to perform special load and save operations
      *
      * Available only in connection with the sqljs driver.
      */
    val sqljsManager: SqljsEntityManager = js.native
    
    /**
      * Entity subscriber instances that are registered for this connection.
      */
    val subscribers: js.Array[EntitySubscriberInterface[_]] = js.native
    
    /**
      * Creates database schema for all entities registered in this connection.
      * Can be used only after connection to the database is established.
      *
      * @param dropBeforeSync If set to true then it drops the database with all its tables and data
      */
    def synchronize(): js.Promise[Unit] = js.native
    def synchronize(dropBeforeSync: Boolean): js.Promise[Unit] = js.native
    
    def transaction[T](
      isolationLevel: IsolationLevel,
      runInTransaction: js.Function1[/* entityManager */ EntityManager, js.Promise[T]]
    ): js.Promise[T] = js.native
    /**
      * Wraps given function execution (and all operations made there) into a transaction.
      * All database operations must be executed using provided entity manager.
      */
    def transaction[T](runInTransaction: js.Function1[/* entityManager */ EntityManager, js.Promise[T]]): js.Promise[T] = js.native
    
    /**
      * Reverts last executed migration.
      * Can be used only after connection to the database is established.
      */
    def undoLastMigration(): js.Promise[Unit] = js.native
    def undoLastMigration(options: Transaction): js.Promise[Unit] = js.native
  }
}
