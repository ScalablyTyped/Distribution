package typings.typeorm

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.nativescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativescriptNativescriptConnectionOptionsMod {
  
  @js.native
  trait NativescriptConnectionOptions
    extends BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Flags to pass to SQLite when opening the database on Android. (see https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.html)
      */
    val androidFlags: js.UndefOr[Double] = js.native
    
    /**
      * Database name.
      */
    val database: String = js.native
    
    /**
      * The driver object
      * you should pass `require('nativescript-sqlite') here
      */
    val driver: js.Any = js.native
    
    /**
      * Flags to pass to SQLite when opening the database on iOS. (see https://www.sqlite.org/c3ref/open.html)
      */
    val iosFlags: js.UndefOr[Double] = js.native
    
    /**
      * The key to use for for using/opening encrypted databases. (requires the "Encrypted Plugin")
      */
    val key: js.UndefOr[String] = js.native
    
    /**
      * Migrates a Encrypted Sql database from v3 to the new v4. If you are a new user you do not need to set this flag as new created databases will already be in v4.
      * If you are upgrading a app that used v1.3.0 or earlier of NS-Sqlite-Encrypted; then you will probably want to set this flag to true. (requires the "Encrypted Plugin")
      */
    val migrate: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to enable background multitasking. All SQL is ran on a background worker thread. (requires the "Commercial Plugin")
      */
    val multithreading: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to mark the mark the database as read only on open (iOS only).
      */
    val readOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_NativescriptConnectionOptions: nativescript = js.native
  }
  object NativescriptConnectionOptions {
    
    @scala.inline
    def apply(database: String, driver: js.Any, `type`: nativescript): NativescriptConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativescriptConnectionOptions]
    }
    
    @scala.inline
    implicit class NativescriptConnectionOptionsMutableBuilder[Self <: NativescriptConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroidFlags(value: Double): Self = StObject.set(x, "androidFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidFlagsUndefined: Self = StObject.set(x, "androidFlags", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriver(value: js.Any): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosFlags(value: Double): Self = StObject.set(x, "iosFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosFlagsUndefined: Self = StObject.set(x, "iosFlags", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMigrate(value: Boolean): Self = StObject.set(x, "migrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrateUndefined: Self = StObject.set(x, "migrate", js.undefined)
      
      @scala.inline
      def setMultithreading(value: Boolean): Self = StObject.set(x, "multithreading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultithreadingUndefined: Self = StObject.set(x, "multithreading", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setType(value: nativescript): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
