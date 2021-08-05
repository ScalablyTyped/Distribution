package typings.typeorm

import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.nativescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativescriptConnectionOptionsMod {
  
  trait NativescriptConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Flags to pass to SQLite when opening the database on Android. (see https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.html)
      */
    val androidFlags: js.UndefOr[Double] = js.undefined
    
    /**
      * Database name.
      */
    val database: String
    
    /**
      * The driver object
      * you should pass `require('nativescript-sqlite') here
      */
    val driver: js.Any
    
    /**
      * Flags to pass to SQLite when opening the database on iOS. (see https://www.sqlite.org/c3ref/open.html)
      */
    val iosFlags: js.UndefOr[Double] = js.undefined
    
    /**
      * The key to use for for using/opening encrypted databases. (requires the "Encrypted Plugin")
      */
    val key: js.UndefOr[String] = js.undefined
    
    /**
      * Migrates a Encrypted Sql database from v3 to the new v4. If you are a new user you do not need to set this flag as new created databases will already be in v4.
      * If you are upgrading a app that used v1.3.0 or earlier of NS-Sqlite-Encrypted; then you will probably want to set this flag to true. (requires the "Encrypted Plugin")
      */
    val migrate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to enable background multitasking. All SQL is ran on a background worker thread. (requires the "Commercial Plugin")
      */
    val multithreading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to mark the mark the database as read only on open (iOS only).
      */
    val readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_NativescriptConnectionOptions: nativescript
  }
  object NativescriptConnectionOptions {
    
    inline def apply(database: String, driver: js.Any): NativescriptConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("nativescript")
      __obj.asInstanceOf[NativescriptConnectionOptions]
    }
    
    extension [Self <: NativescriptConnectionOptions](x: Self) {
      
      inline def setAndroidFlags(value: Double): Self = StObject.set(x, "androidFlags", value.asInstanceOf[js.Any])
      
      inline def setAndroidFlagsUndefined: Self = StObject.set(x, "androidFlags", js.undefined)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDriver(value: js.Any): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setIosFlags(value: Double): Self = StObject.set(x, "iosFlags", value.asInstanceOf[js.Any])
      
      inline def setIosFlagsUndefined: Self = StObject.set(x, "iosFlags", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMigrate(value: Boolean): Self = StObject.set(x, "migrate", value.asInstanceOf[js.Any])
      
      inline def setMigrateUndefined: Self = StObject.set(x, "migrate", js.undefined)
      
      inline def setMultithreading(value: Boolean): Self = StObject.set(x, "multithreading", value.asInstanceOf[js.Any])
      
      inline def setMultithreadingUndefined: Self = StObject.set(x, "multithreading", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setType(value: nativescript): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
