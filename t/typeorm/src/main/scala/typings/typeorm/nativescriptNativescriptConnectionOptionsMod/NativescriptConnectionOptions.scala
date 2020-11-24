package typings.typeorm.nativescriptNativescriptConnectionOptionsMod

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.nativescript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class NativescriptConnectionOptionsOps[Self <: NativescriptConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriver(value: js.Any): Self = this.set("driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: nativescript): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidFlags(value: Double): Self = this.set("androidFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidFlags: Self = this.set("androidFlags", js.undefined)
    
    @scala.inline
    def setIosFlags(value: Double): Self = this.set("iosFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosFlags: Self = this.set("iosFlags", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMigrate(value: Boolean): Self = this.set("migrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrate: Self = this.set("migrate", js.undefined)
    
    @scala.inline
    def setMultithreading(value: Boolean): Self = this.set("multithreading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultithreading: Self = this.set("multithreading", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
}
