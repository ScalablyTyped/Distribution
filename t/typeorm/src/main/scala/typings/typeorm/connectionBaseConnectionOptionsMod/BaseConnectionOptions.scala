package typings.typeorm.connectionBaseConnectionOptionsMod

import typings.typeorm.anon.Duration
import typings.typeorm.anon.EntitiesDir
import typings.typeorm.entitySchemaEntitySchemaMod.EntitySchema
import typings.typeorm.loggerLoggerMod.Logger
import typings.typeorm.loggerLoggerOptionsMod.LoggerOptions
import typings.typeorm.namingStrategyNamingStrategyInterfaceMod.NamingStrategyInterface
import typings.typeorm.typeormStrings.`advanced-console`
import typings.typeorm.typeormStrings.`simple-console`
import typings.typeorm.typeormStrings.all
import typings.typeorm.typeormStrings.debug
import typings.typeorm.typeormStrings.each
import typings.typeorm.typeormStrings.error
import typings.typeorm.typeormStrings.file
import typings.typeorm.typeormStrings.info
import typings.typeorm.typeormStrings.log
import typings.typeorm.typeormStrings.migration
import typings.typeorm.typeormStrings.none
import typings.typeorm.typeormStrings.query
import typings.typeorm.typeormStrings.schema
import typings.typeorm.typeormStrings.warn
import typings.typeorm.typesDatabaseTypeMod.DatabaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseConnectionOptions extends js.Object {
  
  /**
    * Allows to setup cache options.
    */
  val cache: js.UndefOr[Boolean | Duration] = js.native
  
  /**
    * CLI settings.
    */
  val cli: js.UndefOr[EntitiesDir] = js.native
  
  /**
    * Drops the schema each time connection is being established.
    * Be careful with this option and don't use this in production - otherwise you'll lose all production data.
    * This option is useful during debug and development.
    */
  val dropSchema: js.UndefOr[Boolean] = js.native
  
  /**
    * Entities to be loaded for this connection.
    * Accepts both entity classes and directories where from entities need to be loaded.
    * Directories support glob patterns.
    */
  val entities: js.UndefOr[js.Array[js.Function | String | EntitySchema[_]]] = js.native
  
  /**
    * Prefix to use on all tables (collections) of this connection in the database.
    */
  val entityPrefix: js.UndefOr[String] = js.native
  
  /**
    * Extra connection options to be passed to the underlying driver.
    *
    * todo: deprecate this and move all database-specific types into hts own connection options object.
    */
  val extra: js.UndefOr[js.Any] = js.native
  
  /**
    * Logger instance used to log queries and events in the ORM.
    */
  val logger: js.UndefOr[`advanced-console` | `simple-console` | file | debug | Logger] = js.native
  
  /**
    * Logging options.
    */
  val logging: js.UndefOr[LoggerOptions] = js.native
  
  /**
    * Maximum number of milliseconds query should be executed before logger log a warning.
    */
  val maxQueryExecutionTime: js.UndefOr[Double] = js.native
  
  /**
    * Migrations to be loaded for this connection.
    * Accepts both migration classes and directories where from migrations need to be loaded.
    * Directories support glob patterns.
    */
  val migrations: js.UndefOr[js.Array[js.Function | String]] = js.native
  
  /**
    * Indicates if migrations should be auto run on every application launch.
    * Alternative to it, you can use CLI and run migrations:run command.
    */
  val migrationsRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Migrations table name, in case of different name from "migrations".
    * Accepts single string name.
    */
  val migrationsTableName: js.UndefOr[String] = js.native
  
  /**
    * Transaction mode for migrations to run in
    */
  val migrationsTransactionMode: js.UndefOr[all | none | each] = js.native
  
  /**
    * Connection name. If connection name is not given then it will be called "default".
    * Different connections must have different names.
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * Naming strategy to be used to name tables and columns in the database.
    */
  val namingStrategy: js.UndefOr[NamingStrategyInterface] = js.native
  
  /**
    * Subscribers to be loaded for this connection.
    * Accepts both subscriber classes and directories where from subscribers need to be loaded.
    * Directories support glob patterns.
    */
  val subscribers: js.UndefOr[js.Array[js.Function | String]] = js.native
  
  /**
    * Indicates if database schema should be auto created on every application launch.
    * Be careful with this option and don't use this in production - otherwise you can lose production data.
    * This option is useful during debug and development.
    * Alternative to it, you can use CLI and run schema:sync command.
    *
    * Note that for MongoDB database it does not create schema, because MongoDB is schemaless.
    * Instead, it syncs just by creating indices.
    */
  val synchronize: js.UndefOr[Boolean] = js.native
  
  /**
    * Database type. This value is required.
    */
  val `type`: DatabaseType = js.native
}
object BaseConnectionOptions {
  
  @scala.inline
  def apply(`type`: DatabaseType): BaseConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConnectionOptions]
  }
  
  @scala.inline
  implicit class BaseConnectionOptionsOps[Self <: BaseConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: DatabaseType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache(value: Boolean | Duration): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCli(value: EntitiesDir): Self = this.set("cli", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCli: Self = this.set("cli", js.undefined)
    
    @scala.inline
    def setDropSchema(value: Boolean): Self = this.set("dropSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropSchema: Self = this.set("dropSchema", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: (js.Function | String | EntitySchema[js.Any])*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[js.Function | String | EntitySchema[_]]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setEntityPrefix(value: String): Self = this.set("entityPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityPrefix: Self = this.set("entityPrefix", js.undefined)
    
    @scala.inline
    def setExtra(value: js.Any): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setLogger(value: `advanced-console` | `simple-console` | file | debug | Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setLoggingVarargs(value: (query | schema | error | warn | info | log | migration)*): Self = this.set("logging", js.Array(value :_*))
    
    @scala.inline
    def setLogging(value: LoggerOptions): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMaxQueryExecutionTime(value: Double): Self = this.set("maxQueryExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxQueryExecutionTime: Self = this.set("maxQueryExecutionTime", js.undefined)
    
    @scala.inline
    def setMigrationsVarargs(value: (js.Function | String)*): Self = this.set("migrations", js.Array(value :_*))
    
    @scala.inline
    def setMigrations(value: js.Array[js.Function | String]): Self = this.set("migrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrations: Self = this.set("migrations", js.undefined)
    
    @scala.inline
    def setMigrationsRun(value: Boolean): Self = this.set("migrationsRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationsRun: Self = this.set("migrationsRun", js.undefined)
    
    @scala.inline
    def setMigrationsTableName(value: String): Self = this.set("migrationsTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationsTableName: Self = this.set("migrationsTableName", js.undefined)
    
    @scala.inline
    def setMigrationsTransactionMode(value: all | none | each): Self = this.set("migrationsTransactionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationsTransactionMode: Self = this.set("migrationsTransactionMode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamingStrategy(value: NamingStrategyInterface): Self = this.set("namingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamingStrategy: Self = this.set("namingStrategy", js.undefined)
    
    @scala.inline
    def setSubscribersVarargs(value: (js.Function | String)*): Self = this.set("subscribers", js.Array(value :_*))
    
    @scala.inline
    def setSubscribers(value: js.Array[js.Function | String]): Self = this.set("subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribers: Self = this.set("subscribers", js.undefined)
    
    @scala.inline
    def setSynchronize(value: Boolean): Self = this.set("synchronize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronize: Self = this.set("synchronize", js.undefined)
  }
}
