package typings.typeorm.betterSqlite3BetterSqlite3ConnectionOptionsMod

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.`better-sqlite3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BetterSqlite3ConnectionOptions
  extends BaseConnectionOptions
     with ConnectionOptions {
  
  /**
    * Storage type or path to the storage.
    */
  val database: String = js.native
  
  /**
    * If the database does not exist, an Error will be thrown instead of creating a new file.
    * This option does not affect in-memory or readonly database connections.
    * Default: false.
    */
  val fileMustExist: js.UndefOr[Boolean] = js.native
  
  /**
    * Encryption key for for SQLCipher.
    */
  val key: js.UndefOr[String] = js.native
  
  /**
    * Function to run before a database is used in typeorm.
    * You can set pragmas, register plugins or register
    * functions or aggregates in this function.
    */
  val prepareDatabase: js.UndefOr[js.Function1[/* db */ js.Any, Unit | js.Promise[Unit]]] = js.native
  
  /**
    * Open the database connection in readonly mode.
    * Default: false.
    */
  val readonly: js.UndefOr[Boolean] = js.native
  
  /**
    * Cache size of sqlite statement to speed up queries.
    * Default: 100.
    */
  val statementCacheSize: js.UndefOr[Double] = js.native
  
  /**
    * The number of milliseconds to wait when executing queries
    * on a locked database, before throwing a SQLITE_BUSY error.
    * Default: 5000.
    */
  val timeout: js.UndefOr[Double] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_BetterSqlite3ConnectionOptions: `better-sqlite3` = js.native
  
  /**
    * Provide a function that gets called with every SQL string executed by the database connection.
    */
  val verbose: js.UndefOr[js.Function] = js.native
}
object BetterSqlite3ConnectionOptions {
  
  @scala.inline
  def apply(database: String, `type`: `better-sqlite3`): BetterSqlite3ConnectionOptions = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BetterSqlite3ConnectionOptions]
  }
  
  @scala.inline
  implicit class BetterSqlite3ConnectionOptionsOps[Self <: BetterSqlite3ConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: `better-sqlite3`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileMustExist(value: Boolean): Self = this.set("fileMustExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileMustExist: Self = this.set("fileMustExist", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPrepareDatabase(value: /* db */ js.Any => Unit | js.Promise[Unit]): Self = this.set("prepareDatabase", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrepareDatabase: Self = this.set("prepareDatabase", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setStatementCacheSize(value: Double): Self = this.set("statementCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatementCacheSize: Self = this.set("statementCacheSize", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setVerbose(value: js.Function): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
