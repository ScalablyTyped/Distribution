package typings.titanium.Titanium

import typings.titanium.PossibleBatchQueryError
import typings.titanium.Titanium.Filesystem.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level `Database` module, used for creating and accessing the
  * in-application SQLite database.
  */
@JSGlobal("Titanium.Database")
@js.native
object Database extends js.Object {
  
  /**
    * The `Database` instance returned by <Titanium.Database.open> or <Titanium.Database.install>.
    */
  @js.native
  trait DB extends Proxy {
    
    /**
      * Closes the database and releases resources from memory. Once closed, this instance is no
      * longer valid and should not be used. On iOS, also closes all <Titanium.Database.ResultSet>
      * instances that exist.
      */
    def close(): Unit = js.native
    
    /**
      * Executes an SQL statement against the database and returns a `ResultSet`.
      */
    def execute(sql: String): ResultSet = js.native
    /**
      * Executes an SQL statement against the database and returns a `ResultSet`.
      */
    def execute(sql: String, vararg: (js.Any | String)*): ResultSet = js.native
    def execute(sql: String, vararg: js.Array[_ | String]): ResultSet = js.native
    
    /**
      * Synchronously executes an array of SQL statements against the database and returns an array of `ResultSet`.
      * On failure, this will throw an [Error](BatchQueryError) that reports the failed index and partial results
      */
    def executeAll(queries: js.Array[String]): js.Array[ResultSet] = js.native
    
    /**
      * Asynchronously executes an array of SQL statements against the database and fires a callback with a possible Error, and an array of `ResultSet`.
      * On failure, this will call the callback with an [Error](PossibleBatchQueryError) that reports the failed index, and a second argument with the partial results
      */
    def executeAllAsync(
      queries: js.Array[String],
      callback: js.Function2[/* param0 */ PossibleBatchQueryError, /* param1 */ js.Array[ResultSet], Unit]
    ): Unit = js.native
    
    /**
      * Asynchronously executes an SQL statement against the database and fires a callback with a possible `Error` argument, and a second argument holding a possible `ResultSet`.
      */
    def executeAsync(query: String): Unit = js.native
    def executeAsync(
      query: String,
      vararg: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* param0 */ js.Any, /* param1 */ ResultSet, Unit]
    ): Unit = js.native
    def executeAsync(query: String, vararg: js.Any): Unit = js.native
    def executeAsync(
      query: String,
      vararg: js.Any,
      callback: js.Function2[/* param0 */ js.Any, /* param1 */ ResultSet, Unit]
    ): Unit = js.native
    
    /**
      * A `File` object representing the file where this database is stored. Must only be used for
      * setting file properties.
      */
    val file: File = js.native
    
    /**
      * Gets the value of the <Titanium.Database.DB.file> property.
      * @deprecated Access <Titanium.Database.DB.file> instead.
      */
    def getFile(): File = js.native
    
    /**
      * Gets the value of the <Titanium.Database.DB.lastInsertRowId> property.
      * @deprecated Access <Titanium.Database.DB.lastInsertRowId> instead.
      */
    def getLastInsertRowId(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.Database.DB.name> property.
      * @deprecated Access <Titanium.Database.DB.name> instead.
      */
    def getName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Database.DB.rowsAffected> property.
      * @deprecated Access <Titanium.Database.DB.rowsAffected> instead.
      */
    def getRowsAffected(): Double = js.native
    
    /**
      * The identifier of the last populated row.
      */
    val lastInsertRowId: Double = js.native
    
    /**
      * The name of the database.
      */
    val name: String = js.native
    
    /**
      * Removes the database files for this instance from disk. WARNING: this is a destructive
      * operation and cannot be reversed. All data in the database will be lost; use with caution.
      */
    def remove(): Unit = js.native
    
    /**
      * The number of rows affected by the last query.
      */
    val rowsAffected: Double = js.native
  }
  
  /**
    * The ResultSet instance returned by <Titanium.Database.DB.execute>.
    */
  @js.native
  trait ResultSet extends Proxy {
    
    /**
      * Closes this result set and release resources. Once closed, the result set must no longer
      * be used.
      */
    def close(): Unit = js.native
    
    /**
      * Retrieves the value for the specified field in the current row,
      * and casts it to the specified type (String, Integer, Float or Double.)
      */
    def field(index: Double): String | Double | Blob = js.native
    def field(index: Double, `type`: Double): String | Double | Blob = js.native
    
    /**
      * Retrieves the value for the specified field in the current row,
      * and casts it to the specified type (String, Integer, Float or Double.)
      */
    def fieldByName(name: String): String | Double | Blob = js.native
    def fieldByName(name: String, `type`: Double): String | Double | Blob = js.native
    
    /**
      * The number of columns in this result set.
      */
    val fieldCount: Double = js.native
    
    /**
      * Returns the field name for the specified field index.
      */
    def fieldName(index: Double): String = js.native
    
    /**
      * Gets the value of the <Titanium.Database.ResultSet.fieldCount> property.
      * @deprecated Access <Titanium.Database.ResultSet.fieldCount> instead.
      */
    def getFieldCount(): Double = js.native
    
    /**
      * Returns the field name for the specified field index.
      */
    def getFieldName(index: Double): String = js.native
    
    /**
      * Gets the value of the <Titanium.Database.ResultSet.rowCount> property.
      * @deprecated Access <Titanium.Database.ResultSet.rowCount> instead.
      */
    def getRowCount(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.Database.ResultSet.validRow> property.
      * @deprecated Access <Titanium.Database.ResultSet.validRow> instead.
      */
    def getValidRow(): Boolean = js.native
    
    /**
      * Returns whether the current row is valid.
      */
    def isValidRow(): Boolean = js.native
    
    /**
      * Advances to the next row in the result set and returns `true` if one exists,
      * or `false` otherwise.
      */
    def next(): Boolean = js.native
    
    /**
      * The number of rows in this result set.
      */
    val rowCount: Double = js.native
    
    /**
      * Indicates whether the current row is valid.
      */
    val validRow: Boolean = js.native
  }
}
