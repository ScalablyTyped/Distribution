package typings.typeorm.sqljsConnectionOptionsMod

import typings.std.Uint8Array
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.sqljs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqljsConnectionOptions
  extends BaseConnectionOptions
     with ConnectionOptions {
  
  /**
    * Enables the autoSave mechanism which either saves to location
    * or calls autoSaveCallback every time a change to the database is made.
    */
  val autoSave: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that gets called on every change instead of the internal autoSave function.
    * autoSave has to be enabled for this to work.
    */
  val autoSaveCallback: js.UndefOr[js.Function] = js.native
  
  /**
    * A Uint8Array that gets imported when the connection is opened.
    */
  val database: js.UndefOr[Uint8Array] = js.native
  
  /**
    * File path (Node.js) or local storage key (browser) to load and save database from.
    * If this is specified without autoSave, the database is loaded from the location
    * and can be saved manually via the SqljsEntityManager. If autoSave is enabled,
    * location is used to automatically save the database.
    */
  val location: js.UndefOr[String] = js.native
  
  /**
    * Config that's used to initialize sql.js.
    */
  val sqlJsConfig: js.UndefOr[js.Any] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_SqljsConnectionOptions: sqljs = js.native
  
  /**
    * Enables the usage of the localforage library to save & load the database asynchronously from the
    * indexedDB instead of using the synchron local storage methods in a browser environment.
    */
  val useLocalForage: js.UndefOr[Boolean] = js.native
}
object SqljsConnectionOptions {
  
  @scala.inline
  def apply(`type`: sqljs): SqljsConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqljsConnectionOptions]
  }
  
  @scala.inline
  implicit class SqljsConnectionOptionsOps[Self <: SqljsConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: sqljs): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSave(value: Boolean): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    
    @scala.inline
    def setAutoSaveCallback(value: js.Function): Self = this.set("autoSaveCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSaveCallback: Self = this.set("autoSaveCallback", js.undefined)
    
    @scala.inline
    def setDatabase(value: Uint8Array): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setSqlJsConfig(value: js.Any): Self = this.set("sqlJsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlJsConfig: Self = this.set("sqlJsConfig", js.undefined)
    
    @scala.inline
    def setUseLocalForage(value: Boolean): Self = this.set("useLocalForage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLocalForage: Self = this.set("useLocalForage", js.undefined)
  }
}
