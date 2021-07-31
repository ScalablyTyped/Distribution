package typings.typeorm

import typings.typeorm.typeormStrings.mariadb
import typings.typeorm.typeormStrings.mysql
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionConnectionOptionsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.mysqlMysqlConnectionOptionsMod.MysqlConnectionOptions
    - typings.typeorm.postgresPostgresConnectionOptionsMod.PostgresConnectionOptions
    - typings.typeorm.cockroachdbCockroachConnectionOptionsMod.CockroachConnectionOptions
    - typings.typeorm.sqliteSqliteConnectionOptionsMod.SqliteConnectionOptions
    - typings.typeorm.sqlserverSqlServerConnectionOptionsMod.SqlServerConnectionOptions
    - typings.typeorm.sapSapConnectionOptionsMod.SapConnectionOptions
    - typings.typeorm.oracleOracleConnectionOptionsMod.OracleConnectionOptions
    - typings.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions
    - typings.typeorm.nativescriptNativescriptConnectionOptionsMod.NativescriptConnectionOptions
    - typings.typeorm.reactNativeReactNativeConnectionOptionsMod.ReactNativeConnectionOptions
    - typings.typeorm.sqljsSqljsConnectionOptionsMod.SqljsConnectionOptions
    - typings.typeorm.mongodbMongoConnectionOptionsMod.MongoConnectionOptions
    - typings.typeorm.auroraDataApiAuroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions
    - typings.typeorm.auroraDataApiPgAuroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions
    - typings.typeorm.expoExpoConnectionOptionsMod.ExpoConnectionOptions
    - typings.typeorm.betterSqlite3BetterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions
  */
  trait ConnectionOptions extends StObject
  object ConnectionOptions {
    
    @scala.inline
    def AuroraDataApiConnectionOptions(database: String, region: String, resourceArn: String, secretArn: String): typings.typeorm.auroraDataApiAuroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("aurora-data-api")
      __obj.asInstanceOf[typings.typeorm.auroraDataApiAuroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions]
    }
    
    @scala.inline
    def AuroraDataApiPostgresConnectionOptions(database: String, region: String, resourceArn: String, secretArn: String): typings.typeorm.auroraDataApiPgAuroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("aurora-data-api-pg")
      __obj.asInstanceOf[typings.typeorm.auroraDataApiPgAuroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions]
    }
    
    @scala.inline
    def BetterSqlite3ConnectionOptions(database: String): typings.typeorm.betterSqlite3BetterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("better-sqlite3")
      __obj.asInstanceOf[typings.typeorm.betterSqlite3BetterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions]
    }
    
    @scala.inline
    def CockroachConnectionOptions(): typings.typeorm.cockroachdbCockroachConnectionOptionsMod.CockroachConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("cockroachdb")
      __obj.asInstanceOf[typings.typeorm.cockroachdbCockroachConnectionOptionsMod.CockroachConnectionOptions]
    }
    
    @scala.inline
    def CordovaConnectionOptions(database: String, location: String): typings.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cordova")
      __obj.asInstanceOf[typings.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions]
    }
    
    @scala.inline
    def ExpoConnectionOptions(database: String, driver: js.Any): typings.typeorm.expoExpoConnectionOptionsMod.ExpoConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("expo")
      __obj.asInstanceOf[typings.typeorm.expoExpoConnectionOptionsMod.ExpoConnectionOptions]
    }
    
    @scala.inline
    def MongoConnectionOptions(): typings.typeorm.mongodbMongoConnectionOptionsMod.MongoConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("mongodb")
      __obj.asInstanceOf[typings.typeorm.mongodbMongoConnectionOptionsMod.MongoConnectionOptions]
    }
    
    @scala.inline
    def MysqlConnectionOptions(`type`: mysql | mariadb): typings.typeorm.mysqlMysqlConnectionOptionsMod.MysqlConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.mysqlMysqlConnectionOptionsMod.MysqlConnectionOptions]
    }
    
    @scala.inline
    def NativescriptConnectionOptions(database: String, driver: js.Any): typings.typeorm.nativescriptNativescriptConnectionOptionsMod.NativescriptConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("nativescript")
      __obj.asInstanceOf[typings.typeorm.nativescriptNativescriptConnectionOptionsMod.NativescriptConnectionOptions]
    }
    
    @scala.inline
    def OracleConnectionOptions(): typings.typeorm.oracleOracleConnectionOptionsMod.OracleConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("oracle")
      __obj.asInstanceOf[typings.typeorm.oracleOracleConnectionOptionsMod.OracleConnectionOptions]
    }
    
    @scala.inline
    def PostgresConnectionOptions(): typings.typeorm.postgresPostgresConnectionOptionsMod.PostgresConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("postgres")
      __obj.asInstanceOf[typings.typeorm.postgresPostgresConnectionOptionsMod.PostgresConnectionOptions]
    }
    
    @scala.inline
    def ReactNativeConnectionOptions(database: String, location: String): typings.typeorm.reactNativeReactNativeConnectionOptionsMod.ReactNativeConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("react-native")
      __obj.asInstanceOf[typings.typeorm.reactNativeReactNativeConnectionOptionsMod.ReactNativeConnectionOptions]
    }
    
    @scala.inline
    def SapConnectionOptions(): typings.typeorm.sapSapConnectionOptionsMod.SapConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sap")
      __obj.asInstanceOf[typings.typeorm.sapSapConnectionOptionsMod.SapConnectionOptions]
    }
    
    @scala.inline
    def SqlServerConnectionOptions(): typings.typeorm.sqlserverSqlServerConnectionOptionsMod.SqlServerConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("mssql")
      __obj.asInstanceOf[typings.typeorm.sqlserverSqlServerConnectionOptionsMod.SqlServerConnectionOptions]
    }
    
    @scala.inline
    def SqliteConnectionOptions(database: String): typings.typeorm.sqliteSqliteConnectionOptionsMod.SqliteConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sqlite")
      __obj.asInstanceOf[typings.typeorm.sqliteSqliteConnectionOptionsMod.SqliteConnectionOptions]
    }
    
    @scala.inline
    def SqljsConnectionOptions(): typings.typeorm.sqljsSqljsConnectionOptionsMod.SqljsConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sqljs")
      __obj.asInstanceOf[typings.typeorm.sqljsSqljsConnectionOptionsMod.SqljsConnectionOptions]
    }
  }
}
