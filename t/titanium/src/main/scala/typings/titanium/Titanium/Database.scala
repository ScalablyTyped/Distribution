package typings.titanium.Titanium

import typings.titanium.Titanium.Database.DB
import typings.titanium.Titanium.Database.ResultSet
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    			 * A `File` object representing the file where this database is stored. Must only be used for
    			 * setting file properties.
    			 */
    val file: File = js.native
    /**
    			 * The identifier of the last populated row.
    			 */
    var lastInsertRowId: Double = js.native
    /**
    			 * The name of the database.
    			 */
    var name: String = js.native
    /**
    			 * The number of rows affected by the last query.
    			 */
    var rowsAffected: Double = js.native
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
    def execute(sql: String, vararg: String): ResultSet = js.native
    def execute(sql: String, vararg: js.Any): ResultSet = js.native
    def execute(sql: String, vararg: js.Array[_ | String]): ResultSet = js.native
    /**
    			 * Gets the value of the <Titanium.Database.DB.file> property.
    			 */
    def getFile(): File = js.native
    /**
    			 * Gets the value of the <Titanium.Database.DB.lastInsertRowId> property.
    			 */
    def getLastInsertRowId(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Database.DB.name> property.
    			 */
    def getName(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Database.DB.rowsAffected> property.
    			 */
    def getRowsAffected(): Double = js.native
    /**
    			 * Removes the database files for this instance from disk. WARNING: this is a destructive
    			 * operation and cannot be reversed. All data in the database will be lost; use with caution.
    			 */
    def remove(): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Database.DB.lastInsertRowId> property.
    			 */
    def setLastInsertRowId(lastInsertRowId: Double): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Database.DB.name> property.
    			 */
    def setName(name: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Database.DB.rowsAffected> property.
    			 */
    def setRowsAffected(rowsAffected: Double): Unit = js.native
  }
  
  /**
  		 * The ResultSet instance returned by <Titanium.Database.DB.execute>.
  		 */
  @js.native
  trait ResultSet extends Proxy {
    /**
    			 * The number of columns in this result set.
    			 */
    val fieldCount: Double = js.native
    /**
    			 * The number of rows in this result set.
    			 */
    val rowCount: Double = js.native
    /**
    			 * Indicates whether the current row is valid.
    			 */
    val validRow: Boolean = js.native
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
    			 * Returns the field name for the specified field index.
    			 */
    def fieldName(index: Double): String = js.native
    /**
    			 * Gets the value of the <Titanium.Database.ResultSet.fieldCount> property.
    			 */
    def getFieldCount(): Double = js.native
    /**
    			 * Returns the field name for the specified field index.
    			 */
    def getFieldName(index: Double): String = js.native
    /**
    			 * Gets the value of the <Titanium.Database.ResultSet.rowCount> property.
    			 */
    def getRowCount(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Database.ResultSet.validRow> property.
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
  }
  
  /**
  		 * Constant for requesting a column's value returned in double form.
  		 */
  val FIELD_TYPE_DOUBLE: Double = js.native
  /**
  		 * Constant for requesting a column's value returned in float form.
  		 */
  val FIELD_TYPE_FLOAT: Double = js.native
  /**
  		 * Constant for requesting a column's value returned in integer form.
  		 */
  val FIELD_TYPE_INT: Double = js.native
  /**
  		 * Constant for requesting a column's value returned in string form.
  		 */
  val FIELD_TYPE_STRING: Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Database.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Database.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Database.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Installs an SQLite database to device's internal storage.
  		 */
  def install(path: String, dbName: String): DB = js.native
  /**
  		 * Opens an SQLite database.
  		 */
  def open(dbName: String): DB = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Database.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Database.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Database.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

