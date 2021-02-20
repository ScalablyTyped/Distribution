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

object connectionOptionsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.mysqlConnectionOptionsMod.MysqlConnectionOptions
    - typings.typeorm.postgresConnectionOptionsMod.PostgresConnectionOptions
    - typings.typeorm.cockroachConnectionOptionsMod.CockroachConnectionOptions
    - typings.typeorm.sqliteConnectionOptionsMod.SqliteConnectionOptions
    - typings.typeorm.sqlServerConnectionOptionsMod.SqlServerConnectionOptions
    - typings.typeorm.sapConnectionOptionsMod.SapConnectionOptions
    - typings.typeorm.oracleConnectionOptionsMod.OracleConnectionOptions
    - typings.typeorm.cordovaConnectionOptionsMod.CordovaConnectionOptions
    - typings.typeorm.nativescriptConnectionOptionsMod.NativescriptConnectionOptions
    - typings.typeorm.reactNativeConnectionOptionsMod.ReactNativeConnectionOptions
    - typings.typeorm.sqljsConnectionOptionsMod.SqljsConnectionOptions
    - typings.typeorm.mongoConnectionOptionsMod.MongoConnectionOptions
    - typings.typeorm.auroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions
    - typings.typeorm.auroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions
    - typings.typeorm.expoConnectionOptionsMod.ExpoConnectionOptions
    - typings.typeorm.betterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions
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
    ): typings.typeorm.auroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.auroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions]
    }
    
    @scala.inline
    def AuroraDataApiPostgresConnectionOptions(
      database: String,
      region: String,
      resourceArn: String,
      secretArn: String,
      `type`: `aurora-data-api-pg`
    ): typings.typeorm.auroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.auroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions]
    }
    
    @scala.inline
    def BetterSqlite3ConnectionOptions(database: String, `type`: `better-sqlite3`): typings.typeorm.betterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.betterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions]
    }
    
    @scala.inline
    def CockroachConnectionOptions(`type`: cockroachdb): typings.typeorm.cockroachConnectionOptionsMod.CockroachConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.cockroachConnectionOptionsMod.CockroachConnectionOptions]
    }
    
    @scala.inline
    def CordovaConnectionOptions(database: String, location: String, `type`: cordova): typings.typeorm.cordovaConnectionOptionsMod.CordovaConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.cordovaConnectionOptionsMod.CordovaConnectionOptions]
    }
    
    @scala.inline
    def ExpoConnectionOptions(database: String, driver: js.Any, `type`: expo): typings.typeorm.expoConnectionOptionsMod.ExpoConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.expoConnectionOptionsMod.ExpoConnectionOptions]
    }
    
    @scala.inline
    def MongoConnectionOptions(`type`: mongodb): typings.typeorm.mongoConnectionOptionsMod.MongoConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.mongoConnectionOptionsMod.MongoConnectionOptions]
    }
    
    @scala.inline
    def MysqlConnectionOptions(`type`: mysql | mariadb): typings.typeorm.mysqlConnectionOptionsMod.MysqlConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.mysqlConnectionOptionsMod.MysqlConnectionOptions]
    }
    
    @scala.inline
    def NativescriptConnectionOptions(database: String, driver: js.Any, `type`: nativescript): typings.typeorm.nativescriptConnectionOptionsMod.NativescriptConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.nativescriptConnectionOptionsMod.NativescriptConnectionOptions]
    }
    
    @scala.inline
    def OracleConnectionOptions(`type`: oracle): typings.typeorm.oracleConnectionOptionsMod.OracleConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.oracleConnectionOptionsMod.OracleConnectionOptions]
    }
    
    @scala.inline
    def PostgresConnectionOptions(`type`: postgres): typings.typeorm.postgresConnectionOptionsMod.PostgresConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.postgresConnectionOptionsMod.PostgresConnectionOptions]
    }
    
    @scala.inline
    def ReactNativeConnectionOptions(database: String, location: String, `type`: `react-native`): typings.typeorm.reactNativeConnectionOptionsMod.ReactNativeConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.reactNativeConnectionOptionsMod.ReactNativeConnectionOptions]
    }
    
    @scala.inline
    def SapConnectionOptions(`type`: sap): typings.typeorm.sapConnectionOptionsMod.SapConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.sapConnectionOptionsMod.SapConnectionOptions]
    }
    
    @scala.inline
    def SqlServerConnectionOptions(`type`: mssql): typings.typeorm.sqlServerConnectionOptionsMod.SqlServerConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.sqlServerConnectionOptionsMod.SqlServerConnectionOptions]
    }
    
    @scala.inline
    def SqliteConnectionOptions(database: String, `type`: sqlite): typings.typeorm.sqliteConnectionOptionsMod.SqliteConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.sqliteConnectionOptionsMod.SqliteConnectionOptions]
    }
    
    @scala.inline
    def SqljsConnectionOptions(`type`: sqljs): typings.typeorm.sqljsConnectionOptionsMod.SqljsConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.sqljsConnectionOptionsMod.SqljsConnectionOptions]
    }
  }
}
