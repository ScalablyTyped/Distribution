package typings.typeorm

import typings.typeorm.typeormStrings.mariadb
import typings.typeorm.typeormStrings.mysql
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def AuroraDataApiConnectionOptions(database: String, region: String, resourceArn: String, secretArn: String): typings.typeorm.auroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("aurora-data-api")
      __obj.asInstanceOf[typings.typeorm.auroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions]
    }
    
    @scala.inline
    def AuroraDataApiPostgresConnectionOptions(database: String, region: String, resourceArn: String, secretArn: String): typings.typeorm.auroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("aurora-data-api-pg")
      __obj.asInstanceOf[typings.typeorm.auroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions]
    }
    
    @scala.inline
    def BetterSqlite3ConnectionOptions(database: String): typings.typeorm.betterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("better-sqlite3")
      __obj.asInstanceOf[typings.typeorm.betterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions]
    }
    
    @scala.inline
    def CockroachConnectionOptions(): typings.typeorm.cockroachConnectionOptionsMod.CockroachConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("cockroachdb")
      __obj.asInstanceOf[typings.typeorm.cockroachConnectionOptionsMod.CockroachConnectionOptions]
    }
    
    @scala.inline
    def CordovaConnectionOptions(database: String, location: String): typings.typeorm.cordovaConnectionOptionsMod.CordovaConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cordova")
      __obj.asInstanceOf[typings.typeorm.cordovaConnectionOptionsMod.CordovaConnectionOptions]
    }
    
    @scala.inline
    def ExpoConnectionOptions(database: String, driver: js.Any): typings.typeorm.expoConnectionOptionsMod.ExpoConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("expo")
      __obj.asInstanceOf[typings.typeorm.expoConnectionOptionsMod.ExpoConnectionOptions]
    }
    
    @scala.inline
    def MongoConnectionOptions(): typings.typeorm.mongoConnectionOptionsMod.MongoConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("mongodb")
      __obj.asInstanceOf[typings.typeorm.mongoConnectionOptionsMod.MongoConnectionOptions]
    }
    
    @scala.inline
    def MysqlConnectionOptions(`type`: mysql | mariadb): typings.typeorm.mysqlConnectionOptionsMod.MysqlConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typeorm.mysqlConnectionOptionsMod.MysqlConnectionOptions]
    }
    
    @scala.inline
    def NativescriptConnectionOptions(database: String, driver: js.Any): typings.typeorm.nativescriptConnectionOptionsMod.NativescriptConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("nativescript")
      __obj.asInstanceOf[typings.typeorm.nativescriptConnectionOptionsMod.NativescriptConnectionOptions]
    }
    
    @scala.inline
    def OracleConnectionOptions(): typings.typeorm.oracleConnectionOptionsMod.OracleConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("oracle")
      __obj.asInstanceOf[typings.typeorm.oracleConnectionOptionsMod.OracleConnectionOptions]
    }
    
    @scala.inline
    def PostgresConnectionOptions(): typings.typeorm.postgresConnectionOptionsMod.PostgresConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("postgres")
      __obj.asInstanceOf[typings.typeorm.postgresConnectionOptionsMod.PostgresConnectionOptions]
    }
    
    @scala.inline
    def ReactNativeConnectionOptions(database: String, location: String): typings.typeorm.reactNativeConnectionOptionsMod.ReactNativeConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("react-native")
      __obj.asInstanceOf[typings.typeorm.reactNativeConnectionOptionsMod.ReactNativeConnectionOptions]
    }
    
    @scala.inline
    def SapConnectionOptions(): typings.typeorm.sapConnectionOptionsMod.SapConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sap")
      __obj.asInstanceOf[typings.typeorm.sapConnectionOptionsMod.SapConnectionOptions]
    }
    
    @scala.inline
    def SqlServerConnectionOptions(): typings.typeorm.sqlServerConnectionOptionsMod.SqlServerConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("mssql")
      __obj.asInstanceOf[typings.typeorm.sqlServerConnectionOptionsMod.SqlServerConnectionOptions]
    }
    
    @scala.inline
    def SqliteConnectionOptions(database: String): typings.typeorm.sqliteConnectionOptionsMod.SqliteConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sqlite")
      __obj.asInstanceOf[typings.typeorm.sqliteConnectionOptionsMod.SqliteConnectionOptions]
    }
    
    @scala.inline
    def SqljsConnectionOptions(): typings.typeorm.sqljsConnectionOptionsMod.SqljsConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sqljs")
      __obj.asInstanceOf[typings.typeorm.sqljsConnectionOptionsMod.SqljsConnectionOptions]
    }
  }
}
