package typings.typeorm

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionBaseConnectionOptionsMod {
  
  trait BaseConnectionOptions extends StObject {
    
    /**
      * Allows to setup cache options.
      */
    val cache: js.UndefOr[Boolean | Duration] = js.undefined
    
    /**
      * CLI settings.
      */
    val cli: js.UndefOr[EntitiesDir] = js.undefined
    
    /**
      * Drops the schema each time connection is being established.
      * Be careful with this option and don't use this in production - otherwise you'll lose all production data.
      * This option is useful during debug and development.
      */
    val dropSchema: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Entities to be loaded for this connection.
      * Accepts both entity classes and directories where from entities need to be loaded.
      * Directories support glob patterns.
      */
    val entities: js.UndefOr[js.Array[js.Function | String | EntitySchema[js.Any]]] = js.undefined
    
    /**
      * Prefix to use on all tables (collections) of this connection in the database.
      */
    val entityPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Extra connection options to be passed to the underlying driver.
      *
      * todo: deprecate this and move all database-specific types into hts own connection options object.
      */
    val extra: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Logger instance used to log queries and events in the ORM.
      */
    val logger: js.UndefOr[`advanced-console` | `simple-console` | file | debug | Logger] = js.undefined
    
    /**
      * Logging options.
      */
    val logging: js.UndefOr[LoggerOptions] = js.undefined
    
    /**
      * Maximum number of milliseconds query should be executed before logger log a warning.
      */
    val maxQueryExecutionTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Migrations to be loaded for this connection.
      * Accepts both migration classes and directories where from migrations need to be loaded.
      * Directories support glob patterns.
      */
    val migrations: js.UndefOr[js.Array[js.Function | String]] = js.undefined
    
    /**
      * Indicates if migrations should be auto run on every application launch.
      * Alternative to it, you can use CLI and run migrations:run command.
      */
    val migrationsRun: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Migrations table name, in case of different name from "migrations".
      * Accepts single string name.
      */
    val migrationsTableName: js.UndefOr[String] = js.undefined
    
    /**
      * Transaction mode for migrations to run in
      */
    val migrationsTransactionMode: js.UndefOr[all | none | each] = js.undefined
    
    /**
      * Connection name. If connection name is not given then it will be called "default".
      * Different connections must have different names.
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * Naming strategy to be used to name tables and columns in the database.
      */
    val namingStrategy: js.UndefOr[NamingStrategyInterface] = js.undefined
    
    /**
      * Subscribers to be loaded for this connection.
      * Accepts both subscriber classes and directories where from subscribers need to be loaded.
      * Directories support glob patterns.
      */
    val subscribers: js.UndefOr[js.Array[js.Function | String]] = js.undefined
    
    /**
      * Indicates if database schema should be auto created on every application launch.
      * Be careful with this option and don't use this in production - otherwise you can lose production data.
      * This option is useful during debug and development.
      * Alternative to it, you can use CLI and run schema:sync command.
      *
      * Note that for MongoDB database it does not create schema, because MongoDB is schemaless.
      * Instead, it syncs just by creating indices.
      */
    val synchronize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Database type. This value is required.
      */
    val `type`: DatabaseType
  }
  object BaseConnectionOptions {
    
    @scala.inline
    def apply(`type`: DatabaseType): BaseConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseConnectionOptions]
    }
    
    @scala.inline
    implicit class BaseConnectionOptionsMutableBuilder[Self <: BaseConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean | Duration): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCli(value: EntitiesDir): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCliUndefined: Self = StObject.set(x, "cli", js.undefined)
      
      @scala.inline
      def setDropSchema(value: Boolean): Self = StObject.set(x, "dropSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropSchemaUndefined: Self = StObject.set(x, "dropSchema", js.undefined)
      
      @scala.inline
      def setEntities(value: js.Array[js.Function | String | EntitySchema[js.Any]]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
      
      @scala.inline
      def setEntitiesVarargs(value: (js.Function | String | EntitySchema[js.Any])*): Self = StObject.set(x, "entities", js.Array(value :_*))
      
      @scala.inline
      def setEntityPrefix(value: String): Self = StObject.set(x, "entityPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityPrefixUndefined: Self = StObject.set(x, "entityPrefix", js.undefined)
      
      @scala.inline
      def setExtra(value: js.Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setLogger(value: `advanced-console` | `simple-console` | file | debug | Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setLogging(value: LoggerOptions): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setLoggingVarargs(value: (query | schema | error | warn | info | log | migration)*): Self = StObject.set(x, "logging", js.Array(value :_*))
      
      @scala.inline
      def setMaxQueryExecutionTime(value: Double): Self = StObject.set(x, "maxQueryExecutionTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxQueryExecutionTimeUndefined: Self = StObject.set(x, "maxQueryExecutionTime", js.undefined)
      
      @scala.inline
      def setMigrations(value: js.Array[js.Function | String]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationsRun(value: Boolean): Self = StObject.set(x, "migrationsRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationsRunUndefined: Self = StObject.set(x, "migrationsRun", js.undefined)
      
      @scala.inline
      def setMigrationsTableName(value: String): Self = StObject.set(x, "migrationsTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationsTableNameUndefined: Self = StObject.set(x, "migrationsTableName", js.undefined)
      
      @scala.inline
      def setMigrationsTransactionMode(value: all | none | each): Self = StObject.set(x, "migrationsTransactionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationsTransactionModeUndefined: Self = StObject.set(x, "migrationsTransactionMode", js.undefined)
      
      @scala.inline
      def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
      
      @scala.inline
      def setMigrationsVarargs(value: (js.Function | String)*): Self = StObject.set(x, "migrations", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNamingStrategy(value: NamingStrategyInterface): Self = StObject.set(x, "namingStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamingStrategyUndefined: Self = StObject.set(x, "namingStrategy", js.undefined)
      
      @scala.inline
      def setSubscribers(value: js.Array[js.Function | String]): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribersUndefined: Self = StObject.set(x, "subscribers", js.undefined)
      
      @scala.inline
      def setSubscribersVarargs(value: (js.Function | String)*): Self = StObject.set(x, "subscribers", js.Array(value :_*))
      
      @scala.inline
      def setSynchronize(value: Boolean): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronizeUndefined: Self = StObject.set(x, "synchronize", js.undefined)
      
      @scala.inline
      def setType(value: DatabaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
