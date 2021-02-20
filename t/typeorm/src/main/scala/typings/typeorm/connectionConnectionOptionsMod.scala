package typings.typeorm

import typings.typeorm.typeormStrings.`aurora-data-api-pg`
import typings.typeorm.typeormStrings.`aurora-data-api`
import typings.typeorm.typeormStrings.`better-sqlite3`
import typings.typeorm.typeormStrings.`react-native`
import typings.typeorm.typeormStrings.cockroachdb
import typings.typeorm.typeormStrings.cordova
import typings.typeorm.typeormStrings.expo
import typings.typeorm.typeormStrings.mariadb
import typings.typeorm.typeormStrings.mongodb
import typings.typeorm.typeormStrings.mssql
import typings.typeorm.typeormStrings.mysql
import typings.typeorm.typeormStrings.nativescript
import typings.typeorm.typeormStrings.oracle
import typings.typeorm.typeormStrings.postgres
import typings.typeorm.typeormStrings.sap
import typings.typeorm.typeormStrings.sqlite
import typings.typeorm.typeormStrings.sqljs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def AuroraDataApiConnectionOptions(
      database: String,
      region: String,
      resourceArn: String,
      secretArn: String,
      `type`: `aurora-data-api`
    ): typings.typeorm.auroraDataApiAuroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.auroraDataApiAuroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions]
    }
    
    @scala.inline
    def AuroraDataApiPostgresConnectionOptions(
      database: String,
      region: String,
      resourceArn: String,
      secretArn: String,
      `type`: `aurora-data-api-pg`
    ): typings.typeorm.auroraDataApiPgAuroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.auroraDataApiPgAuroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions]
    }
    
    @scala.inline
    def BetterSqlite3ConnectionOptions(database: String, `type`: `better-sqlite3`): typings.typeorm.betterSqlite3BetterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.betterSqlite3BetterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions]
    }
    
    @scala.inline
    def CockroachConnectionOptions(`type`: cockroachdb): typings.typeorm.cockroachdbCockroachConnectionOptionsMod.CockroachConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.cockroachdbCockroachConnectionOptionsMod.CockroachConnectionOptions]
    }
    
    @scala.inline
    def CordovaConnectionOptions(database: String, location: String, `type`: cordova): typings.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions]
    }
    
    @scala.inline
    def ExpoConnectionOptions(database: String, driver: js.Any, `type`: expo): typings.typeorm.expoExpoConnectionOptionsMod.ExpoConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.expoExpoConnectionOptionsMod.ExpoConnectionOptions]
    }
    
    @scala.inline
    def MongoConnectionOptions(`type`: mongodb): typings.typeorm.mongodbMongoConnectionOptionsMod.MongoConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.mongodbMongoConnectionOptionsMod.MongoConnectionOptions]
    }
    
    @scala.inline
    def MysqlConnectionOptions(`type`: mysql | mariadb): typings.typeorm.mysqlMysqlConnectionOptionsMod.MysqlConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.mysqlMysqlConnectionOptionsMod.MysqlConnectionOptions]
    }
    
    @scala.inline
    def NativescriptConnectionOptions(database: String, driver: js.Any, `type`: nativescript): typings.typeorm.nativescriptNativescriptConnectionOptionsMod.NativescriptConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.nativescriptNativescriptConnectionOptionsMod.NativescriptConnectionOptions]
    }
    
    @scala.inline
    def OracleConnectionOptions(`type`: oracle): typings.typeorm.oracleOracleConnectionOptionsMod.OracleConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.oracleOracleConnectionOptionsMod.OracleConnectionOptions]
    }
    
    @scala.inline
    def PostgresConnectionOptions(`type`: postgres): typings.typeorm.postgresPostgresConnectionOptionsMod.PostgresConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.postgresPostgresConnectionOptionsMod.PostgresConnectionOptions]
    }
    
    @scala.inline
    def ReactNativeConnectionOptions(database: String, location: String, `type`: `react-native`): typings.typeorm.reactNativeReactNativeConnectionOptionsMod.ReactNativeConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.reactNativeReactNativeConnectionOptionsMod.ReactNativeConnectionOptions]
    }
    
    @scala.inline
    def SapConnectionOptions(`type`: sap): typings.typeorm.sapSapConnectionOptionsMod.SapConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.sapSapConnectionOptionsMod.SapConnectionOptions]
    }
    
    @scala.inline
    def SqlServerConnectionOptions(`type`: mssql): typings.typeorm.sqlserverSqlServerConnectionOptionsMod.SqlServerConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.sqlserverSqlServerConnectionOptionsMod.SqlServerConnectionOptions]
    }
    
    @scala.inline
    def SqliteConnectionOptions(database: String, `type`: sqlite): typings.typeorm.sqliteSqliteConnectionOptionsMod.SqliteConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.sqliteSqliteConnectionOptionsMod.SqliteConnectionOptions]
    }
    
    @scala.inline
    def SqljsConnectionOptions(`type`: sqljs): typings.typeorm.sqljsSqljsConnectionOptionsMod.SqljsConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.sqljsSqljsConnectionOptionsMod.SqljsConnectionOptions]
    }
  }
}
