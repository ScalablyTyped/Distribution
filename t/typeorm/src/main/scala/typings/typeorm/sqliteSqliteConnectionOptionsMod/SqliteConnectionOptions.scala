package typings.typeorm.sqliteSqliteConnectionOptionsMod

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.sqlite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqliteConnectionOptions
  extends BaseConnectionOptions
     with ConnectionOptions {
  
  /**
    * In your SQLite application when you perform parallel writes its common to face SQLITE_BUSY error.
    * This error indicates that SQLite failed to write to the database file since someone else already writes into it.
    * Since SQLite cannot handle parallel saves this error cannot be avoided.
    *
    * To simplify life's of those who have this error this particular option sets a timeout within which ORM will try
    * to perform requested write operation again and again until it receives SQLITE_BUSY error.
    *
    * Enabling WAL can improve your app performance and face less SQLITE_BUSY issues.
    * Time in milliseconds.
    */
  val busyErrorRetry: js.UndefOr[Double] = js.native
  
  /**
    * Storage type or path to the storage.
    */
  val database: String = js.native
  
  /**
    * Enables WAL mode. By default its disabled.
    *
    * @see https://www.sqlite.org/wal.html
    */
  val enableWAL: js.UndefOr[Boolean] = js.native
  
  /**
    * Encryption key for for SQLCipher.
    */
  val key: js.UndefOr[String] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_SqliteConnectionOptions: sqlite = js.native
}
object SqliteConnectionOptions {
  
  @scala.inline
  def apply(database: String, `type`: sqlite): SqliteConnectionOptions = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqliteConnectionOptions]
  }
  
  @scala.inline
  implicit class SqliteConnectionOptionsOps[Self <: SqliteConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: sqlite): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusyErrorRetry(value: Double): Self = this.set("busyErrorRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusyErrorRetry: Self = this.set("busyErrorRetry", js.undefined)
    
    @scala.inline
    def setEnableWAL(value: Boolean): Self = this.set("enableWAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableWAL: Self = this.set("enableWAL", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
